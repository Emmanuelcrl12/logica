package ejercicio; 

 

import java.io.*; 

 

public class Ejercicio { 

    public static void main(String[] args) throws IOException { 

        BufferedReader cp = new BufferedReader(new InputStreamReader(System.in)); 



  int i = 0; 

        double edad = 0, promedio = 0, suma = 0; 

        String continuar = "si"; 

 

        do { 

            System.out.println("Digite una edad"); 

            edad = Double.parseDouble(cp.readLine()); 

 

            suma += edad; 

            i++; 

 

            System.out.println("¿Desea ingresar otra edad?"); 

 

            continuar = cp.readLine(); 

 

            promedio = suma / i; 

 

        } while (continuar.equalsIgnoreCase("si")); 

 

        System.out.println("Usted ha ingresado " + i + "\nedades"); 

        System.out.println("La suma de las edades" + suma); 

        System.out.println("El promedio de las edades es" + promedio); 

 


}