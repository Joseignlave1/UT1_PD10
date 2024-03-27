import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Parte c
public class Ejercicio1Partec {

    public static List<String> leerArchivo(String rutaArchivo) {

        List<String> lineas = new ArrayList<>();
        try(FileReader fr = new FileReader("/C:/Users/Leo84/IdeaProjects/UT1_PD10/out/production/UT1_PD10/entrada.txt");
            BufferedReader br = new BufferedReader(fr)) {
            String lineaActual;
            while((lineaActual = br.readLine()) != null) {
                lineas.add(lineaActual);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Archivo leído correctamente");
        return lineas;
    }
    public static String[] palabrasComunes(String[] palabras1, String[] palabras2) {
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
        List<String> lineas = leerArchivo("entrada.txt");

        Random rand = new Random();
        int indiceLinea1 = rand.nextInt(lineas.size());
        int indiceLinea2 = rand.nextInt(lineas.size());

        String linea1 = lineas.get(indiceLinea1);
        String linea2 = lineas.get(indiceLinea2);

        String[] palabras1 = linea1.split(" ");
        String[] palabras2 = linea2.split(" ");

        String[] comunes = palabrasComunes(palabras1, palabras2);

        System.out.println("Palabras comunes entre las líneas " + indiceLinea1 + " y " + indiceLinea2 + ":");
        for (String palabra : comunes) {
            System.out.println(palabra);
        }
    }
}
