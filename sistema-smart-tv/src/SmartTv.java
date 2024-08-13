public class SmartTv {

    /*
    * estado inicial smartTv 
    * não preciso de método main, já que não irei executar nada aqui, e sim, chamarei os atributos que criar aqui em outro arquivo
    */ 
    boolean ligada = false;
    int canal = 1;
    int volume = 25; 

    public void ligar(){
        ligada=true;
    }

    public void desligar(){
        ligada=false;
    }

    public void aumentaVolume(){
        if (volume < 100) {
            volume++;
            System.out.println("Aumentando o volume para: " + volume);
        } else {
            System.out.println("Volume máximo alcançado");
        }
    }

    public void abaixaVolume(){
        if (volume > 0) {
            volume--;
            System.out.println("Diminuindo o volume para: " + volume);

        } else {
            System.out.println("Volume mínimo alcançado");
        }
    }

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
        System.out.println("Canal alterado para: " + canal);
    }

    public void aumentarCanal(){
        canal++;

        System.out.println("Canal alterado para: " + canal);
    }

    public void diminuirCanal(){
        canal--;

        System.out.println("Canal alterado para: " + canal);

    }
}
