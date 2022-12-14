# entrevista-tecnica-caffenio
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
