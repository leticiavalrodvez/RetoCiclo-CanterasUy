import java.util.Scanner; //Clase para Entrada de datos primitivos.

public class RetoDoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //Objeto Scanner.

        int ingreso; //Variable Ingreso para datos del usuario.

        do { //Inicio de Do While

            System.out.println("Ingrese números de a 100."); // Solicita al usuario los datos.
            ingreso = sc.nextInt(); //Guarda el dato ingresado en la variable ingreso.

        } while (ingreso <= 500); // Mientras el dato sea menor o igual a 500 se ejecuta el Do While.

        System.out.println("Ingresó un número mayor a 500."); // Respuesta al final del Do While.

    }
}
