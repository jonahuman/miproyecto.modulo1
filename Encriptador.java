
public class Encriptador {

    // solo es un método pa' encriptar un texto con una clave dada en consola xd.

    public String encriptarTexto(String texto, int clave) {

        StringBuilder textoEncriptado = new StringBuilder();

        for (char caracter : texto.toCharArray()) {

            int codigoNuevo = ((caracter - 'A' + clave) % 26) + 'A';

            textoEncriptado.append((char) codigoNuevo);

        }

        return textoEncriptado.toString();

    }

}






// @author: Jonathan David.

// Alías: Flerr

// País: Chile

// Fecha: 03 de Mayo, 2024