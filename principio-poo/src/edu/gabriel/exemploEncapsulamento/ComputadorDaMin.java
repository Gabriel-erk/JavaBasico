package edu.gabriel.exemploEncapsulamento;

import edu.gabriel.exemploEncapsulamento.app.Facebook;
import edu.gabriel.exemploEncapsulamento.app.MSNMessenger;
import edu.gabriel.exemploEncapsulamento.app.ServicoMsgInstantanea;
import edu.gabriel.exemploEncapsulamento.app.Telegram;

public class ComputadorDaMin {
    public static void main(String[] args) {
        // MSNMessenger msn = new MSNMessenger();

        // msn.enviarMensagem();
        // msn.recebendoMensagem();

        // Facebook fcb = new Facebook();

        // fcb.enviarMensagem();
        // fcb.recebendoMensagem();

        // Telegram tlg = new Telegram();

        // tlg.enviarMensagem();
        // tlg.recebendoMensagem();

        /* POLIMORFISMO */

        /* recebe null pois não sabe qual app, mas qualquer um deverá enviar e receber msg (qualquer app criado a partir dele deve ter estes métodos) 
         * logo smi poderia : smi = tlg || smi = fcb, que ele iria executar o comando enviar msg e receber msg de acordo com o objeto q ele recebeu - este é o principio do polimorfismo, pode executar o mesmo método, porém de formas diferentes
         * se for msn vai enviar e receber msg pelo algoritmo do msn, fcb etcc
        */
        ServicoMsgInstantanea smi = null;
        String appEscolhido =
        "fcb";
        if (appEscolhido.equals("msn")) {
            smi = new MSNMessenger();
        } else if (appEscolhido.equals("fcb")) {
            smi = new Facebook();
        } else if (appEscolhido.equals("tlg")) {
            smi = new Telegram();
        }
        smi.enviarMensagem();
        smi.recebendoMensagem();

    }
}
