public class EstruturaForEach {
    public static void main(String[] args) {
        String alunos[] = {"GABRIEL", "ERICK", "VICENTE", "FERREIRA"};

        /*
        * for each, para percorrer o array alunos, e jogar o valor de cada indice na váriavel aluno
        * String aluno, estou definindo o nome da váriavel e o tipo do retorno que irá receber do indice de alunos
        * como os tipos do meu array aluno são do tipo String, a minha váriavel aluno tbm é
        * percorre cada indice de alunos e joga em aluno, executa e faz isso com o próximo (a cada iteração do array alunos, irá atualizar o valor da váriavel de escopo aluno)
        */
        for(String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }
    }   
}
