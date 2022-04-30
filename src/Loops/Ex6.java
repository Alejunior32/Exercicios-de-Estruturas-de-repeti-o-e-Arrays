package Loops;

//Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
//        Ex.: 5!=5.4.3.2.1=120

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);

        System.out.println("Digite um numero");
        int numero=teclado.nextInt();
        int fatorial=numero;

        for(int i=numero-1;i>0;i--){
            fatorial*=i;
        }

        System.out.println(+numero+"! = "+fatorial);
    }

}
