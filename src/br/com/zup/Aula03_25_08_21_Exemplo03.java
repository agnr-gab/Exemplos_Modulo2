package br.com.zup;

import java.util.Scanner;

public class Aula03_25_08_21_Exemplo03 {
    public static void main(String[] args) {
        // 3 - Faça um programa que converta metros para centímetros.

        Scanner calculoMetros = new Scanner(System.in);

        // Definindo variáveis
        double medidaMetros;

        // Dando essa conversão ao usuário
        System.out.println( "Faça a conversão de metros para centimetros" );
        System.out.println("Digite o valore para ser convertido");
        medidaMetros = calculoMetros.nextDouble();
        //Transformando os metros em centímetros
        double centimetros = medidaMetros * 100;
        // Informando ao usuário
        System.out.println(medidaMetros + "m equivale a " +centimetros + " cm");

    }
}
