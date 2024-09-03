package edu.gabriel.pooPessoal;
import edu.gabriel.pooPessoal.musicasEgeneros.MPB;
import edu.gabriel.pooPessoal.musicasEgeneros.Pop;
import edu.gabriel.pooPessoal.musicasEgeneros.Musica;

public class FoneDaMin {
    // classe que irá executar minhas classes trazer elas p realidade
    public static void main(String[] args) {
        MPB foneUm = new MPB();

        foneUm.tocar();

        System.out.println("Volume atual: " + foneUm.getVolume());
        foneUm.setVolume(100);
        System.out.println("Volume atual: " + foneUm.getVolume());

        System.out.println("------------");
        Pop foneDois = new Pop();
        // método não visivel, usuário pode apenas chamar o método tocar e set/get volume - encapsulamento - deixei em um pacote diferente também, para não correr risco de ter acesso a este método, já que o protected é para classes filhas e classes do mesmo pacote
        // foneDois.genero();
        foneDois.tocar();
        System.out.println("------------");

        // null pois seu valor não vai ser fixo
        Musica foneTres = null;
        String escolheGenero = "MPB";
        // exemplo de polimorfismo, executando os métodos de formas diferentes, através da classe pai, executando os mesmos métodos, só que de outra forma
        if (escolheGenero == "MPB") {
            foneTres = foneUm;
            foneTres.tocar();
        } else if (escolheGenero == "POP") {
            foneTres = foneDois;
            foneTres.tocar();
        }
    }
}
