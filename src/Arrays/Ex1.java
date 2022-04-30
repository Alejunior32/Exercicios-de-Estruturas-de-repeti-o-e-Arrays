package Arrays;

//Ordem Inversa: Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa.

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int[] vetor = new int[5];
        System.out.println("Digite 5 números inteiros: ");

        for(int i=0;i < vetor.length;i++){
            vetor[i]=teclado.nextInt();
        }

        for(int j=vetor.length-1;j>=0;j--){
            System.out.println("Vetor ["+j+"] = "+vetor[j]);
        }

    }
}
