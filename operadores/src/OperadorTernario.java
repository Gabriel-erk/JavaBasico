public class OperadorTernario {
    public static void main(String[] args) throws Exception {

        int nota = 4;
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        String resultado2 = nota >= 7 ? "Aprovado" : nota>=5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println("Primeiro Bimestre:" + resultado);
        System.out.println("Segundo Bimestre:" + resultado2);

        int idade = 99;
        String faseDeVida = idade < 14 ? "Criança" : idade >= 14 && idade < 18 ? "Adolescente" : idade >= 18 && idade < 55 ? "Adulto" : idade >= 55 ? "Velho/Idoso" : "Idade Inválida";
        System.out.println(faseDeVida);  
    }
}
