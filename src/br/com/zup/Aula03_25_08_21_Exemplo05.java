package br.com.zup;

import java.util.Scanner;

public class Aula03_25_08_21_Exemplo05 {
    public static void main(String[] args) {
        Scanner leitorTemperatura = new Scanner(System.in);

        // Definindo variáveis
        double celsius;

        // Pegando o valor em celsius do usuário
        System.out.println("Por favor insira a temperatura em °C");
        celsius = leitorTemperatura.nextDouble();

        // Calculando o Fahrenheit
        double fahrenheit = (celsius * 1.8) + 32;

        // Informando a conversão ao usuário
        System.out.println(celsius + "°C são " + fahrenheit + "°F.");
    }
}
