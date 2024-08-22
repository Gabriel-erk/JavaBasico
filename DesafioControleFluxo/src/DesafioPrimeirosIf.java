import java.util.Scanner;

public class DesafioPrimeirosIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorSalario = sc.nextDouble();
        double valorBeneficios = sc.nextDouble();

        double valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100) {
            // calcula 5% de valorSalario - 0.05F significa 5%, e multiplicando pelo valor salário obtem-se 5% do mesmo
            valorImposto = 0.05F * valorSalario;
            // só verifica isso se a primeita condição for falsa
        } else if (valorSalario >= 1100.01 && valorSalario < 2500) {
            valorImposto = 0.10F * valorSalario;
            // só verifica se as outras forem falsas, e se elas forem falsas, é pq o salário é maior que 2500, e se for, coloca 15% de imposto
        } else {
            valorImposto = 0.15 * valorSalario;
        }

        double salarioTirandoImposto = valorSalario - valorImposto + valorBeneficios;

        System.out.printf("%.2f", salarioTirandoImposto);
        sc.close();
    }
}
