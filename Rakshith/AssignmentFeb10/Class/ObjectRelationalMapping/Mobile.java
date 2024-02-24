package Class.ObjectRelationalMapping;

public class Mobile {
MobileRam ram2;
    String sim;
    int battery;
    double screen;
    Mobile(String si, int ba, double sc, MobileRam ram1){
         sim=si;
         battery=ba;
         screen=sc;
         ram2= ram1;

    }
     void details(){
        System.out.println(ram2.size);
         System.out.println(sim);
    }
}
