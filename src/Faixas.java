public class Faixas extends Audio{
    private Audio audio;


    public void criaFaixa(Audio Audio, String nomeDaFaixa, int numeroDaFaixa, double duracao) {
        super.criaFaixa(nomeDaFaixa, numeroDaFaixa, duracao);
        this.audio = audio;
    }
}
