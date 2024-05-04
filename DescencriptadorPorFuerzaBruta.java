
public class DescencriptadorPorFuerzaBruta {

    // se puede dar desencriptado a un texto cualquiera pero por fuerza bruta xd.

    public String desencriptarPorFuerzaBruta(String textoEncriptado) {

        for (int clave = 0; clave < 26; clave++) {

            String textoDesencriptado = new Descencriptador().desencriptarTexto(textoEncriptado, clave);

            if (contienePalabrasEnEspanol(textoDesencriptado)) {

                return textoDesencriptado;

            }

        }

        return "Texto no desencriptado.";

    }

    // Método auxiliar para verificar si el texto contiene palabras comunes en español.

    private boolean contienePalabrasEnEspanol(String texto) {

        String[] palabrasComunes = {"el", "la", "de", "y", "en"};

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

