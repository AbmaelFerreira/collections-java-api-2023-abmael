package main.java.list.OperacoesBasicas.numero;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Numero> numeros = new ArrayList<>();


    public void adicionarNumero(Numero numero) {
        numeros.add(numero);
    }

   public int calcularSoma() {
        int total = 0;
        for(Numero num : numeros){
            total = total + num.getNumero();
        }
        return total;
   }


    public int encontrarMaiorNumero() {
        int maior = 0;

        for(Numero num : numeros){
            if(num.getNumero() > maior){
                maior = num.getNumero();
            }
        }
        return maior;
    }

//    : Encontra o menor número na lista e retorna o valor.
    public Numero encontrarMenorNumero() {
        Numero menor = new Numero();


        for(Numero num : numeros){
            if(menor.getNumero() == 0) {
               menor.setNumero((num.getNumero()));
            }
            else if(menor.getNumero() > num.getNumero()){
                menor.setNumero(num.getNumero());

            }

        }
        return menor;
    }


//   Retorna uma lista contendo todos os números presentes na lista.
   public List<Numero> exibirNumeros() {
       System.out.println(numeros);
        return numeros;
   }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        Numero num1 = new Numero(2);
        Numero num3 = new Numero(3);

        somaNumeros.adicionarNumero(num1);
        somaNumeros.adicionarNumero(num3);

        System.out.println("Somando os numeros "+somaNumeros.calcularSoma());
        System.out.println("O menor numero é "+somaNumeros.encontrarMenorNumero());
        System.out.println("O maior numero é "+somaNumeros.encontrarMaiorNumero());

        somaNumeros.exibirNumeros();
    }
}
