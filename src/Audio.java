public class Audio {
    private String titulo;
    private String genero;
    private String nome;
    private String nomeDaFaixa;
    private int quantidadeDeArquivos;
    private double duracao;
    private int numeroDaFaixa;


    public void criaFaixa(String nomeDaFaixa, int numeroDaFaixa, double duracao) {
        this.duracao = duracao;
        this.nomeDaFaixa = nomeDaFaixa;
        this.numeroDaFaixa = numeroDaFaixa;
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
