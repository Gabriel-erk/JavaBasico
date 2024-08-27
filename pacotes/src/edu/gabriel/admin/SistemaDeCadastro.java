package edu.gabriel.admin;

import edu.gabriel.admin.pessoa.Pessoa;

public class SistemaDeCadastro {
    /* 
     * códigos que executam ações não podem ser colocados no corpo da classe
     * no java, todo código que executa ações (como criar objetos chamar métodos), devem ser colocados dentro de um bloco de código inicializável, como o bloco 'main'
     *  a váriavel philip esta sendo declarada como membro da classe, mas a operação setEndereco e a própria criação do objeto precisam estar dentro de um bloco de código executável
     * se pergunte, quando tiver um erro desses, o que estou tentando fazer? é uma ação? se for, lembre do bloco main, fica aqui comentado esse meu erro apenas de exemplo, tudo que for operação, ação (como criar objeto ou chamar um método, deve estar no método main, ou em algum outro método, deve estar em um bloco de código que possa ser executável (um método pode ser executado) main(que também é um método, também pode))
    */
    // Pessoa philip = new Pessoa("philip", "123456");
    // philip.setEndereco("Rua dos palmares, 576");

    public static void main(String[] args) {
        Pessoa philip = new Pessoa("philip", "123456");
        philip.setEndereco("Rua dos palmares, 576");
    }
}
