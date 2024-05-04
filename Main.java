
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Encriptador encriptador = new Encriptador();

        Descencriptador descencriptador = new Descencriptador();

        DescencriptadorPorFuerzaBruta desencriptadorFB = new DescencriptadorPorFuerzaBruta();

        int opcion;

        while (true) {

            System.out.println("*********MENÚ***********");

            System.out.println("1.- Encriptar");

            System.out.println("2.- Descencriptar");

            System.out.println("3.- Descencriptar por fuerza bruta");

            System.out.println("4.- Salir");

            System.out.println("Selecciona una opción: ");

            opcion = scanner.nextInt();

            scanner.nextLine(); // haré un menú como esos que hago en duoc uc xd.

            switch (opcion) {

                case 1:

                    System.out.println("Introduce texto a encriptar: ");

                    String texto = scanner.nextLine();

                    System.out.println("Introduce la clave (número entero): ");

                    int clave = scanner.nextInt();

                    scanner.nextLine();

                    String textoEncriptado = encriptador.encriptarTexto(texto, clave);

                    System.out.println("Texto encriptado: " + textoEncriptado);

                    break; // se termina la opción numero 1 xd.

                case 2:

                    System.out.println("Introduce texto a descencriptar: ");

                    texto = scanner.nextLine();

                    System.out.println("Introduce la clave (número entero): ");

                    clave = scanner.nextInt();

                    scanner.nextLine();

                    String textoDescencriptado = descencriptador.desencriptarTexto(texto, clave);

                    System.out.println("Texto descencriptado: " + textoDescencriptado);

                    break;

                    case 3:

                        System.out.println("Introduce texto a descencriptar por fuerza bruta: ");

                        texto = scanner.nextLine();

                        textoDescencriptado = desencriptadorFB.desencriptarPorFuerzaBruta(texto);

                        System.out.println("Texto descencriptado por fuerza bruta: " + textoDescencriptado);

                        break;

                        case 4:

                            System.out.println("Saliendo del programa...");

                            scanner.close();

                            return;

                            default:

                                System.out.println("Opción no válida. Intente de nuevo.");

                                break;

            }

        }

    }

}


// @author: Jonathan David.

// Alías: Flerr

// País: Chile

// Fecha: 03 de Mayo, 2024
