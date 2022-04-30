package Loops;

//Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
//O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);

        System.out.println("Deseja ver a tabuada de qual número: ");
        int numero=teclado.nextInt();

        for(int i =0;i<=10;i++){

            System.out.println(+numero+"x"+i+"= "+(numero*i));
        }

        /*
        Tabuada completa

        for(int i=0; i<=10;i++){
            System.out.println();
            for(int j=0;j<=10;j++){
                System.out.println(+i+"x"+j+"= "+(i*j));
            }
        }

    }*/


    }
}