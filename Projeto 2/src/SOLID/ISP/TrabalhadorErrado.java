package src.SOLID.ISP;

//Princípio da Segregação de Interfaces (ISP) - Exemplo de código errado
interface TrabalhadorErrado {
    void programar();
    void gerenciar();
}


// Viola ISP pois uma interface impõe métodos desnecessários às classes.

// Código corrigido conforme ISP
interface Desenvolvedor {
    void programar();
}

interface Gerente {
    void gerenciar();
}

