package Arrays;

import java.util.Scanner;

//Consoantes: Faça um Programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes.

public class Ex2 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);

        String[] letras = new String[6];
       String[] consoantes= new String[6];
        int quantidadeConsoantes=0;

        System.out.println("Digite 6 letras: ");
        
        for(int i=0;i< letras.length;i++){
            letras[i]=teclado.nextLine();

            if(! (letras.equals('a') || letras.equals('e') || letras.equals('i') || letras.equals('o') ||letras.equals('u'))){


                quantidadeConsoantes++;

            }

        }
        
       

    }
}
