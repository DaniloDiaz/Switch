package programacion2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Programacion2 {

public static void main(String[] args) throws NumberFormatException,IOException {
BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

System.out.println("Ingrese un número del 1 al 7 ");
int dias = Integer.parseInt(lectura.readLine());

    switch (dias) {
    
case 1:
        System.out.println("LUNES");
        break;
case 2:
        System.out.println("MARTES");
        break;
case 3:
        System.out.println("MIERCOLES");
        break;
case 4:
        System.out.println("JUEVES");
        break;
case 5:
        System.out.println("VIERNES");
         break;
case 6:
        System.out.println("SÁBADO");
        break;
case 7:
        System.out.println("");
        break;
default:
        System.out.println("Eleccion Incorrecta");
}
    }

}
