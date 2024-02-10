

public class FurnitureMain {
    public static void main(String[] args) {
        
    	
    	Chair chair = new Chair();
    	
    	chair.sit();
    	chair.move();
    
    	OfficeChair officechair = new OfficeChair();
    	
    	officechair.adjustHeight();
    	
    	officechair.move();
    	officechair.sit();

        
    }
}
