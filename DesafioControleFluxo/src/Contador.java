import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor inicial:");
        int valorInicial = sc.nextInt();
        System.out.println("Digite o valor final:");
        int valorFinal = sc.nextInt();
        // necessário uso de try catch já que estou mechendo com uma execption
        try {
            contaNumeros(valorInicial, valorFinal);
        } catch (ParametrosInvalidosExecpiton e){
            System.out.println("o segundo parametro deve ser maior que o primeiro");
        }

        sc.close();
    }

    /*
     * este método pode me retornar uma exceção, por isso, throws ParametrosInvalidosException (é o tipo de erro que pode me retornar, neste cenário, o usuário passar o segundo valor menor que o primeiro, e esta execção vai deixa-lo ciente disso)
     */
    static void contaNumeros(int valorUm, int valorDois) throws ParametrosInvalidosExecpiton {
        // se o valor um for maior que o valor dois, dispare uma nova exceção do tipo parametrosinvalidosexception, que vai fazer entrar no catch (localizado no main), e mostrará a mensagem que deixei
        if (valorUm > valorDois) {
            throw new ParametrosInvalidosExecpiton();
        }
        // valorDois - valorUm pois primeiro retira o menor numero do maior numero para não dar negativo
        int contagem = valorDois - valorUm;
        for (int i = 0; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
