import com.sun.source.tree.WhileLoopTree;

import java.util.*;

public class Programa_1 {
    public static void main(String[] args) {
        while (true) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("+----------------------------------+");
            System.out.println("|  Ejercicio de strings y cadenas  |");
            System.out.println("|Escoja una de las opciones dadas  |");
            System.out.println("|   [1]. Tamaño                    |");
            System.out.println("|   [2]. Subcadena                 |");
            System.out.println("|   [3]. Comparación de palabras   |");
            System.out.println("|   [4]. Comparación de tamaño     |");
            System.out.println("+----------------------------------+");
            String opcion = entrada.next();
            switch (opcion) {
                case "1":
                    System.out.println("+----------------------------------+");
                    System.out.println("|             Cadena               |");
                    System.out.println("|Escriba una oración               |");
                    Scanner entrada1 = new Scanner(System.in);
                    String var1 = entrada1.nextLine();
                    int tamaño = var1.length();
                    System.out.println("|El tamaño de la cadena es " + tamaño);
                    System.out.println("+----------------------------------+");
                    break;
                case "2":
                    System.out.println("+----------------------------------+");
                    System.out.println("|             Subcadena            |");
                    System.out.println("|Escriba una oracion               |");
                    Scanner entrada2 = new Scanner(System.in);
                    String var2 = entrada2.nextLine();
                    int entero;
                    int entero1;
                    int tamaño2 = var2.length();
                    while (true) {
                        System.out.println("|Escriba el limite inicial         |");
                        String var3 = entrada2.nextLine();
                        entero = Integer.parseInt(var3);
                        if (entero < tamaño2) {
                            break;
                        }
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println("+-----------------------------------------------------------------+");
                        System.out.println("|ERROR 1: El valor que coloco esta fuera de rango de lo que coloco|");
                        System.out.println("|vuelva a escribir el limite                                      |");
                        System.out.println("+-----------------------------------------------------------------+");
                    }
                    while (true) {
                        System.out.println("|Escriba el limite del final       |");
                        String var4 = entrada2.nextLine();
                        entero1 = Integer.parseInt(var4);
                        if (entero < entero1 && tamaño2 > entero1) {
                            break;
                        }
                        System.out.println("+-----------------------------------------------------------------+");
                        System.out.println("|ERROR 2: El valor que coloco esta fuera de rango de lo que coloco|");
                        System.out.println("|vuelva a escribir el limite                                      |");
                        System.out.println("+-----------------------------------------------------------------+");
                    }
                    String cadena = var2.substring(entero, entero1);
                    System.out.println("|la oracion principal es " + var2 + " |");
                    System.out.println("ya con limites seria " + cadena + "|");
                    System.out.println("+-----------------------------------------+");
                    break;
                case "3":
                    System.out.println("+----------------------------------+");
                    System.out.println("|      Comparación de palabras     |");
                    System.out.println("|Escriba la primera palabra        |");
                    Scanner entrada3 = new Scanner(System.in);
                    String var3 = entrada3.nextLine();
                    System.out.println("|Escriba la segunda palabra        |");
                    String var4 = entrada3.nextLine();
                    System.out.println("|¿Desea ignorar las mayusculas?    |");
                    System.out.println("|   [1]. Si                        |");
                    System.out.println("|   [2]. No                        |");
                    String var5 = entrada3.nextLine();
                    switch (var5) {
                        case "1":
                            String conver1 = var3.toUpperCase();
                            String conver2 = var4.toUpperCase();
                            if (conver1 != conver2) {
                                System.out.println("|la palabra " + var3 + " y " + var4 + " son compatibles|");
                                System.out.println("+------------------------------------------------------+");
                                break;
                            }
                            System.out.println("|la palabra " + var3 + " y " + var4 + " no son compatibles|");
                            System.out.println("+------------------------------------------------------+");
                            break;

                        case "2":
                            if (var3 != var4) {
                                System.out.println("|la palabra " + var3 + " y " + var4 + " no son compatibles|");
                                System.out.println("+------------------------------------------------------+");
                                break;
                            }
                            System.out.println("|la palabra " + var3 + " y " + var4 + " no son compatibles|");
                            System.out.println("+------------------------------------------------------+");
                            break;

                        default:
                            System.out.println(" ");
                            System.out.println(" ");
                            System.out.println("+-----------------------------------+");
                            System.out.println("|ERROR 3 :Escoja una de las opciones|");
                            System.out.println("+-----------------------------------+");
                            break;
                    }
                    break;

                case "4":
                    System.out.println("+----------------------------------+");
                    System.out.println("|      Comparación de tamaño       |");
                    System.out.println("|Escriba la primera oración        |");
                    Scanner entrada4 = new Scanner(System.in);
                    String var6 = entrada4.nextLine();
                    int var7 = var6.length();
                    String var8 = var6.replace(" ", "");
                    System.out.println("|Escriba la segunda oración        |");
                    String var9 = entrada4.nextLine();
                    int var10 = var6.length();
                    String var11 = var6.replace(" ", "");
                    System.out.println("|¿Desea ignorar los espacios?    |");
                    System.out.println("|   [1]. Si                        |");
                    System.out.println("|   [2]. No                        |");
                    String var12 = entrada4.nextLine();
                    switch (var12) {
                        case "1":
                            if (var8 != var11) {
                                System.out.println("|la palabra " + var6 + " y " + var9 + " son compatibles|");
                                System.out.println("+---------------------------------------------------------------------+");
                                break;
                            }
                            System.out.println("|la palabra " + var6 + " y " + var9 + " no son compatibles|");
                            System.out.println("+-------------------------------------------------------------------------+");
                            break;

                        case "2":
                            if (var7 != var10) {
                                System.out.println("|la palabra " + var6 + " y " + var9 + " no son compatibles|");
                                System.out.println("+--------------------------------------------------------------------+");
                                break;
                            }
                            System.out.println("|la palabra " + var6 + " y " + var9 + " no son compatibles|");
                            System.out.println("+------------------------------------------------------------------------+");
                            break;

                        default:
                            System.out.println(" ");
                            System.out.println(" ");
                            System.out.println("+-----------------------------------+");
                            System.out.println("|ERROR 3 :Escoja una de las opciones|");
                            System.out.println("+-----------------------------------+");
                            break;

                    }
            }
        }
    }
}

