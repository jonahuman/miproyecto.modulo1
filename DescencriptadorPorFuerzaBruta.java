
public class DescencriptadorPorFuerzaBruta {

    private Descencriptador descencriptador = new Descencriptador();

    public String desencriptarPorFuerzaBruta(String textoEncriptado) {

        // yo creo que el rango de claves y va de 1 a 26 (para el alfabeto inglés) xd.

        for (int clave = 1; clave <= 26; clave++) {

            String textoDesencriptado = descencriptador.desencriptarTexto(textoEncriptado, clave);

            if (esTextoEnEspanol(textoDesencriptado)) {

                System.out.println("Clave encontrada: " + clave);

                System.out.println("Texto desencriptado: " + textoDesencriptado);

                return textoDesencriptado;

            }

        }

        return "No se pudo desencriptar el mensaje con las claves probadas.";

    }

    private boolean esTextoEnEspanol(String texto) {

        // para palabras comunes en español neutro y chileno que podrían indicar que el texto está en español xd.

        String[] palabrasComunes = {"el", "la", "de", "y", "en", "que", "los", "del", "se", "las"};

        for (String palabra : palabrasComunes) {

            if (texto.contains(palabra)) {

                return true;

            }

        }

        return false;

    }

}


// @author: Jonathan David.

// Alías: Flerr

// País: Chile

// Fecha: 03 de Mayo, 2024

