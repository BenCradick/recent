/**
 * Ben Cradick
 * cs2261 hw5
 * 18-04-2017
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
    private byte quant = 1;
    private static byte totalPurchased = 0;

    public String getAlbum() {return album;}
    public double getPrice() {return price;}
    public String getArtist() {return artist;}
    public int getYear() {return year;}
    public byte getQuant(){return quant;}

    public static byte getTotalPurchased() {return totalPurchased;}

    public void setArtist(String artist) {this.artist = artist;}
    public void setPrice(double price) {this.price = price;}
    public void setAlbum(String album) {this.album = album;}
    public void setYear(int year) {this.year = year;}

    public void bought(){
        quant--;
        totalPurchased++;
    }

    @Override //overriding the toString method so that when we print(keyMap) we get the result we want.
    public String toString(){
        return "Artsit: " + this.getArtist() + " Album: " + this.getAlbum() + " Year: "+ this.getYear() + " Price: " + this.getPrice();
    }
}
