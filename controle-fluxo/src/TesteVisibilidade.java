public class TesteVisibilidade {
    public static void main(String[] args) {
        /*
        * usando o tratamento de exceções declarado na classe formatadorcep 
        * definido como static, posso usa-lo em qualquer classe do meu pacote
        */
        try {
            System.out.println(FormatadorCep.formatarCep("12345678"));
        } catch (FormatadorCep e) {
            System.out.println("Cep de tamanho inválido");
        }
    }
}
