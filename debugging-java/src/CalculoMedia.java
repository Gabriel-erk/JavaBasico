import java.util.Scanner;
import java.util.Locale;

public class CalculoMedia {
    public static void main(String[] args) throws Exception {
        String[] alunos = { "Gabriel", "Erick", "Vicente", "Ferreira" };
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        // com printf é possivel utilizar "%2.f" para limitar as casas decimais, no caso, limito em 2, e, após a virgula, já posso chamar uma váriavel ou método, coisa que o println não permite  
        // printf tem suporte integrado a formatação de strings, por isso pode-se formatá-las e manipula-las, por isso se tem mais "controle", coisa que println não tem, que é focado em imprimir strings e valores sem formatação especial, caso precise de formatação, terá que formatar o valor antes de passar para o método println (como por exemplo: String format) 
        System.out.printf("Média da turma %.2f ", calculaMedia(alunos, sc));
        
        sc.close();
    }

    public static double calculaMedia(String[] alunos, Scanner sc) {
        double soma = 0;

        for (String aluno : alunos) {
            System.out.println("Digite a nota do aluno(a) " + aluno);
            double nota = sc.nextDouble();

            soma += nota;
        }

        return soma / alunos.length;
    }
}
