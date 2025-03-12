package ejercicio; 




 

import java.io.*; 

 

public class Ejercicio { 

    public static void main(String[] args) throws IOException { 

        BufferedReader cp = new BufferedReader(new InputStreamReader(System.in)); 


//CICLOS CON SUMA DE NUMEROS
 

        int i = 1, suma = 0, numero; 

 

        do { 

            System.out.println("Digite un número"); 

            numero = Integer.parseInt(cp.readLine()); 

 

            suma += numero; 

            i++; 

 

        } while (i <= 5); 

        System.out.println("La suma de los 5 números es\n" + suma); 

 

    } 

} 