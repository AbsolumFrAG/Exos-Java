package Exo27;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public void readFile(String fileName) throws FileNotFoundException {
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
            throw e;
        }
    }

    public static void main(String[] args) {
        FileReader reader = new FileReader();
        try {
            reader.readFile("test1.txt");
        } catch (FileNotFoundException e) {
            // Déjà géré dans la méthode readFile
        }
    }
}
