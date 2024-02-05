package org.example;
import javax.print.DocFlavor;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String nompreJ1, nombreJ2,piedra="piedra",papel="papel",tijera="tijera",opcion1,opcion2;
        Scanner leerDato=new Scanner(System.in);
        System.out.println("ingrese nombre del jugador 1");
        nompreJ1=leerDato.nextLine();
        System.out.println("ingrese nombre del jugador 2");
        nombreJ2=leerDato.nextLine();
        System.out.println(nompreJ1+"que escoje, piedra,papel o tijera");
        opcion1=leerDato.nextLine();

        System.out.println(nombreJ2 + "que escoje, piedra, papel o tijera");
        opcion2=leerDato.nextLine();
        if (opcion1.equals("piedra") & opcion2.equals("tijera")|| opcion1.equals("papel")&opcion2.equals("piedra")||opcion1.equals("tijera")&opcion2.equals("papel")){
            System.out.println(nompreJ1+"haz ganado!");

        }else if (((opcion2.equals("piedra") & opcion1.equals("tijera")|| opcion2.equals("papel")&opcion1.equals("piedra")||opcion2.equals("tijera")&opcion1.equals("papel")))){
            System.out.println(nombreJ2+"haz ganado!");

        }else if (((opcion2.equals("piedra") & opcion1.equals("piedra")|| opcion2.equals("papel")&opcion1.equals("papel")||opcion2.equals("tijera")&opcion1.equals("tijera")))){
            System.out.println(nompreJ1+"y"+nombreJ2+"tienen empate!");
    }else System.out.println("ingresen datos validos");{
}
}}