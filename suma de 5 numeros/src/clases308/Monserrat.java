package clases308;

import java.util.Scanner;

public class Monserrat 
{
    public static void main(String[] args) 
    {
      Scanner leer=new Scanner(System.in);
        Float num01, num02, num03, num04, num05, suma;
        System.out.print("Ingresa el primer numero: ");
        num01=leer.nextFloat();
        System.out.print("Ingresa el segundo numero: ");
        num02=leer.nextFloat();
        System.out.print("Ingresa el tercer numero: ");
        num03=leer.nextFloat();
        System.out.print("Ingresa el cuarto numero: ");
        num04=leer.nextFloat();
        System.out.print("Ingresa el quinto numero: ");
        num05=leer.nextFloat();
        suma=num01+num02+num03+num04+num05;
        System.out.print("La suma es: "+suma);
    }
    
}
