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
        int tamanhoLocal;
        int tinta18L = 18;
        double tintaGalao = 3,6;
        int valorLata18L = 80;
        double valorGalaoTinta = 25;
        double capacidadeLitro = 6;

        System.out.println("Informe o tamanho da área a ser pintada em m²: ");
        tamanhoLocal = leitorTinta.nextInt();

        // Calculo da quantidade de tinta de acordo com o tamanho do local
        // 18l de tinta = 108m² que custa 80,00 reais
        // 3.6L de tinta = 21.6m³

        double quantidadeDeTintaLata = tamanhoLocal * tinta18L;
        double quantidadeDeTintaGalao = tamanhoLocal * tintaGalao;



    }
}
