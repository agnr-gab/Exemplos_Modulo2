package br.com.zup;

import java.util.Scanner;

public class Aula03_25_08_21_Exemplo04 {
    public static void main(String[] args) {
        Scanner leitorSalario = new Scanner(System.in);
        // 4 - Faça um Programa que recebe o quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

        // Definindo Variáveis
        float horasTrabalhadas;
        float salarioPorHora;

        //Solicitando as informações do usuário
        System.out.println("Por favor insira o total de horas trabalhadas este mês");
        horasTrabalhadas = leitorSalario.nextFloat();
        System.out.println("Agora, por favor insira seu salário por hora");
        salarioPorHora = leitorSalario.nextFloat();

        //Calculando o salário sem impostos
        double salario = horasTrabalhadas * salarioPorHora;

        //Calculando impostos
        double inss = salario * 0.08;
        double sindicato = salario * 0.05;
        double impostoDeRenda = salario * 0.11;

        //Calculando o salario liquido
        double salarioLiquido = salario - inss - sindicato - impostoDeRenda;

        //Mostrando a informação ao usuário
        System.out.println("Esse mês você trabalhou " + horasTrabalhadas + " horas, com um salário de R$" + salarioPorHora + " reais por hora.");
        System.out.println("O valor do seu salário bruto é de R$" + salario + " reais");
        System.out.println("Foi descontado R$" + inss + " reais referente ao INSS e R$" + sindicato + " reais referente ao pagamento do sindicato" );
        System.out.println("Seu salário líquido será de R$" + salarioLiquido);

    }
}
