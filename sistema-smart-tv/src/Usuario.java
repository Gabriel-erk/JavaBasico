public class Usuario {
    public static void main(String[] args) throws Exception {
        
        /*
        * váriavel smartTv recebendo uma instância da nossa classe SmartTv (váriavel do tipo smartTv) - que está em outro arquivo, a posso chama-lo aqui tranquilamente (magia dms isso ai) 
        * a classe usuário interage com a classe smartTv
        */
        SmartTv smartTv = new SmartTv();
        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);

        smartTv.ligar();
        smartTv.abaixaVolume();
        smartTv.abaixaVolume();
        smartTv.abaixaVolume();
        smartTv.aumentaVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.mudarCanal(13);

    }
}
