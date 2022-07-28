import java.util.*;

public class Hashempty {
    public static void main(String[] args)
    {

        // Creating an empty Hashtable
        Hashtable<String, Integer> hash_table =
                new Hashtable<String, Integer>();

        // Inserting elements into the table
        hash_table.put("aishA", 10);
        hash_table.put("anam", 15);
        hash_table.put("hassan", 20);
        hash_table.put("zaid", 25);


        // Displaying the Hashtable
        System.out.println("The table is: " + hash_table);

        // Checking for the emptiness of Table
        System.out.println("Is the table empty? " +
                hash_table.isEmpty());
    }
}