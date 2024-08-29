package edu.gabriel.exemploPoo;

// abstract para dizer que minha classe é abstrata, ou seja, a classe não sabe como algumas coisas funcionam
public abstract class Veiculo {
    // seguindo o padrão javaBeans, todo atributo privado, deve ter um get (para ter acesso aquele valor) e um set (para poder alterar aquele valor)
    private String chassi;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    /*
     * todas classes que quiserem ser um veículo (herdar de veículo) PRECISARÃO ter o método ligar - já que estou definindo que este é um método abstract
     * por ser abstrato não preciso definir o que ele irá fazer, já que quem irá ditar suas funcionalidades será as classes filhas (por ex, moto, carro, barco...a forma de ligar deles, por debaixo dos panos é diferente)
     */
    public abstract void ligar();
}
