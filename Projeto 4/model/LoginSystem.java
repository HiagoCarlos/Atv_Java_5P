package model;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class LoginSystem {
    private static LoginSystem instancia;
    private Map<String, String> usuarios; // username -> hashed password
    private String codigoAtual;

    private LoginSystem() {
        usuarios = new HashMap<>();
    }

    public static LoginSystem getInstance() {
        if (instancia == null) {
            instancia = new LoginSystem();
        }
        return instancia;
    }

    public void cadastrarUsuario(String usuario, String senha) {
        usuarios.put(usuario, hashPassword(senha));
    }

    public String gerarCodigoVerificacao() {
        String caracteres = "ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnpqrstuvwxyz23456789!@#$%";
        Random random = new Random();
        StringBuilder codigo = new StringBuilder();

        for (int i = 0; i < 8; i++) {
            codigo.append(caracteres.charAt(random.nextInt(caracteres.length())));
        }

        this.codigoAtual = codigo.toString();
        return this.codigoAtual;
    }

    public boolean autenticar(String usuario, String senha, String codigo) {
        if (codigoAtual == null || !codigo.equals(this.codigoAtual)) {
            return false;
        }
        String hashedSenha = usuarios.get(usuario);
        return hashedSenha != null && hashedSenha.equals(hashPassword(senha));
    }

    private String hashPassword(String senha) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(senha.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if(hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Erro ao gerar hash da senha", e);
        }
    }
}