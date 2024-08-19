import java.util.Random;

public class EstruturaDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando....");

        /*
        * do while precisa ser executado pelo menos uma vez para ele verificar a condição, então, irá executar pelo menos uma vez, mesmo se a condição for falsa 
        */
        do {
            System.out.println("Telefone tocando");
        } while(tocando());

        // quando a condição do while (o método) retornar false, isso será executado
        System.out.println("Alô !!!");
    }   

    private static boolean tocando(){
        // váriavel atendeu vai ter o valor aleatório entre 1 e tres, e se for igual a 1 significa que ele atendeu (como se fosse um true)
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);

        // negando o ato de continuar tocando, quando este return acontecer, é pq não quero mais que continue tocando, não quero que este método continue sendo executado
        /*
        * enquanto a váriavel não obtiver o valor = 1, ela terá o valor de "false", encontrará este return, que inverte seu valor (ou seja, vira true, e continua executando o do while) - quanto a váriavel obtiver o valor = 1, ela será "true", econtrará o return, invertera seu valor (para false) e encerrará o do while, pois a condição já não é mais verdadeira
        */
        return ! atendeu;
    }
}
