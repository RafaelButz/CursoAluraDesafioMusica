public class Audio {
    private String titulo;
    private String genero;
    private int quantidadeDeArquivos;
    private int duracao;

    public int getQuantidadeDeArquivos() {
        return quantidadeDeArquivos;
    }

    public void setQuantidadeDeArquivos(int quantidadeDeArquivos) {
        this.quantidadeDeArquivos = quantidadeDeArquivos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
