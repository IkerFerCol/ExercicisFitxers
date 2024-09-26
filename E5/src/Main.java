import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        // Instaciem a la classe FILE amb les rutes relatives a les carpetes que volem esborrar
        File fotografies = new File("DOCS/FOTOS");
        File llibres = new File("DOCS/LIBROS");
        File documents = new File("DOCS");

        boolean resultat = false;

        try {
            // Esborrem la carpeta 'Fotografias' i tot el seu contingut
            resultat = esborrarTot(fotografies);
            if (resultat) {
                System.out.println("La carpeta 'Fotografias' ha segut esborrada");
            }

            // Esborrem la carpeta 'Libros' i tot el seu contingut
            resultat = esborrarTot(llibres);
            if (resultat) {
                System.out.println("La carpeta 'Libros' ha segut esborrada");
            }

            // Esborrem la carpeta 'Documentos' i tot el seu contingut
            resultat = esborrarTot(documents);
            if (resultat) {
                System.out.println("La carpeta 'Documentos' ha segut esborrada");
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    // Funció que esborra tots els arxius i carpetes d'una ruta

    public static boolean esborrarTot(File ruta) throws FileNotFoundException {

        // Si no existeix la ruta mostra una excepció
        if (!ruta.exists()) {
            throw new FileNotFoundException("La ruta introduïda no existeix");
        }

        // Si és un arxiu l'esborrem
        if (ruta.isFile()) {
            return ruta.delete();
        }

        // Si és una carpeta, primer eliminem tots els seus arxius, i després, esborre la carpeta
        if (ruta.isDirectory()) {
            for (File f1 : ruta.listFiles()) {
                f1.delete();
            }
            return ruta.delete();
        }

        // No deuria aplegar aci
        return false;
    }

}
