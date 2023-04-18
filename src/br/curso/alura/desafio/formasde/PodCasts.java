package br.curso.alura.desafio.formasde;

import br.cursoalurajava.desafio.forma.Faixas;
import br.cursoalurajava.desafio.forma.ClassificaDepressao;

public class PodCasts extends Faixas implements ClassificaDepressao {

    @Override
    public void imprimi() {
        super.imprimi();
        System.out.println("Assunto: " + getNome());
        System.out.println("Numero de Aulas: " +  getQuantidadeDeArquivos());
    }


    @Override
    public double getFazAlgo() {
        return media();
    }
}
