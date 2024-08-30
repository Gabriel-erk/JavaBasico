package edu.gabriel.exemploEncapsulamento.app;

import java.util.Scanner;

public class Facebook extends ServicoMsgInstantanea {
    public void recebendoMensagem() {
        System.out.println("mensagem recebida pelo facebook");
    }

    public void enviarMensagem() {

        Scanner sc = new Scanner(System.in);

        validarConectadoInternet();
        System.out.println("digite a mensagem:");
        String mensagem = sc.nextLine();
        System.out.println("enviando " + mensagem + " pelo msn");
        salvarHistoricoMensagem();

        sc.close();

    }

    protected void salvarHistoricoMensagem(){
        System.out.println("salvando histórico de msg");
    }
}
