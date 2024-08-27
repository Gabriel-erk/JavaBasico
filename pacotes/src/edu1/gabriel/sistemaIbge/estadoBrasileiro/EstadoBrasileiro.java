package edu1.gabriel.sistemaIbge.estadoBrasileiro;

// palavra reservada enum, não class (mesmo que ainda seja uma classe)
public enum EstadoBrasileiro {
    /*
     * criando obejto constante chamado SAO_PAULO, com a sigla "SP" e o nome "São Paulo"
     * ; para dizer que não vai mais criar objetos contantes
     * , para dizer que vai criar outro 
    */  
    SAO_PAULO("SP", "São Paulo", 11),
    RIO_JANEIRO("RJ", "Rio de Janeiro",12),
    PIAUI("PI", "Piauí", 13),
    MARANHAO("MA", "Maranhão", 14),
    CEARA("CE", "Ceará", 15);

    // criando atributos seguindo padrão javaBeans, que terão de ser passamos ao meus construtores
    private String sigla;
    private String nome;
    private int codigoIbge;

    // construtor privado pedindo o valor dos atributos sigla e nome e definindo esses valores aos meus atributos privados, construtor privado pois não quero ningúem instanciando nada, criando nenhum objeto a partir da minha classe, somente EU posso fazer isso
    private EstadoBrasileiro(String sigla, String nome, int codigoIbge) {
        this.sigla = sigla;
        this.nome = nome;
        this.codigoIbge = codigoIbge;
    }


    /*
     * somente GET pois só quero que tenham visibilidade, que apenas vejam, e um enum é UM OBJETO CONSTANTE, seu valor NÃO ALTERA, e é justamente isso que o setter faz
     */
    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoIbge() {
        return codigoIbge;
    }

    // converte o nome para maiúsculo
    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
    
}
