import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    /* tornando essa váriavel estática (váriaveis estáticas pertencem a classe, acessadas pelo nome da classe, não do objeto, tem apenas uma referência na memória, enquanto váriaveis normais tem várias, já que são chamadas a partir de objetos diferentes), todas as instâncias da classe tem referência a somente ela, diferente de quando criamos a instância de uma classe (criando um objeto) e usamos uma váriavel (por exemplo, nome, cada objeto/instância da classe tem seu próprio valor para nome, aqui não) 
     * métodos estáticos só podem acessar métodos e váriaveis estáticos diretamente, por isso, só pude chama-la no método quando a deixei static - já que váriaveis que não são estáticas pertencem a uma instância da classe, e não a própria classe, como essas estáticas
     * esta variavel não está em nenhum escopo de método, ela é uma váriavel de classe(global), e pose ser chamada no sistema inteiro
    */
    static String[] armazenaNomeSelecionados = new String[5]; // inicializa com 5 espaços, com o tamanho para 5 elementos, já que vou guardar 5 nomes aqui, para percorre-lo precisa ter um tamanho definido, não é que nem o js - array q vai  guardar os selecionados

    public static void main(String[] args) throws Exception {
        selecionaCandidatos();
        imprimirSelecionados();

        for (String candidato : armazenaNomeSelecionados) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        // se entrou aqui é pq tentou pelo menos 1x
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            // se atender for true, inverterá para false e passará o valor para continuarTentando (ou seja, continuarTentando = false), se retornar false, continuarTentando = true
            continuarTentando = !atendeu;
            // se continuar tentando retornar true (ou seja, ele não atendeu e é para continuar tocando), aumenta o valor de tentativasRealizadas, quando chegar em 3, sai do loop, já que a condição para continua-lo se torna falsa
            if (continuarTentando) {
                tentativasRealizadas++;
            } else{
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
            // faça enquanto continuarTentando retornar true e tentativasRealizadas for menor que 3
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        } else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MÁXIMO TENTATIVAS " + tentativasRealizadas);
        }
    }

    static boolean atender(){
        // gera um número entre 1 e 3 e se gerar igual a 3 significa que ele 'atendeu' (ou seja, retorna true)
        return new Random().nextInt(3)==1;
    }

    public static void imprimirSelecionados() {
        System.out.println("alunos selecionados:");
        // imprimindo cada nome selecionado, do array armazenanomeselecionados, não é
        // possivel mostrar o array inteiro so dandoo sisout e o array q nem no js
        for (String nome : armazenaNomeSelecionados) {
            System.out.println(nome);
        }
    }

    static String[] selecionaCandidatos() {
        String[] candidatos = {
                "Min",
                "Bruno",
                "Carla",
                "Daniel",
                "Eduarda",
                "Fernando",
                "Gabriela",
                "Henrique",
                "Isabela",
                "João"
        };

        double salarioBase = 2000.0;
        // vai representar o indice do array candidatos
        int candidatoAtual = 0;
        // guarda os candidatos selecionados
        int candidatosSelecionados = 0;
        // enquanto candidatosSelecionados for menor que 5 e a váriavel candidatoAtual
        // for menor que o tamanho do array candidatos, o array irá continuar
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");

                armazenaNomeSelecionados[candidatosSelecionados] = candidato;
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
       
        return armazenaNomeSelecionados;
    }

    // gera um número aleatório do tipo double entre 1800 e 2200
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void resultadoProcessoSeletivo(int pretensaoSalarial) {
        double salarioBase = 2000;

        if (salarioBase > pretensaoSalarial) {
            System.out.println("LIGAR PARA CANDIDATO");
        } else if (salarioBase == pretensaoSalarial) {
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DE DEMAIS CANDIDATOS");
        }
    }
}
