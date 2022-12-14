
// 2. Crear el script o codificación de la solución a este problema:

// Realizar una función que reciba un texto que va ser impreso en una impresora de tickets, pero la impresora solo
// imprime 20 caracteres por línea, debes de imprimir las líneas que resultan con un salto de línea al final y no debe cortar
// ninguna palabra es decir si el siguiente corte queda en medio de una palabra debes buscar el espacio anterior inmediato.

// Ejemplo:

// Recibe: "Gracias por tu compra candidato te esperamos pronto, tu orden generó $20 pesos de monedero"

// El resultado debe ser:
// "Gracias por tu"
// "compra candidato te"
// "esperamos pronto, tu"
// "orden generó $20"
// "pesos de monedero"

import java.util.ArrayList;

public class Ejercicio2 {

    public static void main(String[] args) {
        printPhrase("Gracias por tu compra candidato te esperamos pronto, tu orden genero $20 pesos de monedero");
    }

    public static void printPhrase(String phrase) {

        String[] phraseList = phrase.split(" ");
        String lineString = "";
        ArrayList<String> paragraphs = new ArrayList<String>();

        for (int i = 0; i < phraseList.length; i++) {

            int lineLength = lineString.length() + phraseList[i].length();
            if (lineLength <= 20) {
                lineString += phraseList[i] + " ";
            } else {
                paragraphs.add(lineString);
                lineString = phraseList[i] + " ";
            }
        }

        paragraphs.add(lineString);

        for (var linea : paragraphs) {
            System.out.println(linea);
        }
    }
}
