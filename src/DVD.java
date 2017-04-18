/**
 * Created by ben on 4/11/17.
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

    public double getPrice() {return price;}
    public int getYear() {return year;}
    public String getTitle() {return title;}

    public void setPrice(double price) {this.price = price;}
    public void setTitle(String title) {this.title = title;}
    public void setYear(int year) {this.year = year;}
}
