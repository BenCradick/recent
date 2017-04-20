/**
 * Ben Cradick
 * cs2261 hw5
 * 18-04-2017
 */
public class DVD {
    DVD(String title, int year, double price){
        this.title = title;
        this.year = year;
        this.price = price;
    }
    DVD(){}
    private String title;
    private int year;
    private double price;
    private byte quant = 1;
    private static byte totalPurchased = 0;

    public double getPrice() {return price;}
    public int getYear() {return year;}
    public String getTitle() {return title;}
    public byte getQuant(){return quant;}

    public static byte getTotalPurchased() {return totalPurchased;}

    public void setPrice(double price) {this.price = price;}
    public void setTitle(String title) {this.title = title;}
    public void setYear(int year) {this.year = year;}

    public void bought(){
        quant--;
        totalPurchased++;
    }


    @Override //overriding the toString method so that when we print(keyMap) we get the result we want.
    public String toString() {
        return "Movie: " + this.getTitle() + "  Year: " + this.getYear() + "   Price: " + this.getPrice();
    }


}
