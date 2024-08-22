import java.util.Scanner;

public class VerificacaoServico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();

        // Entrada do nome do cliente e os serviços contratados - trim remove os espaços
        // em branco da string inteira - nextLine pega a linha inteira digitada pelo
        // usuário
        String entradaCliente = scanner.nextLine().trim();

        // Separando o nome do cliente e os serviços contratados, cada elemento após a
        // virgula será considerado um elemento, ex de entrada: maria, joão, roger -
        // string partes posição 0: maria, posição 1: joao, posição 2: roger
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];

        // inicializando váriavel que vai determinar se tem servico ou não
        boolean temServicoOuNao = false;

        // percorre todas as posições do array do tipo string partes, a partir da posição 1
        for (int i = 1; i < partes.length; i++) {
            // váriavel recebe true, se alguma posição de partes contiver o valor igual a váriavel servico, e false se não tiver - método equalsIgnoreCase é para comparar o valor de duas strings e ver se os seus valores são iguais ignorando a diferença entre letras maiúsculas e minúsculas e retorna true ou false
            temServicoOuNao = partes[i].equalsIgnoreCase(servico);
            if (temServicoOuNao) {
                break;
            }
        }

        if (temServicoOuNao) {
            System.out.println("Cliente: " + nomeCliente);
            System.out.println("Resultado: " + temServicoOuNao);
        } else {
            System.out.println("Cliente: " + nomeCliente);
            System.out.println("Resultado: " + temServicoOuNao);
        }

        scanner.close();
    }

}