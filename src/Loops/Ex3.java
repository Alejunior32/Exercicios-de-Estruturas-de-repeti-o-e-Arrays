package Loops;

/*Faça um programa que leia 5 números e informe o maior número e a média desses números.*/

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);

        float soma=0;
        int maior=0;
        int numero;
        int i=0;

        System.out.println("Digite 5 números: ");

        do{
            numero =teclado.nextInt();
            soma+=numero;
            if(numero > maior)
                maior=numero;
            i++;
        }while(i<5);

        System.out.println("Média: "+(soma/5));
        System.out.println("Maior: "+maior);
    }

}
