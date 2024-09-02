package edu.gabriel.exemploEncapsulamento.app;

import java.util.Scanner;

public class Facebook extends ServicoMsgInstantanea {

    private Scanner sc;

    public Facebook(Scanner sc) {
        this.sc = sc;
    }

    public void enviarMensagem() {

        validarConectadoInternet();

        System.out.println("digite a mensagem:");

        String mensagem = sc.nextLine();
        System.out.println("enviando " + mensagem + " pelo face");

        salvarHistoricoMensagem();

    }

    public void recebendoMensagem() {
        System.out.println("mensagem recebida pelo facebook");
    }

    protected void salvarHistoricoMensagem() {
        System.out.println("salvando histórico de msg");
    }
}
