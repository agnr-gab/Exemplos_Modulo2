package br.com.zup;

//Importando o Scanner
import java.util.Scanner;

public class Aula03_25_08_21_Exemplo01 {
    public static void main(String[] args) {

    //Intaciando o meu objeto
    Scanner leitorDeDados = new Scanner(System.in);

    //Inserção de dados do usuário
        System.out.println("Digite seu nome, por favor.");
        String nomeDoUsuario = leitorDeDados.next();
        System.out.println("Digite o ano do seu nascimento");
        int anoDeNascimento = leitorDeDados.nextInt();

    //Mostrando os dados para o usuário
        System.out.println("O seu nome é: " +nomeDoUsuario + " e o ano do seu nascimento é: " +anoDeNascimento);

    }

}
