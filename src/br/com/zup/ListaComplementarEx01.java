package br.com.zup;

public class ListaComplementarEx01 {
    public static void main(String[] args) {
        // 1 - João Papo-de-Pescador, homem de bem, comprou um microcomputador para
        //controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de
        //peixes maior que o estabelecido pelo regulamento de pesca do estado de São
        //Paulo (50 quilos) deve pagar uma multa de R$4,00 por quilo excedente. João
        //precisa que você faça um programa que leia a variável peso (peso de peixes) e
        //calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.
        float pesoPeixe = 100F;
        float excessoPesoPeixe = pesoPeixe - 50F;
        float valorMulta = excessoPesoPeixe * 4F;

        System.out.println("O seu peixe pesa: " + pesoPeixe + "Kg. Você execedeu " + excessoPesoPeixe + "kg além do permitido por lei, gerando uma multa no valor de R$ " + valorMulta + " reais");

    }
}
