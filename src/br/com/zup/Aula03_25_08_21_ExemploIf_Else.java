package br.com.zup;

import java.util.Scanner;

public class Aula03_25_08_21_ExemploIf_Else  {
    public static void main(String[] args) {
        //Trabalhando com estruturas de decisão

        Scanner suaIdade = new Scanner(System.in);
        System.out.println("Apenas usuários de maioridade podem acessar a área de bebidas álcolicas");
        System.out.println("Insira sua idade, por favor.");

        int idadeUsuario = suaIdade.nextInt();
        if (idadeUsuario >= 18){
            System.out.println("Bem vinde ao setor de bebidas alcoolicas!");
        }
        else {
            System.out.println("Apenas usuários de maioridade podem acessar a área de bebidas álcolicas");
        }
    }
}
