package edu.gabriel.exemploPoo;

public class Carro extends Veiculo {

    public void ligar() {
        // liga somente se os métodos retornarem true
        if (confereCombustivel() && confereCambio()) {
            System.out.println("Carro ligado");
        } else {
            System.out.println("não foi possivel ligar o carro");
        }
    }

    public void desligar(){
        System.out.println("desligar carro");
    }

    // encapsulando meus métodos, para não ficarem disponiveis em toda a aplicação,
    // tanto para o usuário não ter acesso quanto para ele não ter que fazer todas
    // essas verificações, não ter que chamar todos esses métodos
    private boolean confereCombustivel() {
        double combustivel = 200.00;
        System.out.println("conferindo combustivel");
        if (combustivel > 0.0) {
            System.out.println("tem combustivel");
            return true;
        } else {
            System.out.println("não tem combustivel");
            return false;
        }
    }

    private boolean confereCambio() {
        String cambio = "P";
        System.out.println("conferindo cambio em P");
        if (cambio == "P") {
            return true;
        } else {
            return false;
        }
    }
}
