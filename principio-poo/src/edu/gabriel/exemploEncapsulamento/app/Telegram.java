package edu.gabriel.exemploEncapsulamento.app;
import java.util.Scanner;
public class Telegram extends ServicoMsgInstantanea {
    public void enviarMensagem() {

        validarConectadoInternet();
        Scanner sc = new Scanner(System.in);

        System.out.println("digite a mensagem:");
        String mensagem = sc.nextLine();
        System.out.println("enviando " + mensagem + " pelo telegram");
        salvarHistoricoMensagem();

        sc.close();
    }

    public void recebendoMensagem() {
        System.out.println("mensagem recebida pelo telegram");
    }

    protected void salvarHistoricoMensagem(){
        System.out.println("salvando histórico de msg");
    }
}
