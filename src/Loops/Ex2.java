package Loops;

//Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja
//inválido e continue pedindo até que o usuário informe um valor válido.

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a nota :");
        int nota=teclado.nextInt();

        while(nota <0 || nota > 10){
            System.out.println("Valor inválido");
            nota = teclado.nextInt();
        }

    }

}
