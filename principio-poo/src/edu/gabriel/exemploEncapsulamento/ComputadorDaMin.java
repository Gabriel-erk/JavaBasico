package edu.gabriel.exemploEncapsulamento;

public class ComputadorDaMin {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();

        msn.enviarMensagem();
        msn.recebendoMensagem();

        Facebook fcb = new Facebook();

        fcb.enviarMensagem();
    }   
}
