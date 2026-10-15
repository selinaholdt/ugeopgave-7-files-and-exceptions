import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Opgave3 {

    public ArrayList<String> readLines(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner scan = new Scanner(file);
        ArrayList<String> lines = new ArrayList<>();

        while (scan.hasNextLine()){
            lines.add(scan.nextLine());
        }
        scan.close();
        return lines;

    }
}
