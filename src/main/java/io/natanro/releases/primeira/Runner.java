package io.natanro.releases.primeira;

import java.util.Scanner;

public class Runner 
{
    public static void main( String[] args )
    {
        System.out.println("*************************************");
        System.out.println("Bem-vindo(a) ao jogo de adivinhação!");
        System.out.println("*************************************");

        int numeroAleatorio = 42;
        var leitor = new Scanner(System.in);

        System.out.print("Digite o seu número: ");
        var numeroDoUsuario = leitor.nextInt();

        while (numeroDoUsuario != -1) {
            if (numeroAleatorio < numeroDoUsuario) {
                System.out.println("Você chutou um número maior. Tente novamente");
            } else if(numeroAleatorio > numeroDoUsuario) {
                System.out.println("Você chutou um número menor. Tente novamente");
            } else {
                System.out.println("Você acertou!");
                break;
            }
            
            System.out.print("Digite o seu número: ");
            numeroDoUsuario = leitor.nextInt();
        }

        System.out.println("Volte sempre ao jogo da adivinhação!");

        leitor.close();
    }
}
