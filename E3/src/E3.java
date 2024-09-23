
import java.io.File;
import java.io.IOException;
import java.io.StreamCorruptedException;
import java.util.Arrays;
import java.util.Comparator;



/*
 * Mètodes de la classe FILE:
 * renameTo()
 * File[] listFiles()
 *
 * Mètodes de la classe ARRAYS
 * sort()
 *
 * Per imprimir els axrius i directoris de manera ordenada, crearem una funció anomenada imprimirLlistaArxius()
 * Per esborrar les extensions crearem una funció anomenada llevarExtensionsArxius()
 *
 */

public class E3 {


    /* **************************
     * Reanomenem les carpetes *
     * **************************/

// Creem dos objectes de tipus File on assignem la ruta d'origen i la ruta destí. (PER A LA CARPETA DOCUMENTS)       

    public static void main(String args[]) {

        File docOrigen = new File("Documentos");
        File docDesti = new File("DOCS");

// Comprove que la carpetada DOCUMENTOS esta creada, simplement és per acotar errors

        if (!docOrigen.exists())
            System.out.println("COMPROVA QUE LA CARPETA DOCUMENTS ESTA CREADA I LA RUTA ES CORRECTA");

// Reanomenem la carpeta Documents

        docOrigen.renameTo(docDesti);

// Creem dos objectes de tipus File on assignem la ruta d'origen i la ruta destí. // (PER A LA CARPETA FOTOGRAFIAS) i canviem el nom

        File OrigenFoto = new File("DOCS/Fotografias");
        File DestiFoto = new File("DOCS/FOTOS");
        OrigenFoto.renameTo(DestiFoto);

// Creem dos objectes de tipus File on assignem la ruta d'origen i la ruta destí. // (PER A LA CARPETA LIBROS) i canviem el nom

        File OrigenLectures = new File("DOCS/Libros");
        File DestiLectures = new File("DOCS/LECTURES");
        OrigenLectures.renameTo(DestiLectures);


        /* **********************************************************
         *  Llevem les extensions en FOTOS (REANOMENTANT ELS ARXIUS)
         ********************************************************** */

        // ABANS d'eliminar les extensions, imprimim la llista d'arxius ordenada cridant a la funció imprimirLlistaArxius()
        Arrays.sort(docDesti.listFiles());
        ImprimirLlistaArxius(docDesti);


// Reanomenem els arxius, llenvant les Extensions cridant a la funció llevarExtensionsArxius()
        llevarExtensionsArxius(DestiLectures);




// DESPRES d'eliminar les extensions, imprimim de nou la llista d'arxius ordenadacridant a la funció imprimirLlistaArxius()

        ImprimirLlistaArxius(DestiLectures);

    } // del main()



    /*
     * IMPRIMIR LLISTA ARXIUS
     *
     */

    static void ImprimirLlistaArxius(File ficheros) {
        File[] archivos = ficheros.listFiles();
        Arrays.sort(archivos);
        for (File fichero : archivos) {
            System.out.println(fichero.getName());
        }
    }

    /*
     *
     * LLEVAR EXTENSIONS ARXIUS
     *
     */
    public static void llevarExtensionsArxius(File ruta) {

        for (File fichero : ruta.listFiles()) {
            String[] extensions = fichero.getName().split("\\.");
            File destino = new File(fichero.getParent() + "/" + extensions[0]);
            fichero.renameTo(destino);
        }
    }



} // de la classe
