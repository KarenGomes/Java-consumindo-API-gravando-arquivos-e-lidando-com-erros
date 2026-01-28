package br.com.alura.screenmatch.exercicios.main;

import br.com.alura.screenmatch.exercicios.models.Pessoa;

import java.util.ArrayList;

public class MainExercicios {

    public static void main(String[] args) {

    }

    /// Exercício de fixação 01
    public void Exercicio1(){
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Karen");
        pessoa1.setIdade(21);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Luan");
        pessoa2.setIdade(23);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("toString(): " + listaDePessoas.get(1).toString());
    }
}
