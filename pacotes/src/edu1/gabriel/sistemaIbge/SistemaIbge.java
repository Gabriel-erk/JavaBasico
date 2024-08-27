package edu1.gabriel.sistemaIbge;

import edu1.gabriel.sistemaIbge.estadoBrasileiro.EstadoBrasileiro;

public class SistemaIbge {
    public static void main(String[] args) {
        // listando todos os estados que temos
        /*
         * váriavel e do tipo estadoBrasileiro, vai receber as informações dos estados como um array, então na primeira iteração terá acesso ao método getSigla e getNome (somente esses métodos são públicos, não tem acesso ao construtor nem aos atributos diretamente já que são privados), na primeira iteração, getNome e getSigla serão correspondentes ao objeto constante SAO_PAULO na próximia RIO_JANEIRO e etc...
         *.values retorna um array de elementos definidos (objetos constantes) da classe EstadoBrasileiro do tipo Enum
         * a váriavel e não pode ser de outro tipo, a não ser EstadoBrasileiro, pois não consegue converter o valor de EstadoBrasileiro.values(), para outro tipo (provavelmente por ser Enum, onde converter, atrapalharia o fluxo do sistema)
         */
        for (EstadoBrasileiro e  : EstadoBrasileiro.values()) {
            System.out.println(e.getSigla() + " - " + e.getNome());
        }

        // objeto eb que representa o estao PIAUI - EstadoBrasileiro.NOMDOOBJETOCONSTANTE - notação '.' faz permite isso
        EstadoBrasileiro eb = EstadoBrasileiro.SAO_PAULO;
        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getNomeMaiusculo());
        System.out.println(eb.getCodigoIbge());
        // mostra o nome do objeto constante registrado no meu enum  
        // System.out.println(eb);
    }
}
