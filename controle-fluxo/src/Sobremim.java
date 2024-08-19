import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class Sobremim {
    public static void main(String[] args) {

        try {
            // CRIANDO OBJETO SCANNER
            Scanner sc = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Digite seu nome:");
            String nome = sc.next();

            System.out.println("Digite seu sobrenome:");
            String sobrenome = sc.next();

            System.out.println("Digite sua idade:");
            int idade = sc.nextInt();

            System.out.println("Digite sua altura:");
            double altura = sc.nextDouble();

            System.out.println("Nome completo: " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Idade: " + idade);
            System.out.println("Altura: " + altura);
            sc.close();
            /*
             * Execption e, para pegar qualquer tipo de exceção e trata-la, porém aqui estou
             * especificando o tipo do erro que estou tendo (o erro grotesco que é jogado no
             * console ao digitar algo não esperado, como um caracter no campo que espera um
             * número), quero pegar esse erro caso aconteça e exibir apens essa msg
             */
        } catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser númericos");
        }

    }
}
