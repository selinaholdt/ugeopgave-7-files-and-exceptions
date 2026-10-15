import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    void main(){
        //Opgave 1
        Opgave1 ui = new Opgave1();
        System.out.println(ui.promptNumber("Tast et tal:"));

        //Opgave 2

        Opgave2 drink = new Opgave2("Gin & Tonic", 95);
        try {
            drink.setPrice(100);
            System.out.println(drink.getPrice());

            drink.setPrice(-20);
            System.out.println(drink.getPrice());
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        //Opgave 2b
        Opgave2b opgave2b = new Opgave2b();
        ArrayList<String> items = new ArrayList<>();

        items.add("Støvsuger");
        items.add("Fejebakke");
        items.add("Vaskebalje");
        items.add("Viskestykke");

        try {
            System.out.println(opgave2b.getItem(items, 1));
            System.out.println(opgave2b.getItem(items, 4));
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        //Opgave 3 / 3b
        Opgave3 opgave3 = new Opgave3();
        try {
            opgave3.readLines("data/flashcards.csv");
            opgave3.readLines("data/flashcard.csv");
        } catch (FileNotFoundException e){
            System.out.println("Fejl. Kan ikke finde filen.");
        }

        //Opgave 4 / 5
        ArrayList<String> data = new ArrayList<>();
        data.add("Espresso, En kraftfuld og koncentreret kaffe, 25.0");
        data.add("Latte, Espresso med dampet mælk, 45.0");
        data.add("Cola, Kold og brusende, 30.0");
        data.add("Vand, Stille kildevand, gratis");

        String errorMessage = "";
        try {
            for (String line : data) {
                String[] values = line.split(",");
                String name = values[0].trim();

                errorMessage = "Fejl. Prisen for " + name + " skal været et tal.";

                String description = values[1].trim();
                double price = Double.parseDouble(values[2].trim());
                System.out.println(name + " - " + description + " (" + price + " kr)");
            }
        } catch (NumberFormatException e){
            System.out.println(errorMessage);
        }







    }
}
