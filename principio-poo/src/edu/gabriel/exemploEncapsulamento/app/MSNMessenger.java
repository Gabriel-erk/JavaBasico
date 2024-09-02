package edu.gabriel.exemploEncapsulamento.app;

import java.util.Scanner;

public class MSNMessenger extends ServicoMsgInstantanea {

    /*
     * atributo privado do tipo Scanner, para indicar para o meu construtor que oq
     * eu quero receber é do tipo scanner
     */
    private Scanner sc;

    /*
     * construtor pede um "valor" do tipo Scanner, então, para inicializar qualquer
     * coisa/instanciar qualquer coisa a partir dessa classe, é preciso passar um
     * valor do tipo Scanner
     * fazendo isso para reutilizar o "mesmo Scanner o sistema inteiro"
     */
    public MSNMessenger(Scanner sc) {
        // setando o valor do meu atributo privado scanner com o atributo passado para o
        // construtor
        this.sc = sc;
    }

    public void enviarMensagem() {

        validarConectadoInternet();
        System.out.println("digite a mensagem:");

        String mensagem = sc.nextLine();
        System.out.println("enviando " + mensagem + " pelo msn");

        /*
         * sc.hasNextLine() serve para, em casos onde eu esteja lendo múltiplas linhas, ele verificar se ainda tem uma linha dísponivel para ler, ou seja "se tem algo digitado no console para que ele possa ler", como estou lendo apenas uma única linha, não preciso utiliza-lo
         * ele pode evitar erros
         */
        // if (sc.hasNextLine()) {
        // String mensagem = sc.nextLine();
        // System.out.println("enviando " + mensagem + " pelo msn");
        // }
        salvarHistoricoMensagem();
    }

    public void recebendoMensagem() {
        System.out.println("mensagem recebida pelo msn");
    }

    protected void salvarHistoricoMensagem() {
        System.out.println("salvando histórico de msg");
    }
}
