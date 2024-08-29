package edu.gabriel.exemploPoo;

public class Moto extends Veiculo {
    // método OBRIGATÓRIO para a classe Moto, já que a classe que ela herda possui um método abstrato chamado ligar (que, claramente, todo veículo tem esta funcionalidade, tem este método, mas, cada um irá trata-lo do seu jeito, eles só obrigatoriamente tem que ter este método)
    public void ligar(){
        System.out.println("moto ligada");
    }
}
