package br.curso.alura.desafio.formasde;

import br.cursoalurajava.desafio.forma.Audio;
import br.cursoalurajava.desafio.forma.Faixas;

public class Musicas extends Faixas {
    public Audio musica;
    public void imprimi() {
        super.imprimi();
        System.out.println("Artista: " + getNome());
        System.out.println("br.curso.alura.desafio.formasde.Musicas: " + getQuantidadeDeArquivos());

    }


}
