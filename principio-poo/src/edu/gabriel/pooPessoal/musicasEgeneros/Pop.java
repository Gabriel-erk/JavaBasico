package edu.gabriel.pooPessoal.musicasEgeneros;
// extends = herança
public class Pop extends Musica {

    @Override
    protected String genero() {
        return "POP";
    }

    @Override
    protected String melodia() {
        return "As melodias no pop são frequentemente cativantes, repetitivas e fáceis de lembrar. Elas tendem a ser simples, com linhas melódicas claras que geralmente são centradas em torno do refrão, que é a parte mais memorável da música.";
    }

    @Override
    protected String ritmo() {
        return "O ritmo no pop tende a ser constante, com uma batida forte que é fácil de seguir e dançar. As músicas geralmente seguem um compasso de 4/4, que é o mais comum em música popular.";
    }

    @Override
    protected String timbre() {
        return "O timbre no pop é geralmente muito limpo, com uma produção polida. A voz do cantor é frequentemente destacada, com pouca distorção, e muitas vezes processada com efeitos como autotune.";
    }
    
}
