public class PodCasts extends Audio {

    @Override
    public void imprimi() {
        super.imprimi();
        System.out.println("Assunto: " + getNome());
        System.out.println("Numero de Aulas: " +  getQuantidadeDeArquivos());

    }
}
