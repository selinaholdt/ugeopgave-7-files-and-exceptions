public class Opgave2 {
    //Drink klasse
    private String name;
    private double price = 0;

    public Opgave2(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0){
            throw new IllegalArgumentException("Pris må ikke være under 0 kr.");
        } else {
            this.price = price;
        }
    }
}
