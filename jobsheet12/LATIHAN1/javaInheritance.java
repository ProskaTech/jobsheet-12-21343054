//Maulana Hafizul Haq -21343054
public class javaInheritance
{
    public static void main(String[] args) {
        // membuat objek kendaraan roda dua
        RodaDua sepeda = new RodaDua();
        //membuat objek kendaraan roda empat
        rodaempat mobil = new rodaempat();

        sepeda.tampilkanHarga();
        sepeda.hargaAkhir();

        mobil.tampilkanHarga();
        mobil.hargaAkhir();
    }
}