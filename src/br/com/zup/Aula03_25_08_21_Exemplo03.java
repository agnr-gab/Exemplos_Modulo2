package br.com.zup;

import java.util.Scanner;

public class Aula03_25_08_21_Exemplo03 {
    public static void main(String[] args) {
        // 3 - Faça um programa que converta metros para centímetros.

        //Intanciar o Scanner
        Scanner calculoMetros = new Scanner(System.in);

        //Declarar valor de todas as variáveis
        int medidaMetros = 0;

        // Variaveis de processamento
        int resultadoMetrosParaCentimetros = medidaMetros * 100;

        //Receber o valor das variáveis
        System.out.println("Por favor, digite o valor em metro para conversão em cm");
       medidaMetros = calculoMetros.nextInt();

        //Exibir os dados
        System.out.println("A conversão " + medidaMetros + "m para centimentros é de " + resultadoMetrosParaCentimetros + " cm");
    }
}
