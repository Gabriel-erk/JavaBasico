import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    /*
    * static quer dizer que o método main é estático, não precisa de uma instância da classe "ContaTerminal" para chama-lo
    * throws exception indica que o método main pode lançar uma exceção( devido algum erro durante a execução do programa) e que ele não conseguiu lidar, e essa exceção não será trada dentro do método, mas propagada para o chamador do método
    * um bom motivo para usar é deixar declarado que seu código pode sim gerar uma exceção (muitas vezes problemas de entrada e sáida (I/O), operações matemáticas inválidas(como passar uma string onde a váriavel espera um int)etc.)
    */
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe o número:");
        int numero = sc.nextInt();
        System.out.println("Informe a agência:");
        String agencia = sc.next();
        System.out.println("Informe o nome do cliente:");
        String nomeCliente = sc.next();
        System.out.println("Informe o saldo dísponivel:");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque" );

        sc.close();
    }
}