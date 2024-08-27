package edu.gabriel.admin.pessoa;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    /*
     * criando um método construtor, para pedirmos, na instanciação do objeto, que passem os valores dos atributos do tipo string, nome e cpf OBRIGATORIAMENTE - Pessoa novoObjeto = new Pessoa(Carlos, 123456)
     * não temos os setters de nome, nem de cpf, logo, não conseguimos ACESSAR nem ALTERAR estes valores
     * diferente dos métodos comuns, o construtor não retorna nada, é público para toda aplicação e o seu nome tem de ser idêntico ao nome da classe
     * não abuse de construtores, por mais que a linguagem permita, não é uma boa prática
     * utilizar construtores em contextos como: o que é importante, o que é RELEVANTE, ESSENCIAL para que haja a instância/criação de objeto da minha classe? como por ex: para um aluno, é o seu NOME e a sua MATRÍCULA, os outros dados, como idade, cpf, podem ser dados em um segundo momento, diferente de NOME e MATRÍCULA eles não tem que estar em um construtor
     */
    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    /*
     * exemplo de construtor sem nenhum parâmetro
     * agora temos 2 construtores, podemos instanciar um objeto com nenhum parâmetro, ou com os parâmetros que consideramos essenciais
     * recomendado por aplicação ter somente 2 construtores, um com parãmetros essenciais e outro sem, mais que isso já foge das boas práticas do javaBeans
     */
    public Pessoa(){
        super();
    }
    
    public String getNome() {
        return nome;
    }
  
    public String getCpf() {
        return cpf;
    }
  
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
