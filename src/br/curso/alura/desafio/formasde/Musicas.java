package br.curso.alura.desafio.formasde;

import br.cursoalurajava.desafio.forma.Audio;
import br.cursoalurajava.desafio.forma.Faixas;
import br.cursoalurajava.desafio.forma.ClassificaDepressao;

public class Musicas extends Faixas implements ClassificaDepressao {
    public Audio musica;
    public void imprimi() {
        super.imprimi();
        System.out.println("Artista: " + getNome());
        System.out.println("Musicas: " + getQuantidadeDeArquivos());
    }


    @Override
    public double getFazAlgo() {
        return media();
    }
}
