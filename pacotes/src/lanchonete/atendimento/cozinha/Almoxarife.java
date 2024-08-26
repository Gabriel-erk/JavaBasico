package lanchonete.atendimento.cozinha;

public class Almoxarife {

    private void controlarEntrada(){
        System.out.println("controlando entrada dos itens");
    }

    private void controlarSaida(){
        System.out.println("controlando a saida dos itens");
    }

    void entregarIngredientes(){
        controlarSaida();
        System.out.println("entregando ingredientes");
    }

    void trocarGas(){
        System.out.println("trocando gás");
    }

    void chamaMetodoPraPararWarning(){
        controlarEntrada();
    }
}
