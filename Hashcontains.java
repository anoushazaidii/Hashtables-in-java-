import java.util.*;

public class Hashcontains {
    public static void main(String[] args)
    {

        // Creating an empty Hashtable
        Hashtable<Integer, String> hash_table =
                new Hashtable<Integer, String>();

        // Putting values in the table
        hash_table.put(10, "syeda");
        hash_table.put(15, "anousha");
        hash_table.put(20, "hassan");
        hash_table.put(25, "hussain");
        hash_table.put(30, "zaidi");

        // Displaying the Hashtable
        System.out.println("Initial Table is: " + hash_table);

        // Checking for the Value 'Geeks'
        System.out.println("Is the value 'zaidi' present? " +
                hash_table.containsValue("zaidi"));

        // Checking for the Value 'World'
        System.out.println("Is the value 'husnain' present? " +
                hash_table.containsValue("husnain"));
    }
}