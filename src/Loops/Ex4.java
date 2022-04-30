package Loops;

import java.util.Scanner;

//Faça um programa que peça N números inteiros. Calcule e mostre a quantidade de números pares e a quantidade de números impares.
public class Ex4 {

    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);

        int i=0,N, numero;
        int pares=0;
        int impares=0;

        System.out.println("Digite a quatidade de números Inteiros: ");
        N=teclado.nextInt();
        System.out.println("Digite "+N+" Números: ");

        do{
            numero=teclado.nextInt();
            if(numero %2 == 0 )
                pares++;
            else
                impares++;
            i++;
        }while(i<N);

        System.out.println("Você digitou "+pares+" números pares e "+impares+" numeros impares.");

    }
}
