public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        short numeroCurto = 1;
        // um número inteiro suporta um numero curto, ele tem espaço para isso
        int numeroNormal = numeroCurto;
        // um número curto não suporta o numero normal, pois em algum momento, ele pode ser superior ao númeroCurto2, pode passar o seu espaçamento definido, já que é um inteiro e suporta mais bytes
        // short numeroCurto2 = numeroNormal;
        // nome disso abaico é casting, onde basicamente a linguagem quer te deixar ciente de que, se acontecer algo, ja que está tentando colcoar um número de possível precisão maior em uma váriavel com precisão menor, você esteja ciente disso
        short numeroCurto2 = (short) numeroNormal;
        System.out.println(numeroCurto2);
    }
}
