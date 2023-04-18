package br.curso.alura.desafio.formasde;

import br.cursoalurajava.desafio.forma.Faixas;

public class TempoAlbum {

    private double somaDuracao;


    public void somadorDeDuracao(Faixas f){
        this.somaDuracao += f.getDuracao();

    }

    public double getSomaDuracao() {
        return somaDuracao;
    }


}
