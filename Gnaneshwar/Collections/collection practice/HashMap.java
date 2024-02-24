import java.util.HashMap;
import java.util.Map;
import java.util.Set;
class MapEx{
 public static void main(String args[]){ 
       Map m = new HashMap();
       m.put(1,"one");
       m.put(2,"Two");
       m.put(3,"Three");
       m.put(4,"Four");
       m.put(5,"Five");
       m.put(1,"Six");
       //m.put(3,"TEST");  //doesnt throw an error, but its a problem
       //m.put(7,"Five"); //no problem
      System.out.println(m);
      //System.out.println(m.keySet()); // only to get keys
      //System.out.println(m.values()); // only to get values
      //System.out.println(m.get(5)); // input is key to GET value
       //et entrySet=m.entrtySet();
       

      
  }
}
       
 