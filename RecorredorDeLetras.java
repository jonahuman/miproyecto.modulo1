
public class RecorredorDeLetras {

    public char recorrerCaracter(char caracter, int clave) {

        if (Character.isLetter(caracter)) {

            char base = Character.isUpperCase(caracter) ? 'A' : 'a';

            return (char) ((caracter - base + clave) % 26 + base);

        }

        return caracter;

    }

}



// @author: Jonathan David.

// Alías: Flerr

// País: Chile

// Fecha: 03 de Mayo, 2024
