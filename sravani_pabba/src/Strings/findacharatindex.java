package Strings;

public class findacharatindex {



    public static void main(String[] args) {
        String string1 = "Sravya";
        char find = 't'; boolean flag = true;
        for(int i=0;i<string1.length();i++)
        {
            if (find == string1.charAt(i)) {
                System.out.println("Found at index : "+i);
                flag = false;
            }
        }
        if (flag==true) {
            System.out.println("Character is not found in this string");
            
        }
    }
    
}