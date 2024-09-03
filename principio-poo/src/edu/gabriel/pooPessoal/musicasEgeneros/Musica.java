package edu.gabriel.pooPessoal.musicasEgeneros;

// classe abstrata, já que quero colocar métodos abstratos aqu
public abstract class Musica {
    // atributo privado que só existe nesta classe, porém, pode ser acessado e
    // alterado pelas classes filhas através de get e set - já que todas vão
    // utilizar volume, pq não fazer um jeito de todos terem acesso?
    private Integer volume = 0;

    public Integer getVolume() {
        return this.volume;
    }

    public void setVolume(Integer volume) {
        /*
         * (this.volume = volume) para parar de dar erro, e primeiro resolver essa
         * operação para depois concatenar com a string
         */
        if (volume < 0 || volume > 100) {
            System.out.println("Volume inválido");
        } else {
            System.out.println("Alterando volume para: " + (this.volume = volume));
        }
    }

    public void tocar() {
        abrirYt();
        ligarFone();
        // para chamar um método aqui, tenho que faze-lo retornar algo (e estava fazendo
        // retornar 'void')
        System.out.println("Estou ouvindo o gênero: " + genero());
        System.out.println("A sua melodia é: " + melodia());
        System.out.println("A descrição do seu ritmo é: " + ritmo());
        System.out.println("A descrição do seu timbre é: " + timbre());
    }

    /*
     * métodos privados, que as outras classes não precisam ver, apenas essa
     * sempre serão executados antes dos outros métodos, não quero (precisar,
     * precisa, mas esse é so um exemplo ficticio) que o usuário fique chamando os
     * métodos de "abrir yt", e "ligando fone"
     */
    private void abrirYt() {
        System.out.println("abrindo youtube");
    }

    private void ligarFone() {
        System.out.println("ligando fone");
    }

    /*
     * toda música tem um genêro musical, mas nem todos são iguais
     * deixo-os abstratos para poderem alterar este método da forma que desejarem
     * protected para apenas as classes filhas terem acesso
     * abstração
     * protected - encapsulamento
     * todos tem que retornar um tipo string
     */
    protected abstract String genero();

    protected abstract String melodia();

    protected abstract String ritmo();

    protected abstract String timbre();

}
