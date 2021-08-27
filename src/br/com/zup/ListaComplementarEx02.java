package br.com.zup;

import java.util.Scanner;

public class ListaComplementarEx02 {
    public static void main(String[] args) {
        // Enunciado da questão
        // 2 - Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$80,00 ou em galões de 3,6 litros, que custam R$25,00.
        //Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
        //comprar apenas latas de 18 litros;
        //comprar apenas galões de 3,6 litros;
        //DESAFIO: Misture latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.

      //Scanner
    Scanner leitorTintas = new Scanner(System.in);

    //Variaveis
    double area = leitorTintas.nextDouble();
    double precoGalao = 25; //3,6 litros, que custam R$25,00.
    double precoLata = 80; //latas de 18 litros, que custam R$80,00
    double litroGalao = 3.6; //quantidade em litros do galão
    double litroLata = 18; //quantidade em litros da lata
    double rendimentoTintaLitro = 6; //1 litro para cada 6 metros quadrados

    //Calculo de quantos m² a tinta irá cobrir
    double capacidadeGalao = litroGalao * rendimentoTintaLitro; // m² que a tinta do galão vai render
    double capacidadeLata = litroLata * rendimentoTintaLitro; // m² que a tinta da lata vai render

    //Calculo desperdício tinta
    double


