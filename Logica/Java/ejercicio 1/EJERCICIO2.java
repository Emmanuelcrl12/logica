package ejercicio; 

 

import java.io.*; 

 

public class Ejercicio { 

    public static void main(String[] args) throws IOException { 

        BufferedReader cp = new BufferedReader(new InputStreamReader(System.in)); 


int nnumero, numeros, suma = 0; 

        int i = 0; 

        double promedio = 0; 

 

        System.out.println("Digite la cantidad de números que desea ingresar"); 

        nnumero = Integer.parseInt(cp.readLine()); 

        do { 

            System.out.println("Digite un número"); 

            numeros = Integer.parseInt(cp.readLine()); 

 

            suma += numeros; 

            i++; 

        } while (i < nnumero); 

 

        promedio = suma / i; 

 

        System.out.println("Ha igresado " + ""+ nnumero + "numeros"); 

        System.out.println("La suma de los números es : \n" + suma); 

        System.out.println("El promedio es: \n" + promedio); 

 









}