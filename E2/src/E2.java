import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

class E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Introduce una ruta (Ejemplo: C:/Windows, Documents...): ");
            String ruta = scanner.nextLine();
            File file = new File(ruta);
            if (ruta.isEmpty()) {
                break;
            }
            try {
                MostraInfoRuta(file);
            } catch (Exception e) {
                System.out.println("No existe la ruta: " + ruta);
            }

        }

    }

    static void MostraInfoRuta(File ruta) throws Exception {
        boolean info = true;
        if (info) {
            if (ruta.isFile()) {
                System.out.println(ruta.getName() + " " + ruta.length() + " " + ruta.lastModified());
            }
            if (ruta.isDirectory()) {
                File[] files = ruta.listFiles();
                for (File file : files) {
                    if (file.isDirectory()) {
                        Arrays.sort(files);
                        System.out.println(file.getName() + " [D]" + " " + ruta.length() + " " + ruta.lastModified());
                    }
                }
                for (File file : files) {
                    if (file.isFile()) {
                        Arrays.sort(files);
                        System.out.println(file.getName() + " [A]" + " " + ruta.length() + " " + ruta.lastModified());
                    }
                }
            }
            if (!ruta.exists()) {
                throw new FileNotFoundException();
            }
        }
        else {
            if (ruta.isFile()) {
                System.out.println(ruta.getName());
            }
            if (ruta.isDirectory()) {
                File[] files = ruta.listFiles();
                for (File file : files) {
                    if (file.isDirectory()) {
                        System.out.println(file.getName() + " [D]");
                    }
                }
                for (File file : files) {
                    if (file.isFile()) {
                        System.out.println(file.getName() + " [A]");
                    }
                }
            }
            if (!ruta.exists()) {
                throw new FileNotFoundException();
            }
        }
    }
}