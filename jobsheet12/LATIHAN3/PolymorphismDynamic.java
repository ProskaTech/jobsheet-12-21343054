package LATIHAN3;
//Maulana Hafizul Haq -21343054
public class PolymorphismDynamic {
    public static void main(String[] args) {
        Bank B;
        B = new BRI();
        System.out.println("tingkat suku bunga BRI adalah :"+B.sukubunga());
        B = new BNI();
        System.out.println("tingkat suku bunga BNI adalah :"+B.sukubunga());
        B = new mandiri();
        System.out.println("tingkat suku bunga mandiri adalah :"+B.sukubunga());
    }
    
}
