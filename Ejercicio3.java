// 3. Crear el script o codificación de la solución a este problema:

// Las versiones de software contienen la siguiente nomenclatura "1.10.1" donde cada valor de izquierda a derecha significa que es superior comparado por orden.

// Hacer una función que reciba dos versiones con esa nomenclatura 1ro es la versión actual de la aplicación y el segundo la versión contra la que se va evaluar y regresa true si es superior o igual, o false si es inferior la versión actual.

// Ejemplo: parametro1 actual de la app, parámetro 2 contra la que se va evaluar => Resultado
// "1.10.1", "1.9.0" =>  true
// "1.10.1", "1.10.1" => true
// "1.10.1", "1.12.0" => false
// "1.10.1", "1.10.2" => false
// "1.10.1", "2.0.0" => false

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
