public class  Comparision

{

    private Entry[] entries;

    private int size, used;

    private float loadFactor;

    private final Entry NIL = new Entry(null,null);

    public Comparision(int capacity, float loadFactor)

    {

        entries = new Entry[capacity];

        this.loadFactor = loadFactor;

    }

    public Comparision(int capacity)

    {

        this(capacity, 0.75F);

    }

    public Comparision()

    {

        this(101);

    }

    private class Entry

    {

        Object key, value;

        Entry(Object k, Object v){this.key=k; this.value=v;}

    }

    public Object get(Object key)

    {

        int h = hash(key);

        for(int i = 0; i<entries.length; i++)

        {

            int j = nextProbe(h,i);

            Entry entry = entries[j];

            if (entry == null) break;

            if (entry == NIL) continue;

            if(entry.key.equals(key)){
                System.out.println("Index="+j);
                System.out.println("Collisions="+i);
                return entry.value;
            }
        }

        return null;

    }

    public Object put(Object key, Object value)

    {

        if(used > loadFactor*entries.length) rehash();

        int h = hash(key);

        for(int i=0; i<entries.length; i++)

        {

            int j = nextProbe(h,i);

            Entry entry = entries[j];

            if (entry == null){

                entries[j] = new Entry(key, value);

                ++size; ++used;

                return null;

            }

            if(entry == NIL) continue;

            if(entry.key.equals(key))

            {

                Object oldValue = entry.value;

                entries[j].value = value;

                return oldValue;

            }

        }

        return null;

    }

    public Object remove(Object key)

    {

        int h = hash(key);

        for(int i=0; i<entries.length; i++)

        {

            int j = nextProbe(h,i);

            Entry entry = entries[j];

            if (entry == null) break;

            if(entry == NIL) continue;

            if(entry.key.equals(key))

            {

                Object oldValue = entry.value;

                entries[j] = NIL;

                --size;

                return oldValue;

            }

        }

        return null;

    }

    public int size()

    {

        return size;

    }

    private int hash(Object key)

    {

        if(key==null) throw new IllegalArgumentException();

        return (key.hashCode() & 0x7FFFFFFF) % entries.length;

    }

    private int nextProbe(int h, int i)

    {

        return (h+i)%entries.length;

    }

    private void rehash()

    {

        Entry[] oldEntries = entries;

        entries = new Entry[2*oldEntries.length+1];

        for(int k = 0; k < oldEntries.length; k++)

        {

            Entry entry = oldEntries[k];

            if(entry == null || entry == NIL) continue;

            int h = hash(entry.key);

            for(int i = 0; i<entries.length; i++)

            {

                int j = nextProbe(h,i);

                if(entries[j]==null)

                {

                    entries[j] = entry;

                    break;

                }

            }

        }

        used = size;

    }
    public static void main(String[] args) {
        QuadrarticProbing  qp=new  QuadrarticProbing (20);
        qp.put(22, 2);
        qp.put(12, 4);
        qp.put(32, 9);
        qp.put(64, 2);
        qp.put(44, 2);
        qp.put(33, 4);
        qp.put(28, 8);
        qp.put(25, 99);
        qp.put(56, 34);
        qp.put(54, 88);

        System.out.println("Quadratic :");
        System.out.println("Showing results for  22");
        qp.get(22);
        System.out.println("Showing results for 12");
        qp.get(12);
        System.out.println("Showing results for 32");
        qp.get(32);
        System.out.println("Showing results for 64");
        qp.get(64);
        System.out.println("Showing results for 44");
        qp.get(44);
        System.out.println("Showing results for 33");
        qp.get(33);
        System.out.println("Showing results for 28");
        qp.get(28);
        System.out.println("Showing results for 25");
        qp.get(25);
        System.out.println("Showing results for 56");
        qp.get(56);
        System.out.println("Showing results for 54");
        qp.get(54);

        Comparision  l=new Comparision(20);
        l.put(22, 2);
        l.put(12, 4);
        l.put(32, 9);
        l.put(64, 2);
        l.put(44, 2);
        l.put(33, 4);
        l.put(28, 8);
        l.put(25, 99);
        l.put(56, 34);
        l.put(54, 88);
        System.out.println("Linear ");

        System.out.println("Showing results for 22 ");
        l.get(22);
        System.out.println("Showing results for 12");
        l.get(12);
        System.out.println("Showing results for  32");
        l.get(32);
        System.out.println("Showing results for 64");
        l.get(64);
        System.out.println("Showing results for  44");
        l.get(44);
        System.out.println("Showing results for  33");
        l.get(33);
        System.out.println("Showing results for  28");
        l.get(28);
        System.out.println("Showing results for  25");
        l.get(25);
        System.out.println("Showing results for  56");
        l.get(56);
        System.out.println("Showing results for  54");
        l.get(54);


    }
}