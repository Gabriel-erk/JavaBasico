package edu.gabriel.exemploEncapsulamento.app;

public abstract class ServicoMsgInstantanea {
    
    public abstract void enviarMensagem();
    public abstract void recebendoMensagem();
    protected abstract void salvarHistoricoMensagem();

    // somente os filhos conhecem esse método - através do protected
    protected void validarConectadoInternet() {
        System.out.println("validando conexão com net");
    }
}