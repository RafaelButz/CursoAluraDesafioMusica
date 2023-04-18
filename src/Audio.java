public class Audio {
    private String titulo;
    private String genero;
    private String nome;
    private double duração;


    public void cricao(String titulo, String genero, String nome, double duração){
        this.titulo = titulo;
        this.genero = genero;
        this.nome = nome;
        this.duração = duração;

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDuração() {
        return duração;
    }

    public void setDuração(double duração) {
        this.duração = duração;
    }


}
