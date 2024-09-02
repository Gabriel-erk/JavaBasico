package edu.gabriel.exemploEncapsulamento.app;
import java.util.Scanner;
public class Telegram extends ServicoMsgInstantanea {
    private Scanner sc;

    public Telegram(Scanner sc){
        this.sc = sc;
    }

    public void enviarMensagem() {

        validarConectadoInternet();

        System.out.println("digite a mensagem:");
        String mensagem = sc.nextLine();
        System.out.println("enviando " + mensagem + " pelo telegram");
        salvarHistoricoMensagem();

    }

    public void recebendoMensagem() {
        System.out.println("mensagem recebida pelo telegram");
    }

    protected void salvarHistoricoMensagem(){
        System.out.println("salvando histórico de msg");
    }
}
