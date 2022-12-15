import java.util.Scanner; //Clase para Entrada de datos primitivos.

public class RetoFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //Objeto Scanner

        int num = 0; //Variable num para el ingreso del dato del usuario.
        int contador = 0; //Variable contador para guardar las multiplicaciones.

        System.out.println("Ingrese el número para la tabla de multiplicar"); //Solicitud de datos al usuario
        num = sc.nextInt(); //Guarda el dato igresado por el usuario en la variable num.

        for(int i = 0; i <= 10; i++){ //For con la variable i como índice

            contador = num * i; //Realiza la multiplicación de num variable contenedora del numero ingresado por el usuario y i indice del For.

            System.out.println(num + " * " + i + " = " + contador); //Muestra al usuario el resultado

        }
    }
}