/**
 * Created by ben on 4/11/17.
 */
public class Books extends Merchandise {
    Books(String author, String title, double price, int ISBN){
        super(author, title, price, ISBN);
    }
    Books(){};

    String getAuthor(){
        return author;
    }

}
