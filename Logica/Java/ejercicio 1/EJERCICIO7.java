package ejercicio; 

 

import java.io.*; 

 

public class Ejercicio { 

    public static void main(String[] args) throws IOException { 

        BufferedReader cp = new BufferedReader(new InputStreamReader(System.in)); 


System.out.println("Digitre un número del 1 al 12"); 

        int MES = Integer.parseInt(cp.readLine()); 

  

        switch (MES) { 

            case 1: 

                System.out.println("El mes es enero"); 

                break; 

            case 2: 

                System.out.println("El mes es Febrero"); 

                break; 

            case 3: 

                System.out.println("El mes es Marzo"); 

                break; 

            case 4: 

                System.out.println("El mes es Abríl"); 

                break; 

            case 5: 

                System.out.println("El mes es Mayo"); 

                break; 

            case 6: 

                System.out.println("El mes es Junio"); 

                break; 

            case 7: 

                System.out.println("El mes es Julio"); 

                break; 

            case 8: 

                System.out.println("El mes es Agosto"); 

                break; 

            case 9: 

                System.out.println("El mes es Sweptiembre"); 

                break; 

            case 10: 

                System.out.println("El mes es Octubre"); 

                break; 

            case 11: 

                System.out.println("El mes es Noviembre"); 

                break; 

            case 12: 

                System.out.println("El mes es Diciembre"); 

                break; 

            default: 

                System.out.println("El número ingresado no corresponde a ningún mes del año"); 















}