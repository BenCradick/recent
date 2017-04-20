/*
Ben Cradick
cs2261 hw4
date 4/6/2017
 */
public class Person {
    Person()
    {
        name = "Invalid entry";
        ID = -1;
    }

    Person(String q)
    {
        name = q;
        ID = n;
        n++;
    }
    private String name;
    private final int ID;
    private static int n = 0;
    int getID(){return ID;}
    String getName(){return name;}
}