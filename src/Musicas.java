public class Musicas extends Audio {

    public void imprimi() {
        super.imprimi();
        System.out.println("Artista: " + getNome());
        System.out.println("Musicas: " + getQuantidadeDeArquivos());
    }



}
