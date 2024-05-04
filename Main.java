
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce texto a encriptar: ");

        String texto = scanner.nextLine();

        System.out.println("Introduce la clave (número entero): ");

        int clave = scanner.nextInt();

        Encriptador encriptador = new Encriptador();

        String textoEncriptado = encriptador.encriptarTexto(texto, clave);

        System.out.println("Texto encriptado: " + textoEncriptado);

        DescencriptadorPorFuerzaBruta desencriptadorFB = new DescencriptadorPorFuerzaBruta();

        String textoDesencriptado = desencriptadorFB.desencriptarPorFuerzaBruta(textoEncriptado);

        System.out.println("Texto desencriptado por fuerza bruta: " + textoDesencriptado);

    }

}



// @author: Jonathan David.

// Alías: Flerr

// País: Chile

// Fecha: 03 de Mayo, 2024
