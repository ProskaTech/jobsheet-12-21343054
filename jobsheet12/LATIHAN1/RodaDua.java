//Maulana Hafizul Haq -21343054
class RodaDua extends Kendaraan {
    double NaikHargake = 0.20;//0,2 kali
    void hargaAkhir()
    {
        hargaDasar = hargaDasar + (hargaDasar * NaikHargake);
        System.out.println("Setelah dimodifikasi, harga sepeda menjadi Rp."+hargaDasar);
    }
}