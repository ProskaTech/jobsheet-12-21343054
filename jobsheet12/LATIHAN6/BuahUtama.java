package LATIHAN6;
//Maulana Hafizul Haq -21343054
public class BuahUtama {
    public static void main(String[] args) {
        EncapsulationBuah Apel = new EncapsulationBuah("apel"," Rp.3000", "Merah");
        System.out.println("Nama Buah: "+Apel.getName()+"\nHarga: "+Apel.getPrice()+"\nWarna: "+Apel.getColor());

        Apel.setColor("Hijau");
        Apel.setPrice("Rp.7000");
        System.err.println("\nInformasi Terkait Apel setelah di Update");

        System.out.println("Nama Buah: "+Apel.getName()+"\nHarga: "+Apel.getPrice()+"\nWarna: "+Apel.getColor());

        }
    
}
