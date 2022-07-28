import java.util.*;

public class Hashtostring {
    public static void main(String[] args)
    {

        // Creating an empty Hashtable
        Hashtable<Integer, String> hash_table =
                new Hashtable<Integer, String>();

        // Inserting elements into the table
        hash_table.put(10, "ali");
        hash_table.put(15, "4");
        hash_table.put(20, "hasha");
        hash_table.put(25, "5");
        hash_table.put(30, "ahan");

        // Displaying the Hashtable
        System.out.println("Initial table is: " + hash_table);

        // Displaying the string representation
        System.out.println("The set is: " + hash_table.toString());
    }
}