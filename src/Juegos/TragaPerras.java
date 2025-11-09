package Juegos;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TragaPerras {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int banca, dinero = 0, opcion;
        menu();
        do {
            System.out.print("Elige una opción: ");
            opcion = scn.nextInt();
        }while (opcion != 1 && opcion != 2);
        switch (opcion){
            case 1:
                menuJuego(dinero);
                opcion = scn.nextInt();
                switch (opcion){
                    case 1:
                        menuAddDinero(dinero);
                        dinero = scn.nextInt();
                    case 2:
                        System.out.println("Introduce tu apuesta");
                        int apuesta = scn.nextInt();
                        while (apuesta > dinero){
                            System.out.println("La apuesta no puede ser mayor a tu dinero.");
                            System.out.println("Introduce tu apuesta: ");
                            apuesta = scn.nextInt();
                        }
                            List<String> list = List.of("🍌", "🍇", "🍊", "🍋", "🍒", "🍀");
                            Random random = new Random();
                            String randomElement1 = list.get(random.nextInt(list.size()));
                            System.out.print(randomElement1);
                            String randomElement2 = list.get(random.nextInt(list.size()));
                            System.out.print(randomElement2);
                            String randomElement3 = list.get(random.nextInt(list.size()));
                            System.out.println(randomElement3);
                            int premio = premio(randomElement1, randomElement2, randomElement3, apuesta);
                            apuesta -= premio;
                            System.out.println("Premio: " + premio);
                            scn.nextLine();


                } break;
            case 2:
                System.out.println("¡Hasta pronto!");
                return;
            default:
                break;
        }



    }
    public static boolean equals(String random1, String random2, String random3) {
        return random1.equals(random2) && random1.equals(random3);
    }
     public static int premio(String random1, String random2, String random3, int dinero){
        if (equals(random1, random2, random3)){
            dinero = 1;
            switch (random1){
             case "🍌":
             case "🍇":
             case "🍊":
             case "🍋":
             case "🍒":
                 dinero *= 2; break;

             case "🍀":
                 dinero*= dinero;
            }
        }
        return dinero -= dinero;
     }
     public static void menu(){
         System.out.println("CASINO DAM");
         System.out.println("-----------");
         System.out.println("1. Jugar");
         System.out.println("2. Salir");
         System.out.println("-----------");

     }
    public static void menuJuego(int dinero){
        System.out.println("CASINO DAM");
        System.out.println("Dinero actual: "+dinero);
        System.out.println("-----------");
        System.out.println("1. Añadir dinero.");
        System.out.println("2. Jugar");
        System.out.println("-----------");

    }
    public static void menuAddDinero(int dinero){
        System.out.println("CASINO DAM");
        System.out.println("Dinero actual: "+dinero);
        System.out.println("-----------");
        System.out.print("Introduce el deposito que quieres realizar: ");

    }
}