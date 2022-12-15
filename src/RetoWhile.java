import java.util.Scanner; //Clase para Entrada de datos primitivos.

public class RetoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //Objeto Scanner.

        String verificador = "si"; //Variable Verificador.

        while (verificador.equals("si")){ //While de menú.

            System.out.println("Menu de Frutería: \n[1] Lista de frutas \n[2] Lista de verduras \n[3] Lista de hortalizas \nSeleccione una opción (Ingrese el número correspondiente)."); //Muestra opciones del menú
            verificador = sc.nextLine(); //Guarda el dato del usuario.

            if (verificador.equals("1")){ //If para mostrar las opciones que haya elegido el usuario.

                System.out.println("Cereza\n" + "Ciruela\n" + "Higo\n" + "Manzana\n" + "Melocotón\n" + "Pera\n" + "Uva");

            } else if (verificador.equals("2")){

                System.out.println("Nabo\n" + "Puerro\n" + "Brócoli\n" + "Coliflor\n" + "Ajo\n" + "Patata\n");

            } else if (verificador.equals("3")){

                System.out.println("Cebolla\n" + "Zanahoria\n" + "Berenjena\n" + "Pimiento");

            } else {

                System.out.println("Eligió una opción no válida."); //En caso de que no elija una opcion valida.

            }

            System.out.println("Desea continuar con el menú?(si/no)"); //Pregunta al usuario si desea continuar
            verificador = sc.nextLine();

        }

    }
}
