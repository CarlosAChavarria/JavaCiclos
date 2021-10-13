package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// ciclo ------------------ for ----------------------------
        //imprimiendo tablas de multiplicar
       /*Scanner sc = new Scanner(System.in);
       System.out.print("Ingresa el número de la tabla de multiplicar que quiere: ");
       int num = sc.nextInt();
       sc.close();
       for(int i = 1; i<=10; i++){
           System.out.println(num + " * " + i + " = " + num*i);
       }

       //--------Ejercicio serie fibonacci--------
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número : ");
       int num = sc.nextInt();

       int actual = 0;
       int anterior = 1;
       int suma = 0;
       for(int i = 0; i<=num; i++){
           System.out.print(suma + ", ");
           suma=actual+anterior;
           actual=anterior;
           anterior=suma;
       }

       //break and continue
        //break
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el número de la tabla de multiplicar que quiere: ");
        int num = sc.nextInt();
        sc.close();
        for(int i = 1; i<=10; i++){
            if(i == 6){
                break;
            }
            System.out.println(num + " * " + i + " = " + num*i);
        }

        //continue
        //solo imprime los pares
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el número de la tabla de multiplicar que quiere: ");
        int num = sc.nextInt();
        sc.close();
        for(int i = 1; i<=10; i++){
            if(i%2 != 0){
                continue;
            }
            System.out.println(num + " * " + i + " = " + num*i);
        }
        */


       //ciclo ----------------------- while ----------------------

        /*Scanner sc = new Scanner(System.in);
        int numSecret = 24;
        int num = 0;
        while (num != numSecret){
            System.out.print("Adivina el numero : ");
            num = sc.nextInt();
        }
        System.out.println("Lo adivinaste");
        sc.close();*/

       //ciclo ------------------------- do-while --------------------
        /*Scanner sc = new Scanner(System.in);
        int numSecret = 24;
        int num = 0;
        do{
            System.out.print("Adivina el numero : ");
            num = sc.nextInt();
        }while (num != numSecret);*/

        //factorial de un numero
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el número : ");
        int num = sc.nextInt();
        int fact = 1;
        while (num != 0){
            fact=fact * num;
            num--;
        }
        System.out.print(fact);
        /*int i = 1;
        do{
            num = num * i;
            //num = mul;
            i++;
        }while(i<num);
        System.out.print(num);*/
    }
}
