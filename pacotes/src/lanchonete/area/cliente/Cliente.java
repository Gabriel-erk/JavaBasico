package lanchonete.area.cliente;

public class Cliente {
    public void escolherLanche(){
        System.out.println("escolhendo lanche");
    }

    public void fazerPedido(){
        System.out.println("fazendo o pedido");
    }

    public void pagarConta(){
        consultarSaldoAplicativo();
        System.out.println("pagando a conta");
    }

    private void consultarSaldoAplicativo(){
        System.out.println("COnsultando saldo");
    }
}
