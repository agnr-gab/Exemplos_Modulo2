package br.com.zup;

import java.util.Scanner;

public class Aula03_25_08_21_Exemplo02 {
    public static void main(String[] args) {
        //Intanciar o Scanner
        Scanner mediaNotas = new Scanner(System.in);

        //Declarar e receber o valor de todas as variáveis
        float nota1;
        float nota2;
        float nota3;
        float nota4;

        //Receber o valor das variáveis
        System.out.println("Olá, irei realizar o cálculo das sua notas. Insira os dados solicitados");
        System.out.println("Por favor, digite a sua nota do primeiro bimestre");
        nota1 = mediaNotas.nextFloat();
        System.out.println("Por favor, digite a sua nota do segundo bimestre");
        nota2 = mediaNotas.nextFloat();
        System.out.println("Por favor, digite a sua nota do terceiro bimestre");
        nota3 = mediaNotas.nextFloat();
        System.out.println("Por favor, digite a sua nota do quarto bimestre");
        nota4 = mediaNotas.nextFloat();

        //Processar os dados
       float soma = nota1 + nota2 + nota3 + nota4;
        float media = soma / 4;

        //Exibir os dados
        System.out.println("Sua média final é: " + media);
    }
}
