public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        resultadoProcessoSeletivo(1900);
        resultadoProcessoSeletivo(2200);
        resultadoProcessoSeletivo(2000);
    }

    static void resultadoProcessoSeletivo(int pretensaoSalarial){
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
