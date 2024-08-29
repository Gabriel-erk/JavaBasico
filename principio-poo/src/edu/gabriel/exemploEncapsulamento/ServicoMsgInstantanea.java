package edu.gabriel.exemploEncapsulamento;

import java.util.Scanner;

public class ServicoMsgInstantanea {
    public void enviarMensagem() {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite a mensagem:");
        String mensagem = sc.nextLine();
        System.out.println("enviando " + mensagem);

        sc.close();
    }

    public void validarConectadoInternet() {
        System.out.println("validando conexão com net");
    }

    public void salvarHistoricoMensagem() {
        System.out.println("salvando histórico de msg");
    }

    public void recebendoMensagem() {
        System.out.println("mensagem recebida");
    }
}
