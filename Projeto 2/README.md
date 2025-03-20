1. Princípio da Responsabilidade Única (SRP):

-> Código errado:

A classe Relatorio gera e também salva o relatório no banco de dados, misturando responsabilidades.

-> Correção:

Criamos duas classes separadas: RelatorioGerador para gerar o relatório e RelatorioRepositorio para salvar no banco.



2. Princípio Aberto-Fechado (OCP):

->  Código errado:

A classe CalculadoraSalario verifica manualmente cada cargo dentro de um if, tornando-se difícil de manter quando novos cargos são adicionados.

-> Correção:

Criamos uma interface Cargo e implementamos classes específicas para cada cargo, permitindo a extensão sem modificar a classe existente.



3. Princípio da Substituição de Liskov (LSP):

-> Código errado:

A classe Quadrado estende Retangulo, mas altera seu comportamento, tornando imprevisível a definição de altura e largura.

-> Correção:

Criamos uma interface Forma e implementamos RetanguloCorreto e QuadradoCorreto separadamente, garantindo substituição adequada.



4. Princípio da Segregação de Interfaces (ISP):

-> Código errado:

A interface Trabalhador contém métodos programar e gerenciar, mas um desenvolvedor não deveria precisar implementar gerenciar.

-> Correção:

Criamos interfaces separadas (Programador e Gerente), garantindo que cada classe implemente apenas o necessário.



5. Princípio da Inversão de Dependência (DIP):

-> Código errado:

A classe CarroErrado instancia diretamente um Motor, criando uma dependência concreta.

-> Correção:

Criamos uma interface IMotor, permitindo que CarroCorreto dependa da abstração e não da implementação concreta.
