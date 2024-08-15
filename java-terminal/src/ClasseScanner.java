import java.util.Scanner;
import java.util.Locale;

public class ClasseScanner {
    public static void main(String[] args) {
        /*
         * dizendo que váriavel sc recebe um novo Scanner, que vai ler a entrada de
         * dados
         * locale é pra dizer que a convenção de dados é a americana, ou seja, padrão de
         * escrita americano, usando "." o inves da ","
         */
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        /*
         * next vai receber a próxima entrada do tipo string/pega o digitado na próxima execução e armazena na váriavel nome
         */
        System.out.println("Digite seu nome:");
        String nome = sc.next();
        System.out.println("Digite seu sobrenome:");
        String sobrenome = sc.next();
        // pede a idade e o scanner converte para int 
        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();
        System.out.println("Digite sua altura:");
        double altura = sc.nextDouble();

        
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        sc.close();

    }

}
