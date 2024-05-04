
public class Descencriptador {

    public String desencriptarTexto(String textoCifrado, int clave) {

        return new Encriptador().encriptarTexto(textoCifrado, 26 - clave); // solo utiliza la clave inversa para desencriptar xd.

    }

}







// @author: Jonathan David.

// Alías: Flerr

// País: Chile

// Fecha: 03 de Mayo, 2024
