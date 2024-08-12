package edu.gabriel.segundasemana;
/*
* todo arquivo/classe java tem que estar dentro da pasta src (toda classe java que representa alguma infomração deverá ter letra maiuscula, se for composta a segundapalvara deve também ser maiuscula, classe deve ter o mesmo nome do arquivo, ex, aqui a minha primeira classe é "MinhaClasse" o mesmo nome do arquivo)
*  arquivos criados em java terão que ter inicio em letra maiuscula e a palavra complementar também (Minha e palavra complementar Classe) (cada inicial tem que se maiuscula)
* tudo o que eu for escrever neste documente será neste bloco
* o que escrever? se a minha classe é uma classee executavel - se tem a capacidade de realizar uma inicialização do projeto, ou de forma independente, ela precisa ter método especial/método principal, determinado de main (que tem sua estrutura padrão)
* a linguagem java é constituida de arquivos java, e esses arquivos são considerados Classes(que estão ao nosso dispor)
*/
public class MinhaClasse {
    /*
    * void significa que não vai me retornar nada, vai executar e não retornará nada
    * dentro dos parenteses, ele espera um parametro especial, do tipo string[] (é uma classe do tipo string, e os [] indicam que neste momento, é um array) e váriavel do tipo string é chamada de args(ou argumentos, enfim, o nosso parâmetro) 
    * isto é um método, tudo escrito nele, existirá apenas nele
    * vs code detectou que esse é o método principal de execução, e já liberou as opções: Run e Debug
    */
    public static void main(String[] args) {
        /*
        * conhecendo um pouco das classes ao nosso dispor para melhorarmos nosso 'repertório'
        * 'System' é uma classe do sistema, que posssui inúmeras opções de input e de output dentro da aplicação
        * dentro das inumeras opções de input e output que o 'system' possui, estou pedindo uma saida 'out' cujo vai ser uma impressão 'print', ou seja, imprima um texto pra mim 
        * parâmetro do método print foi o texto que quero exibir no console "OIOOIOI" - que ao clicar, ele inicializa, compila e faz tudo o que precisa realizar
        */
        System.out.print("OIOIOIOI");

        /*
        * a palavra reservada final serve para dizer que a váriavel é uma constante (para resumir assim), seu valor não poderá ser alterado 
        * mesmo não contendo a palavra reservada, final, como boa prática dos programadores java, ao deixar o nome da váriavel toda maiúscula, fica-se sub-entendido que ela não deverá ser alterada (mas mesmo assim, coloque)
        */
        final String BR = "Brasil";
        // BR = "Brazil"; - fica de exemplo
        int ano = 2022;
        // como é uma váriavel normal do tipo inteiro, pode ser alterada
        ano = 2000;
        // valo de PI também nunca srá alterad
        final double PI = 3.14;
        // será escrito desta forma, já que váriaveis nunca alteradas ficam em maiúsculo
        final int ESTADOS_BRASILEIROS = 27;
        // pode iniciar váriavel com $ e _
        String $meuNome = "oi";

        System.out.println("BR: " + BR + ", Ano: " + ano + ", PI: " + PI + ", Estados Brasileiros: " + ESTADOS_BRASILEIROS + ", Meu Nome: " + $meuNome);

        /*
        * váriaveis em Java possuem a seguinte sintaxe: 
        * - TIPO NomeBemDefinido = Atribuição (opcional em alguns casos) exemplo: int idade = 23; double altura = 2.01; Dog spike (aqui a váriavel/objeto não tem valor, por ser uma instância do classe Dog, ou seja, ela é do tipo 'dog'); boolean verdadeira = false/true; || boolean verdadeira; (váriaveis booleanas não precisam necessariamente terem seus valores declarados)
        */

        /*
        * estrutura básica dos métodos em Java
        * TipoRetorno NomeObjetivoNoIfinitivo Parametros(s) - parãmetros podem ser opcionais, a função pode ou não pedir parâmetros exemplo:
        * int somar(int numeroUm, int numero2) 
        * String formatarCep (long cep) - a váriavel cep é do tipo long(tipo númerico), porém a função pode espera um retorno de string, mas, mesmo assim é possivel retornar valores de tipos diferentes (com a função esperando um tipo de retorno e vc manda outro)
        */

        // criando os parâmetros que irei passar para o método nomeCompleto, criado fora deste método principal
        String primeiroNome = "Gabriel";
        String segundoNome = "Erick";
        
        // criando uma váriavel do tipo string que recebe a chamada do método 'nomeCompleto' e passo os 2 parâmetros que o método pede (as váriaveis primeiroNome e segundoNome, criadas logo acima)
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        // depois realizo a chamada da váriavel, onde a váriavel está chamando o método com os parâmetros que passei
        System.out.println(nomeCompleto);

        /*
        * também dá pra chamar de um jeito "normal" o método, sem ter que atribui-lo a váriavel
        * alguma exensão ainda mostra para qual parâmetro ta sendo passado cada valor ainda, mt bom, slc 
        */
        System.out.println(nomeCompleto("Pinto", "MURCHO"));
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        /*
        * dando um return
        * utilizando o método concat na várival 'primeiroNome', concatenando primeiramente com um espaço (para gerar um espaço/distância entre o primeiro e o segundo nome), e, continuando concatenando, concatena-se com a váriavel segundo nome 
        */
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
