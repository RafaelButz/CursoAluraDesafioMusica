public class Principal {
    public static void main(String[] args) {
        Albuns oMelhorDaSofrencia = new Albuns();

        oMelhorDaSofrencia.setTitulo("Pra fazer machão Chorar");
        oMelhorDaSofrencia.setGenero("Sertanejo");
        oMelhorDaSofrencia.setArtista("Bruno e Marrone");
        oMelhorDaSofrencia.setDisco("De Volta aos Bares");
        oMelhorDaSofrencia.setQuantidadeDeArquivos(4);

        Musicas brunoEmarrone1 = new Musicas();
        brunoEmarrone1.incluiMusica(oMelhorDaSofrencia, "Cavalgada", 3.42);
        Musicas brunoEmarrone2 = new Musicas();
        brunoEmarrone2.incluiMusica(oMelhorDaSofrencia, "Duas Vezes Você", 3.47);
        Musicas brunoEmarrone3 = new Musicas();
        brunoEmarrone3.incluiMusica(oMelhorDaSofrencia, "A Dois Grau", 3.46);
        Musicas brunoEmarrone4 = new Musicas();
        brunoEmarrone4.incluiMusica(oMelhorDaSofrencia, "Fiel Ate Debaixo D'Agua", 3.46);


    }
}
