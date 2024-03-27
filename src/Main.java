import java.lang.reflect.Array;
import java.util.ArrayList;

//Parte a y b

/*
    Approach: Se me ocurren 2 maneras de resolver este problema, la primera es teniendo un for anidado, recorriendo en el primer for
    el primer Array de Strings, y en el segundo for el segundo Array de Strings después comparamos si los caractéres de la variable del primer for
    son iguales a los caractéres de la variable del segundo for, y si lo son creamos un nuevo array conteniendo los duplicados.
    Este algoritmo tendría un time complexity de O(n^2) y un space complexity de O(n) debido a qué la cantidad de operaciónes que se van a realizar
    en los for va a depender de la cantidad de elementos que tenga cada array y utilizamos una estructura adiccional para almacenar los duplicados y devolverlos

    2 manera:Esta es más eficiente, y es utilizando la técnica de two-pointers, uno que recorra el primer array y otro que recorra el segundo array
    podríamos realizar la comparación con un solo while(adentro del while la condición sería que el primer puntero recorra hasta que sea menor o igual a la longitud
    del primer array, y que el segundo puntero recorra hasta que sea menor o igual a la longitud del segundo array), comparamos si los valores en la misma posición
    de los punteros son iguales, y si lo són, entonces creamos un nuevo array conteniendo los duplicados.
    Este algoritmo tendría un time complexity de O(n) y un space complexity de O(min(n, m))
    Hay que para qué este algoritmo funcione, los duplicados tienen que estar en la misma posición.

 */

public class Main {

    //Segunda manera
      public String[] palabrasComunes(String[] palabras1, String[] palabras2) {
        ArrayList<String> palabrasComunesEntreArrays = new ArrayList<>();
        int pointerPalabras1 = 0;
        int pointerPalabras2 = 0;
        while(pointerPalabras1 < palabras1.length && pointerPalabras2 < palabras2.length){
            if(palabras1[pointerPalabras1].equals(palabras2[pointerPalabras2])) {
                palabrasComunesEntreArrays.add(palabras1[pointerPalabras1]);
            }
            pointerPalabras1++;
            pointerPalabras2++;

        }
        return palabrasComunesEntreArrays.toArray(new String[0]);
    }


    public static void main(String[] args) {
        Main main = new Main();
        String[] palabras1 = {"hola","mundo", "de", "los", "algoritmos"};
        String[] palabras2 = {"hola", "mundo", "de", "algoritmos", "informatica"};

        String[] comunes = main.palabrasComunes(palabras1, palabras2);

        for(String palabra : comunes) {
            System.out.println(palabra);
        }
    }
}
    //Primer manera
    /*
      public String[] palabrasComunes(String[] palabras1, String[] palabras2) {
        ArrayList<String> palabrasComunesList = new ArrayList<>();
        for(int i = 0; i < palabras1.length; i++) {
            for(int j = 0; j < palabras2.length; j++) {
                if(palabras1[i].equals(palabras2[j])) {
                    palabrasComunesList.add(palabras1[i]);
                }
            }
        }
        return palabrasComunesList.toArray(new String[0]);
    }
    public static void main(String[] args) {
        Main main = new Main();
        String[] palabras1 = {"hola","mundo", "de", "los", "algoritmos"};
        String[] palabras2 = {"hola", "mundo", "de", "algoritmos", "informatica"};
        String[] comunes = main.palabrasComunes(palabras1, palabras2);

        for(String palabra : comunes) {
            System.out.println(palabra);
        }

    }
     */