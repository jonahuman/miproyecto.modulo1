public class DescencriptadorPorFuerzaBruta {

    public String desencriptarPorFuerzaBruta(String textoEncriptado) {

        Descencriptador descencriptador = new Descencriptador();

        for (int clave = 1; clave <= 26; clave++) { // solo porque en gringolandia no hay ñ XD.

            String textoDesencriptado = descencriptador.desencriptarTexto(textoEncriptado, clave);

            if (textoDesencriptado.contains(" ")) { // suponiendo que un espacio es el indicador de texto en español

                return textoDesencriptado;

            }

        }

        return "No se pudo desencriptar el mensaje con las claves probadas.";

    }

}



// @author: Jonathan David.

// Alías: Flerr

// País: Chile

// Fecha: 03 de Mayo, 2024

