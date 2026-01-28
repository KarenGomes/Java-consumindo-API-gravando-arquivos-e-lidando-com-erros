package br.com.alura.screenmatch.exercicios.models;

public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String especie, String nome, String raca) {
        super(especie, nome);
        this.raca = raca;
    }
}
