/**
 * Created by ben on 4/11/17.
 */
public class Books{
    Books(String author, String title, double price, int isbn){
        this.author = author;
        this.title = title;
        this.price = price;
        this.isbn = isbn;
    }
    Books(){};

    private String author;
    private String title;
    private double price;
    private int isbn;

    String getAuthor(){return author;}
    String getTitle(){return title;}
    double getPrice(){return price;}
    int getIsbn(){return isbn;}

    public void setPrice(double price) {this.price = price;}
    public void setTitle(String title) {this.title = title;}
    public void setAuthor(String author) {this.author = author;}
    public void setIsbn(int isbn) {this.isbn = isbn;}
}
