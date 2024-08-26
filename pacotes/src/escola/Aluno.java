package escola;

public class Aluno {
    private String nome;
    private int idade;

    private String sexo;

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    // método publico (toda aplicação precisa ve-lo, para eu poder chama-lo em diferentes lugares) para eu pegar o valor atual do meu atributo privado 'nome' e retorna-lo
    public String getNome(){
        return nome;
    }

    // método publico (toda aplicação precisa ve-lo, para eu poder chama-lo em diferentes lugares) que não retorna nada, apenas recebe um parâmetro, com o novo valor que quero colocar no meu atributo privado 'nome', e altera o valor do atributo 'nome' para o valor do parâmetro - tipo de parâmetro correspondente ao tipo do atributo
    public void setNome(String newNome){
        nome = newNome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int newIdade){
        /*
         * this é uma referência a instância atual da classe, usado para diferenciar os atributos da instância (da criação de um objeto) dos parâmetros do método que têm o mesmo nome, q nem, neste caso, se o parâmetro 'newIdade' se chamsse 'idade', a linha de códgio abaixo seria: idade = idade, o compilador entenderia que estou me refernciando SOMENTE a váriavl 'idade' do parâmetro do método, fazendo um atribuição inútil
         * utilizando this nesse caso aqui, não seria necessário, pois os nomes são sim diferentes, mas fica aqui sómente para ilustrar
         * this é usado para se referenciar ao atributo da classe/instância do objeto a partir dessa classe, enquanto newIdade refere-se ao parâmetro do método
         * utilizar 'this' é uma boa prática quando você tem váriaveis locais ou parâmetros de método com o mesmo nome que os atributos da classe, evita confusão e garante que eu esteja claramente manipulando o atributo correto da instância
         */
        this.idade = newIdade;
    }
}
