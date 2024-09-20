
import java.io.File;
import java.io.IOException;
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

        File OrigenFoto = new File("Documentos/Fotografias");
        File DestiFoto = new File("FOTOS");

// Creem dos objectes de tipus File on assignem la ruta d'origen i la ruta destí. // (PER A LA CARPETA LIBROS) i canviem el nom

        File OrigenLectures = new File("Documentos/Libros");
        File DestiLectures = new File("LECTURES");


        /* **********************************************************
         *  Llevem les extensions en FOTOS (REANOMENTANT ELS ARXIUS)
         ********************************************************** */

        // ABANS d'eliminar les extensions, imprimim la llista d'arxius ordenada cridant a la funció imprimirLlistaArxius()
        File[] ficheros = docDesti.listFiles();
        Arrays.sort(ficheros);
        ImprimirLlistaArxius(ficheros);


// Reanomenem els arxius, llenvant les Extensions cridant a la funció llevarExtensionsArxius()
        String[] ficheroantes;




// DESPRES d'eliminar les extensions, imprimim de nou la llista d'arxius ordenadacridant a la funció imprimirLlistaArxius()


    } // del main()



    /*
     * IMPRIMIR LLISTA ARXIUS
     *
     */

    static void ImprimirLlistaArxius(File[] ficheros) {
        for (File fichero : ficheros) {
            System.out.println(fichero.getName());
        }
    }

    /*
     *
     * LLEVAR EXTENSIONS ARXIUS
     *
     */
    static void LlevarExtensions(File[] files, File fotos){
        String[] extensions;

        for (File fichero : files) {
            extensions = fotos.getName().split("\\.");
        }
    }


} // de la classe
