/**
 * Ben Cradick
 * cs2261 hw5
 * 18-04-2017
 */
public class Books{
    Books(String author, String title, double price, long isbn){
        this.author = author;
        this.title = title;
        this.price = price;
        this.isbn = isbn;
    }
    Books(){};

    private String author;
    private String title;
    private double price;
    private long isbn;
    private byte quant = 1;
    static private byte totalPurchased = 0;

    String getAuthor(){return author;}
    String getTitle(){return title;}
    double getPrice(){return price;}
    long getIsbn(){return isbn;}
    public byte getQuant(){return quant;}
    public static byte getTotalPurchased(){return totalPurchased;}

    public void setPrice(double price) {this.price = price;}
    public void setTitle(String title) {this.title = title;}
    public void setAuthor(String author) {this.author = author;}
    public void setIsbn(long isbn) {this.isbn = isbn;}

    public void bought(){
        quant--;
        totalPurchased++;
    }

    @Override //overriding the toString method so that when we print(keyMap) we get the result we want.
    public String toString(){
        return "Book: " + getTitle() + " Author: " + getAuthor() + " ISBN-13: " + getIsbn()
                + " Price: " + getPrice();
    }
}
