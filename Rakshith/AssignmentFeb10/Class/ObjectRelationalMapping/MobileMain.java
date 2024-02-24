package Class.ObjectRelationalMapping;

public class MobileMain {
    public static void main(String[] args) {
        MobileRam ram1 = new MobileRam(6);

        Mobile mob= new Mobile("akhil", 234,6.7,ram1);
        mob.details();

    }
}
