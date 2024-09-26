
import java.io.File;

public class Main {

    public static void main(String args[]) {


        // Creem Instancies de la classe FILE amb les RUTES RELATIVES de les carpetes que volem crear

        File lesMeuesCoses = new File ("DOCS/Les Meues Coses");
        File alfabet = new File("DOCS/Alfabet");

        // Creem les carptetes i ho comporvem. (NOTA: les variables resultat1 i resultat2 són BOOLEANES

        boolean resultat1 = lesMeuesCoses.mkdir();
        System.out.println("S'ha creat la carpeta 'Documents/Les Meues Coses'?? " + resultat1);


        boolean resultat2 = alfabet.mkdir();
        System.out.println("S'ha creat la carpeta 'Documents/Alfabet'?? " + resultat2);

        // Anem a moure les carpetes. Primer creem instacies d'Objectes de la classe FILE amb les rutes origen i destí

        File fotoOrigen = new File("DOCS/FOTOS");
        File fotoDesti = new File("DOCS/Les Meues Coses/FOTOS");

        File llibreOrigen = new File("DOCS/LECTURES");
        File llibreDesti = new File("DOCS/Les Meues Coses/LECTURES");


        // Movem la carpeta 'Fotografias' dins de 'Les Meues Coses', i comprovem que s'ha mogut correctament

        resultat1 = fotoOrigen.renameTo(fotoDesti);
        System.out.println("S'ha mogut la carpeta 'Documentos/Fotografias' a 'Documentos/Les Meues Coses/Fotografias'? " + resultat1);

        // Movem la carpeta 'Libros' dins de 'Les Meues Coses', i comprovem que s'ha mogut correctament

        resultat2 = llibreOrigen.renameTo(llibreDesti);
        System.out.println("S'ha mogut la carpeta 'Documentos/Libros' a 'Documentos/Les Meues Coses/Libros'? " + resultat2);

        //Creem dins de la carpeta 'Alfabet', una carpeta per cada una de les lletres de l'alfabet en majuscules. Utilitzem el codi ASCII

        for (int i = 65; i <= 90; i++) {
            File novaCarpeta = new File(alfabet.getParent() + "/" + alfabet.getName() + "/" + (char) i);
            novaCarpeta.mkdir();
        }

        File[] llista = alfabet.listFiles();
        System.out.println("\nEl contingut de la carpeta 'Alfabet' és: ");

        for (File f : llista) {
            System.out.print(f.getName()+" ");
        }


    } // Del Main()


} // De la Classe


