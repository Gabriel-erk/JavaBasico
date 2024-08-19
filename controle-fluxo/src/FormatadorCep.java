// extendendo a classe execption, resposável por gerar algumas excesões, criando exceção personalizada
public class FormatadorCep extends Exception {

    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2370654");
            System.out.println(cepFormatado);

        } catch (FormatadorCep e) {
            System.out.println("Cep não corresponde com as regras de negócio");
        }

    }
    /*
    * throws FormatadorCep, determinando que ele lança um erro
    * if (cep.length() != 8) { é a condição para ele lançar o erro
    * throw new FormatadorCep(); - lançando o erro
    * posso chamar o método sem criar uma instância(objeto) da classe, já que ele é static 
    * exemplo de chamada: NomeDaClasse.formatarCep("23765066")
    * somente static assim quer dizer que a visibilade do método é package-private, pode ser utilizado por outras classes dentro do pacote que ele está
    * se quiser que seja visto até por outros pacotes, seria necessário utilizar o modificador public
    */
    static String formatarCep(String cep) throws FormatadorCep {
        if (cep.length() != 8) {

            throw new FormatadorCep();
        }
        // simulando um cep formatado
        return "23.765-0664";
    }

}
