import java.util.concurrent.ThreadLocalRandom;

public class EstruturaWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            // caso o valor aleatório gerado para a váriavel valorDoce for maior que o valor da mesada, invertem-se os valores, valorDoce fica com o menor valor (no caso, o valor de mesada), e programa segue normalmente
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }
            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada -= valorDoce;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
    }

    // método privado com retorno do tipo double
    /*
     * 'private' quer dizer que o método e suas váriaveis podem ser acessadas somente pela classe em que foram declaradas - não podem ser acessadas por outras classes (outros arquivos java) nem por subclasses (classes filhas) - mas, so pq estou com duvida, sim posso chama-la dentro ddesta minha classe estruturaWhile
     * modificador 'static' quer dizer que posso chamar o método sem um objeto (instância) da classe 'EstruturaWhile' - quer dizer que o médodo ou váriavel pertence a classe em si, e não a instância específica da classe
     * utilizados frequentemente para utilitários ou funções auxiliares que não dependem dos dados da instância, ex EstruturaWhile numero = new EstruturaWhile - numero.valorAleatorio() - não depende de valores passados na instancia do objeto numero
     * membros static são compartilhados entre todas as instancias da classe, eles têm apenas uma cópia na memória, independentemente de quantos objetos da classe existirem - q nem, existem vários objetos instanciados da minha classe estruturawhile, todos vão ter uma referência na memória igual para o método 'static', eles não mudam, se mudar o método, mudará para todas as instancias 
     */
    private static double valorAleatorio(){
        // váriavel thread local vai me dar um valor entre 2 e 8
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }
}
