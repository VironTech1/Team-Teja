import java.util.TreeMap;
import java.util.Map;
//java.util.Set;
class TreeMapEx{
 public static void main(String args[]){ 
       Map m = new TreeMap();
       m.put(1,"one");
       m.put(2,"Two");
       m.put(3,"Three");
       m.put(4,"Four");
       m.put(5,"Five");
       m.put(1,"Six");
       m.put(3,"TEST");  
       m.put(7,"Five");

       System.out.println(m.get(1));
       System.out.println(m.get(2));
       System.out.println(m.get(3));
       System.out.println(m.get(4));
       System.out.println(m.get(5));
       System.out.println(m.get(6));
       System.out.println(m.get(7));
       System.out.println(m.get(8));
 }
}
