package lanchonete.atendimento;

public class Atendente {
    public void servindoMesa(){
        pegarLancheCozinha();
        System.out.println("servindo mesa");
    }

    private void pegarLancheCozinha(){
        pegarPedidoBalcao();
        System.out.println("pegando lanche na cozinha");
    } 

    public void receberPagamento(){
        System.out.println("Recebendo pagamento");
    }

    void trocarGas(){
        System.out.println("atendente trocando o gás");
    }
    // estabelecimento/cliente precisa saber apenas que o atendente está entregando o pedido: que está servindoAMesa()
    private void pegarPedidoBalcao(){
        System.out.println("pegando pedido no balcao");
    }
}
