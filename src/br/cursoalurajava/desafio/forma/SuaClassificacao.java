package br.cursoalurajava.desafio.forma;

public class SuaClassificacao extends Audio{

    public void fazAlgo(Audio audio) {
        if (audio.media() == 10){
            System.out.println("Talvez seja melhor tomar 6 Fluoxetina e uma garrafa de pinga");
        } else if(audio.media() <= 7){
            System.out.println("Melhor tomar 3 Fluoxetina e meio litro pinga");
        } else {
            System.out.println("So a pinga");
        }
    }
}
