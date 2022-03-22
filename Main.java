import java.util.Scanner;

class Main{
public static void main(String[]args){
Scanner scana = new Scanner(System.in);
  System.out.println("Podaj liczbe a");
 int a = scana.nextInt();
  Scanner scanb = new Scanner(System.in);
  System.out.println("Podaj liczbe b");
 int b = scanb.nextInt();
  System.out.println("a="+a);
  System.out.println("b="+b);
  int suma=a+b;
  System.out.println("suma="+suma);
}
  
}
