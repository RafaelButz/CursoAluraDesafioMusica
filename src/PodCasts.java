public class PodCasts extends Audio {
    private double tempoTotalDeDuracao;

    @Override
    public void cricao(String titulo, String genero, String nome, double duração) {
        super.cricao(titulo, genero, nome, duração);
        this.tempoTotalDeDuracao += duração;
    }

    public double getTempoTotalDeDuracao() {
        return tempoTotalDeDuracao;
    }

    public void setTempoTotalDeDuracao(double tempoTotalDeDuracao) {
        this.tempoTotalDeDuracao = tempoTotalDeDuracao;
    }
}
