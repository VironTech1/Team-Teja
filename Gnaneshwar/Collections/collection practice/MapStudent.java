import java.util.HashMap;
import java.util.Map;

class MapStudent {
    public static void main(String args[]) {
        Map<Integer, String> m = new HashMap<>();
        m.put(101, "Gopi");
        m.put(102, "Lakshmi");
        m.put(103, "Ricky");
        m.put(104, "Saran");
        m.put(105, "Southen");
        m.put(106, "Amar");
        m.put(101, "Srinivas"); // Overwrites the value for key 101

        System.out.println("HashMap: " + m);
        System.out.println("Keys: " + m.keySet());
        System.out.println("Values: " + m.values());
        System.out.println("Name of student with ID 105: " + m.get(105));
    }
}
