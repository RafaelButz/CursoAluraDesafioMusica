public class Musicas {
    private String nomeDaMusica;
    private double tempoDeDuracao;
    private Albuns albuns;

    public void incluiMusica(Albuns albuns, String nomeDaMusica, double tempoDeDuracao){
        this.albuns = albuns;
        this.nomeDaMusica = nomeDaMusica;
        this.tempoDeDuracao = tempoDeDuracao;
    }

}
