//Maulana Hafizul Haq -21343054
class rodaempat extends Kendaraan {
    double NaikHargake = 8;// 1kali
    void hargaAkhir()
    {
        hargaDasar = hargaDasar + ( hargaDasar * NaikHargake );
        System.out.println("Setelah dimodifikasi, haraga mobil menjadi Rp."+hargaDasar);
    }
}