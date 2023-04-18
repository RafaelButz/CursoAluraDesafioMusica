package br.cursoalurajava.desafio.forma;

public class Audio{
    private String titulo;
    private String genero;
    private String nome;
    private int quantidadeDeArquivos;

    private double tempoTotal;

    public double getTempoTotal() {
        return tempoTotal;
    }

    public void setTempoTotal(double tempoTotal) {
        this.tempoTotal = tempoTotal;
    }

    public void cricao(String titulo, String genero, String nomeComplementar, int quantidadeDeArquivos) {
        this.titulo = titulo;
        this.genero = genero;
        this.nome = nomeComplementar;
        this.quantidadeDeArquivos = quantidadeDeArquivos;
    }

    public void imprimi() {
        System.out.println("================================================");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Genero: " + getGenero());
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getNome() {
        return nome;
    }
        public int getQuantidadeDeArquivos() {
        return quantidadeDeArquivos;
    }


}
