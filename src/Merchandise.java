/**
 Super Class that describes all merchandise types: book, CD, DVD.
 and consolidates common descriptors of them int one place, DRY principle.
 */
public class Merchandise {
    Merchandise(String artist, String t, double p)
    {
        author = artist;
        title = t;
        price = p;
    }
    Merchandise(String artist, String t, double p, int y){

        author = artist;
        title = t;
        price = p;
        year = y;
    }
    Merchandise(){

    }
   String author;
   String title;
   double price;
   int year;
}
