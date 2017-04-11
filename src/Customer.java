import java.util.ArrayList;

/**
 * Created by ben on 4/11/17.
 */
public class Customer extends Merchandise {
    Customer(String a){
        email = a;
    }
    Customer(){
        email = "N/A";
    }

    private String email;
    private ArrayList<Object> invoice = new ArrayList<>();


}
