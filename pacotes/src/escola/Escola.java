package escola;

public class Escola {
    public static void main(String[] args) {
        // etapa de definição, criando o bjeto felipe e definindo seus valores, as suas caracteristicas
        Aluno felipe = new Aluno();
        felipe.setNome("Felipe Junior"); 
        felipe.setIdade(12);

        // etapa de obter o resultado, obter os valores/informações das propriedades do objeto felipe, para mostra-las na tela
        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos");
    }
}
