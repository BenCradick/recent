/**
 * Created by ben on 4/11/17.
 */
public class CD {
    CD(String artist, String album, double price, int year){
        this.artist = artist;
        this.album = album;
        this.price = price;
        this.year = year;
    }
    CD(){}

    private String artist;
    private String album;
    private double price;
    private int year;

    public String getAlbum() {return album;}
    public double getPrice() {return price;}
    public String getArtist() {return artist;}
    public int getYear() {return year;}

    public void setArtist(String artist) {this.artist = artist;}
    public void setPrice(double price) {this.price = price;}
    public void setAlbum(String album) {this.album = album;}
    public void setYear(int year) {this.year = year;}
}
