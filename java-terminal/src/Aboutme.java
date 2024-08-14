public class Aboutme {
    public static void main(String[] args) {
        String nome = args[0];
        String sobrenome = args[1];
        /*
        * converte a string em um objeto do tipo integer
        * ao realizar a atribuição a váriavel idade, ocorre o unboxing (processo de conversão automática de um objeto wrapper (como Integer, Double, etc) para o seu tipo primitivo correspondente (int, double, etc)), onde o objeto do tipo integer vira int 
        * objetos wrapper: são classes que encapsulam os tipos primitivos em objeto, como 'Integer' para 'int', 'Double' para 'double', etc. Eles fornecem métodos úteis para a manipulação e conversão de valores primitivos 
        */
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    }
}
