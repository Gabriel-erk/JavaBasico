public class ExemploBreakContinue {
    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            if (i == 3) {
                /*
                * continue pula a execução atual, ou seja, quando for igual a 3, e executar o continue, a execução atual é cancelada e irá voltar para o inicio do for, incrementando o valor de i, ele não chega a sair do if e olhar o próximo comando, a execução atual é terminada na linha de execução do continue 
                */
                continue;
                /*
                * break, ao ser executado para a execução do laço inteiro 
                */
                // break;
            }
            System.out.println(i);
        }
    }
}
