package br.com.zup;

import java.util.Scanner;

public class ListaComplementarEx02 {
    public static void main(String[] args) {
        // 2 - Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$80,00 ou em galões de 3,6 litros, que custam R$25,00.
        //Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
        //comprar apenas latas de 18 litros;
        //comprar apenas galões de 3,6 litros;
        //DESAFIO: Misture latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.

        Scanner leitorTinta = new Scanner(System.in);
        double area;
        double quantidadeLata = 0;
        double quantidadeGalao = 0;
        double valorLata18L = 80;
        double valorGalaoTinta = 25;


        System.out.println("Informe o tamanho da área a ser pintada em m²: ");
        area = leitorTinta.nextInt();

        // Calculo da quantidade de tinta de acordo com o tamanho do local
        // 18l de tinta = 108m² que custa 80,00 reais
        // 3.6L de tinta = 21.6m³

        double litrosTotal = area / 6;
        quantidadeLata = litrosTotal / 18;

        System.out.println("Você usará " + quantidadeLata + " latas de linta de 18L para realizar a pintura");
        System.out.println("O valor será de R$" + (quantidadeLata * 80) + " reais ");

        quantidadeGalao = litrosTotal / 3.6;
        System.out.println("Você usará " + quantidadeGalao + " galões de tinta de 3.6L para realizar a pintura");
        System.out.println("O valor será de R$" + (quantidadeGalao * 25) + " reais ");

        double desperdicioLata = Math.round(quantidadeLata) - quantidadeLata;
        double desperdicioGalao = Math.round(quantidadeGalao) - quantidadeGalao;



    }
}
