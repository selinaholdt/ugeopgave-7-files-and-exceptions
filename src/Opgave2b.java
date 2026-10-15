import java.util.ArrayList;

public class Opgave2b {


    public String getItem(ArrayList<String> items, int index) {
        if (index > (items.size()-1)){
            throw new IllegalArgumentException("Fejl. Vælg et indeks mellem 0 - " + (items.size()-1));

        }
        return items.get(index);
    }
}
