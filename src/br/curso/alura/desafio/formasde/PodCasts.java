package br.curso.alura.desafio.formasde;

import br.cursoalurajava.desafio.forma.Faixas;

public class PodCasts extends Faixas {

    @Override
    public void imprimi() {
        super.imprimi();
        System.out.println("Assunto: " + getNome());
        System.out.println("Numero de Aulas: " +  getQuantidadeDeArquivos());
    }





}
