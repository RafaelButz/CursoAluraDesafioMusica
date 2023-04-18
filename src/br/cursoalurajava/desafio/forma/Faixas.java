package br.cursoalurajava.desafio.forma;

import br.cursoalurajava.desafio.forma.Audio;

public class Faixas extends Audio {
    private Audio audio;
    private double somaDuracao;

    private String nomeDaFaixa;
    private int numeroDaFaixa;
    private double duracao;

    public double getSomaDuracao() {
        return somaDuracao;
    }

    public void criaFaixa(Audio audio, String nomeDaFaixa, int numeroDaFaixa, double duracao) {
        this.duracao = duracao;
        this.nomeDaFaixa = nomeDaFaixa;
        this.numeroDaFaixa = numeroDaFaixa;
        somaDuracao += duracao;

    }
    public void imprimiFaixa(){
        System.out.println("=============================================");
        System.out.println("n°:" + numeroDaFaixa );
        System.out.println("Nome: " + nomeDaFaixa);
        System.out.println("Duraçao: " + duracao);
    }

    public double getDuracao() {
        return duracao;
    }
}
