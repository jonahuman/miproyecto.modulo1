
public class RecorredorDeLetras {

    // este método recorre el carácter en el alfabeto según la clave dada xd.

    public char recorrerCaracter(char caracter, int clave) {

        // verifica si el carácter es una letra, de los primeros xd.

        if (Character.isLetter(caracter)) {

            char base = Character.isUpperCase(caracter) ? 'A' : 'a';

            // ya el nuevo carácter desplazado y lo devuelve además de calcularlo xd.

            return (char) ((caracter - base + clave) % 26 + base);

        }

        // es el carácter no es una letra, te lo devuelve sin cambios de una xd.

        return caracter;

    }

}


// @author: Jonathan David.

// Alías: Flerr

// País: Chile

// Fecha: 03 de Mayo, 2024
