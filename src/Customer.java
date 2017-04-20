/* Ben Cradick
 * cs2261 hw5
 * 18-04-2017 */
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Customer {
    Customer(String email){
        this.email = email;
    }
    Customer(){}
    private String email;
    private ArrayList<Object> purchaseHistory = new ArrayList<>();

    public ArrayList<Object> getPurchaseHistory() {return purchaseHistory;}
    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}
    public void addPurchaseHistory(Object item){purchaseHistory.add(item);} //also a setter, kinda

   static <T, S> S randomPick(TreeMap<T, S> a){
        Random r = new Random();
        S obj;
        int k = 0;
        ArrayList<S> arrT = new ArrayList<S>(10);
        int x = r.nextInt(10);
       for (Map.Entry<T, S> entry: a.entrySet()){
        arrT.add(entry.getValue());
       }
       obj = arrT.get(x);
        return obj;
        }
    void printPurchaseHistory(){
        System.out.println("\nCurrent Customers purchase history: email:"+ email + "\n");
        for (Object o: purchaseHistory)
              {
                  System.out.println(o);

        }
    }



}
