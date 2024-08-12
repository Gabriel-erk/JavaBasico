//  indicando a qual pacote/sub-diretorio pertence este arquivo java(este pacote/esta classe java)
package edu.gabriel.primeirasemana;

public class BoletimEstudantil {
    public static void main(String[] args){
        int mediaFinal = 7;

        if (mediaFinal < 6) {
            System.out.println("REPROVADO");
        } else if (mediaFinal == 6) {
            System.out.println("PROVA MINERVA");
        } else {
            System.out.println("APROVADO");
        }
    }
}
