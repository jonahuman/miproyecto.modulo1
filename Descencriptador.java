
public class Descencriptador {

    // se descenripta el texto con la clave que des en consola xd.

    public String desencriptarTexto(String textoCifrado, int clave) {

        return new Encriptador().encriptarTexto(textoCifrado, 26 - clave); // Utiliza la clave inversa

    }

}


// @author: Jonathan David.

// Alías: Flerr

// País: Chile

// Fecha: 03 de Mayo, 2024
