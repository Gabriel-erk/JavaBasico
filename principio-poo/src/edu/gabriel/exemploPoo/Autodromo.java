package edu.gabriel.exemploPoo;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        // jeep.ligar();
        jeep.setChassi("8765");
        // System.out.println(jeep.getChassi());

        Moto z400 = new Moto();
        z400.setChassi("8764");
        // z400.ligar();

        /*
         * aqui entra o conceito de polimorfismo
         * tenho mais de uma forma de ligar um veículo (tanto do tipo moto, quanto do tipo carro, que no caso é através da classe mais genérica (Veiculo) e não a especializada (moto ou carro))
         */
        Veiculo coringa = jeep;

        /*
         * por mais que a instancia criada seja do tipo veiculo, fazendo ele receber o objeto jeep, ele consegue acessar os métodos "ligar" do jeep
         * resultado vai ser mediante as características do polimorfismo - no caso, passado o objeto jeep, q tbm possui o método ligar() -
         */
        coringa.ligar();
        // gera um erro pois não consigo chamar o método "desligar" através do objeto "coringa" pois este método só existe na classe jeep, msm sendo uma classe publica, e q carro herde as propriedades da classe abstrata veiculo, não posso usar este métoso
        // coringa.desligar(); 
    }

}
