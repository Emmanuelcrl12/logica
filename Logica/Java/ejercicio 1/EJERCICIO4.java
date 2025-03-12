package ejercicio; 

 

import java.io.*; 

 

public class Ejercicio { 

    public static void main(String[] args) throws IOException { 

        BufferedReader cp = new BufferedReader(new InputStreamReader(System.in)); 









int i = 0; 

        String contraseña = "1234"; 

 

        do { 

 

            System.out.println("Ingrese su contraseña"); 

            contraseña = cp.readLine(); 

 

            if (contraseña.equals("1234")) { 

 

                System.out.println("Su contraseña es correcta"); 

 

                i = 3; 

 

            } else { 

                System.out.println("Su contraseña es incorrecta"+ "Por favor intente de nuevo" ); 

                

                i++; 

 

            } 

 

        } while (i < 3); 

        System.out.println("Se acabaron los intentos"); 

 

 

 













}