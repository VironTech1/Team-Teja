package stringex;

public class wrapperclasses {
    public static void main(String[] args) {
        boolean b = true;
        Boolean b1 = true;
        char c = 'a';
        Character c1 = 'a';
        int i = 10;
        Integer i1= new Integer(i);

        System.out.println(i);
        System.out.println(i1);

        //int i2 = i1.value();
        
        
        //Since Java 5

        int i3 = 10;

        Integer i4 = i3;    
        Integer i5 = 100;   // This process is called Auto boxing.

        int i6 = i5;

        String str = Integer.toString(1100);
        System.out.println(str + 10);

        int x = Integer.parseInt(str);
        System.out.println(x +10);

        Integer x1 = Integer.parseInt(str);
        System.out.println(x1 + 10);


        
    }
    
}
