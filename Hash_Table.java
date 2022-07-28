import java.util.Hashtable;

public class Hash_Table {
    public static void main(String[] args)
    {

        // Creating an empty Hashtable
        Hashtable<Integer, String> hash_table =
                new Hashtable<Integer, String>();

        // Inserting elements into the table
        hash_table.put(10, "aliyaa");
        hash_table.put(15, "4");
        hash_table.put(20, "aishaa");
        hash_table.put(25, "5");
        hash_table.put(30, "anousha");

        // Displaying the Hashtable
        System.out.println("Initial table is: " + hash_table);

        // Displaying the size of the table
        System.out.println("The size of the table is " +
                hash_table.size());
    }
}