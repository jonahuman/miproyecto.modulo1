
public class Encriptador { // ya ni sé que hago con esta clase xd.

    public String encriptarTexto(String texto, int clave) {

        RecorredorDeLetras recorredor = new RecorredorDeLetras();

        StringBuilder textoEncriptado = new StringBuilder();

        for (char caracter : texto.toCharArray()) {

            textoEncriptado.append(recorredor.recorrerCaracter(caracter, clave));

        }

        return textoEncriptado.toString();

    }

}

// @author: Jonathan David.

// Alías: Flerr

// País: Chile

// Fecha: 03 de Mayo, 2024