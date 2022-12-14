# Entrevista tecnica caffenio
# Ing. Luis Angel Izaguirre Hernandez

Ejercicios de la entrevista tecnica de caffenio para el puesto de desarrollador movil

```
1. Realizar diagrama de flujo del siguiente problema y posterior pasar a hacer la codificación del mismo.

En un estacionamiento se cuenta con los siguientes precios
Por Hora = $10
Por Fracción = $6
Promoción = $8 la hora (La promoción aplica a partir de la tercera hora)

Ejemplo 2 Horas y media:  Total = $26
Ejemplo 3 Horas y 15 min:  Total = $30 (3 horas x $8 y la fracción $6)

Ejemplificar en el diagrama la solución de los diferentes resultados que se pueden dar.
*Nota: El diagrama no tiene que respetar la nomenclatura correcta de un diagrama de flujo, con que sea entendible.
Se puede hacer en hoja de papel y se manda la foto (que se pueda leer)

Realizar una función o método que reciba como parámetro los minutos que estuvo en el estacionamiento y regrese el costo aplicando las reglas anteriores.
```

![diagrama_ejercicio_1_caffenio](https://user-images.githubusercontent.com/56525224/207530907-c1c63be7-e8b0-4607-b083-3ccc1a9635c0.PNG)

```java
public class Ejercicio1 {

    public static void main(String[] args) {
        parkingPayment(354);
    }

    public static void parkingPayment(int minutes) {

        minutes = Math.abs(minutes);

        int hour = 10;
        int fraction = 6;
        int promotion = 8;

        int hours = minutes / 60;
        int minutesRes = minutes % 60;

        int totalPayment = 0;

        System.out.printf("%d:%02d\n", hours, minutesRes);

        int fractionPayment = minutesRes != 0 ? fraction : 0;

        if (hours < 3) {
            totalPayment = (hours * hour) + fractionPayment;
        } else {
            totalPayment = (hours * promotion) + fractionPayment;
        }

        System.out.println("Usted paga: $" + totalPayment);
    }

}
```

```
2. Crear el script o codificación de la solución a este problema:

Realizar una función que reciba un texto que va ser impreso en una impresora de tickets, pero la impresora solo
imprime 20 caracteres por línea, debes de imprimir las líneas que resultan con un salto de línea al final y no debe cortar
ninguna palabra es decir si el siguiente corte queda en medio de una palabra debes buscar el espacio anterior inmediato.

Ejemplo:

Recibe: "Gracias por tu compra candidato te esperamos pronto, tu orden generó $20 pesos de monedero"

El resultado debe ser:
"Gracias por tu"
"compra candidato te"
"esperamos pronto, tu"
"orden generó $20"
"pesos de monedero"
```

```java
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
```

```
3. Crear el script o codificación de la solución a este problema:

Las versiones de software contienen la siguiente nomenclatura "1.10.1" donde cada valor de izquierda a derecha significa que es superior comparado por orden.

Hacer una función que reciba dos versiones con esa nomenclatura 1ro es la versión actual de la aplicación y el segundo la versión contra la que se va evaluar y regresa true si es superior o igual, o false si es inferior la versión actual.

Ejemplo: parametro1 actual de la app, parámetro 2 contra la que se va evaluar => Resultado
"1.10.1", "1.9.0" =>  true
"1.10.1", "1.10.1" => true
"1.10.1", "1.12.0" => false
"1.10.1", "1.10.2" => false
"1.10.1", "2.0.0" => false
```

```java
public class Ejercicio3 {

    public static void main(String[] args) {
        System.out.println(compareSofwareVersion("1.10.1", "1.9.0"));
    }

    public static boolean compareSofwareVersion(String version1, String version2) {
        String[] version1List = version1.split("\\.");
        String[] version2List = version2.split("\\.");

        int len = Math.max(version1List.length, version2List.length);

        for (int i = 0; i < len; i++) {
            int numVersion1 = (i < version1List.length) ? Integer.parseInt(version1List[i]) : 0;
            int numVersion2 = (i < version2List.length) ? Integer.parseInt(version2List[i]) : 0;
            if (numVersion1 > numVersion2) {
                return true;
            } else if (numVersion1 < numVersion2) {
                return false;
            }
        }
        return true;
    }

}
```
