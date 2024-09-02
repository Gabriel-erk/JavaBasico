package edu.gabriel.exemploEncapsulamento;

import java.util.Scanner;

import edu.gabriel.exemploEncapsulamento.app.Facebook;
import edu.gabriel.exemploEncapsulamento.app.MSNMessenger;
import edu.gabriel.exemploEncapsulamento.app.ServicoMsgInstantanea;
import edu.gabriel.exemploEncapsulamento.app.Telegram;

public class ComputadorDaMin {
    public static void main(String[] args) {
        /*
         * criando uma váriavel do tipo Scanner aqui, e passando para o construtor das classes
         * já que esse é um comando presente em toda a aplicação, porque não aplicar os conceitoss de polimorfismo neles?
         * ao usar sc.close em cada classe, ele fechava a entrada de dados de TODO o sistema, então, fazendo assim, além de ser reutilizável, eu evito esse problema, já que, ao chamar msn, executar e fechar o scanner, eu não conseguia "abrir" ele de novo, e me gerava um erro, reutilizando o scanner para todo o sistema, evito um fechamento prematuro do fluxo de entrada
         */
        Scanner sc = new Scanner(System.in);

        MSNMessenger msn = new MSNMessenger(sc);

        msn.enviarMensagem();
        msn.recebendoMensagem();

        Facebook fcb = new Facebook(sc);

        fcb.enviarMensagem();
        fcb.recebendoMensagem();

        Telegram tlg = new Telegram(sc);

        tlg.enviarMensagem();
        tlg.recebendoMensagem();

        /* POLIMORFISMO */

        /* recebe null pois não sabe qual app, mas qualquer um deverá enviar e receber msg (qualquer app criado a partir dele deve ter estes métodos) 
         * logo smi poderia : smi = tlg || smi = fcb, que ele iria executar o comando enviar msg e receber msg de acordo com o objeto q ele recebeu - este é o principio do polimorfismo, pode executar o mesmo método, porém de formas diferentes
         * se for msn vai enviar e receber msg pelo algoritmo do msn, fcb etcc
        */
        ServicoMsgInstantanea smi = null;
        String appEscolhido =
        "fcb";
        if (appEscolhido.equals("msn")) {
            smi = new MSNMessenger(sc);
        } else if (appEscolhido.equals("fcb")) {
            smi = new Facebook(sc);
        } else if (appEscolhido.equals("tlg")) {
            smi = new Telegram(sc);
        }
        smi.enviarMensagem();
        smi.recebendoMensagem();

        /*
         * utilizo o close aqui, pois é somente neste ponto que quero encerrar o meu Scanner, é somente aqui que quero fechar o Scanner do sistema inteiro (somente quando o sistema inteiro tiver sido executado, por isso, coloco aqui, na minha classe "executável", e não fecho o Scanner do sistema sempre q executo uma classe filha de Servico)
         */
        sc.close();
    }
}
