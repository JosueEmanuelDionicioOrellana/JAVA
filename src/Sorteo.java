import java.util.Scanner;

public class Sorteo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("+---------------------------------------------------+");
        System.out.println("|                 ¡Sorteo del año!                  |");
        System.out.println("|Escriba los premios para el sorteo                 |");
        String [] premio = new String[6];
        int contador = 0 ;
        int numero = 1;
        while (contador<5){
            System.out.println("|Premio No."+ numero);
            premio[contador] = entrada.nextLine();
            contador++;
            numero++;
        }
        System.out.println("+---------------------------------------------------+");
        System.out.println("+----------------------+");
        System.out.println("|Los premios son:      |");
        for (int i = 0; i <contador; i++){
            System.out.println("|" + premio[i]);
        }
        System.out.println("+----------------------+");
        System.out.println("");
        System.out.println("+----------------------+");
        System.out.println("|Felicidades!!!!!      |");
        int ganador = ((int)(Math.random()*5));
        System.out.println("|gano... " + premio[ganador]);
        System.out.println("+----------------------+");

    }
}
