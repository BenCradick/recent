/*
 * Ben Cradick
 * cs2261 hw5
 * 18-04-2017
 */

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
public class Main {
    public static void main(String[] args) {
        double transactionTotals = 0;
        int transactionCount = 0;
        ArrayList<Object> transactionLog = new ArrayList<>(10);

        ArrayList<Customer> customers = new ArrayList<>(5);
        customers.add(new Customer("zim@invader.com"));
        customers.add(new Customer("grr@cupcakes.com"));
        customers.add(new Customer("doom@music.show.biz"));
        customers.add(new Customer("dim@human.com"));
        customers.add(new Customer("InvaderZimMovie@awwwwyeaaaahhhhh.com"));

        Books b0 = new Books("Isaac Asimov", "The Foundation Trilogy", 19.97, 9780307292063L);
        Books b1 = new Books("Joseph Heller", "Catch-22", 7.99, 9780099529118L);
        Books b2 = new Books("George Orwell", "1984", 9.99, 9780451524935L);
        Books b3 = new Books("Cormac McCarthy", "The Road", 9.99, 9780307387899L);
        Books b4 = new Books("J.K. Rowling", "Fantastic Beasts and Where to Find Them", 15.99, 9781338109061L);
        Books b5 = new Books("Phillip K Dick", "Do Androids Dream of Electric Sheep?", 9.99, 9780345404473L);
        Books b6 = new Books("Frank Herbert", "Dune", 13.99, 9780441013593L);
        Books b7 = new Books("Andy Weir", "The Martian", 11.99, 9780553418026L);
        Books b8 = new Books("Douglas Adams", "The Hitchhikers Guide to the Galaxy", 11.99, 9780345418913L);
        Books b9 = new Books("Brian W Kernighan and Dennis M Richie", "The C programming Language (ANSI C)", 16.45, 9780131103627L);

        Books[] bookArray = {b0, b1, b2, b3, b4, b5, b6, b7, b8, b9};
        TreeMap<Long, Books> booksTreeMap = new TreeMap<>();
        for (Books b: bookArray) {
            booksTreeMap.put(b.getIsbn(),b);
        }

        CD c0 = new CD("Queen", "A Night at the Opera", 10.99, 1975);
        CD c1 = new CD("ACDC", "Back in Black", 9.99, 1980);
        CD c2 = new CD("Rise Against", "Siren Song of the Counter Culture", 7.99, 2004);
        CD c3 = new CD("Lil Dicky", "Proffessional Rapper", 9.99, 2015);
        CD c4 = new CD("Childish Gambino", "Because The Internet", 35.99, 2013);
        CD c5 = new CD("Nirvana", "In Bloom", 7.99, 1991);
        CD c6 = new CD("Pearl Jam", "VS.", 7.99, 1994);
        CD c7 = new CD("Eminem", "Slim Shady LP", 3.99, 1999);
        CD c8 = new CD("Eagles", "Hotel California", 4.99, 1976);
        CD c9 = new CD("Avenged Sevenfold", "Avenged Sevenfold", 5.99, 2007);

        CD[] cdArray = {c0, c1, c2, c3, c4, c5, c6, c7, c8, c9};

        TreeMap<String, CD> cdTreeMap = new TreeMap<>();
        for (CD c:cdArray) {
            cdTreeMap.put(c.getArtist(), c);
        }

        DVD d0 = new DVD("The Wizard of Oz", 1939, 9.99);
        DVD d1 = new DVD("MAD MAX FURY ROAD", 2015, 34.99);
        DVD d2 = new DVD("Citizen Kane", 1941, 4.99);
        DVD d3 = new DVD("The Third Man", 1949, 2.99);
        DVD d4 = new DVD("The Godfather", 1972, 12.99);
        DVD d5 = new DVD("Inside Out", 2015, 12.55);
        DVD d6 = new DVD("Casablanca", 1942, 12.99);
        DVD d7 = new DVD("Moonlight", 2016, 39.99);
        DVD d8 = new DVD("King Kong", 1933, 1.99);
        DVD d9 = new DVD("Star Wars: Episode VII - The Force Awakens",2015, 19.99);

        DVD[] dvdArray = {d0, d1, d2, d3, d4, d5, d6, d7, d8, d9};
        TreeMap<String,DVD> dvdTreeMap= new TreeMap<>();
        for (DVD a: dvdArray){
            dvdTreeMap.put(a.getTitle(), a);
        }

        for (Map.Entry<Long, Books> entry: booksTreeMap.entrySet()) {
            System.out.println(booksTreeMap.get(entry.getKey()));}

        System.out.print("\n");

        for (Map.Entry<String, CD> entry: cdTreeMap.entrySet()) {
            System.out.println(cdTreeMap.get(entry.getKey()));}

            System.out.print("\n");

        for (Map.Entry<String, DVD> entry: dvdTreeMap.entrySet()) {
            System.out.println(dvdTreeMap.get(entry.getKey()));}

        while(transactionCount < 10) {
        Random r = new Random();
        int x = r.nextInt(3);
        int c = r.nextInt(5);

        switch (x) {
            case 0:
                Books b;
            do{
                b = Customer.randomPick(booksTreeMap);
            }while(b.getQuant()== 0);
            customers.get(c).addPurchaseHistory(b);
            booksTreeMap.get(b.getIsbn()).bought();
            transactionLog.add(booksTreeMap.get(b.getIsbn()));
            transactionCount++;
            transactionTotals += booksTreeMap.get(b.getIsbn()).getPrice();
            customers.get(c).printPurchaseHistory();
            break;
            case 1:
                CD m;
                do{
                    m = Customer.randomPick(cdTreeMap);
                }while(m.getQuant()== 0);
                customers.get(c).addPurchaseHistory(m);
                cdTreeMap.get(m.getArtist()).bought();
                transactionLog.add(cdTreeMap.get(m.getArtist()));
                transactionCount++;
                transactionTotals += cdTreeMap.get(m.getArtist()).getPrice();
                customers.get(c).printPurchaseHistory();
                break;
            case 2:
                DVD d;
                do{
                    d = Customer.randomPick(dvdTreeMap);
                }while(d.getQuant() == 0);
                customers.get(c).addPurchaseHistory(d);
                dvdTreeMap.get(d.getTitle()).bought();
                transactionLog.add(dvdTreeMap.get(d.getTitle()));
                transactionCount++;
                transactionTotals += dvdTreeMap.get(d.getTitle()).getPrice();
                customers.get(c).printPurchaseHistory();
                break;


        }

    }
        System.out.println("\nTransaction history for each customer \n");

        for (int i = 0; i < customers.size(); i++) {
            customers.get(i).printPurchaseHistory();
        }
        System.out.println("\nTotal CDs Sold: " + CD.getTotalPurchased() + "\nTotal DVDs Sold: " + DVD.getTotalPurchased()
        + "\nTotal Books Sold: " + Books.getTotalPurchased());
        String s = String.valueOf(transactionTotals);
        s.concat("0");
        System.out.println("Gross Revenue: " + s.substring(0,s.indexOf(".")+3));
}}