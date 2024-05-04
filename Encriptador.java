
public class Encriptador {

    // Se encripta el texto pero con una clave dada nomás xd.

    public String encriptarTexto(String texto, int clave) {

        StringBuilder textoEncriptado = new StringBuilder();

        for (char caracter : texto.toCharArray()) {

            int codigoNuevo = ((caracter - 'A' + clave) % 26) + 'A'; // Asumiendo texto en mayúsculas

            textoEncriptado.append((char) codigoNuevo);

        }

        return textoEncriptado.toString();

    }

}



// @author: Jonathan David.

// Alías: Flerr

// País: Chile

// Fecha: 03 de Mayo, 2024