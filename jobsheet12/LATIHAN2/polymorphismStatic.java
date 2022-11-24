package LATIHAN2;
//Maulana Hafizul Haq -21343054
public class polymorphismStatic{
    public static void main(String[] args) {
        //memanggil perimeter dengan satu argumen
        System.out.println("sisi persegi adalah : 4\nkeliling persegi adalah : "
        + CompileTime.keliling(4)+ "\n");

        //memanggil metode perimeter dengan dua argumen
        System.out.println(
            "sisi persegi panjang adalah : 10, 13\nKeliling persegi panjang adalah :"
            +CompileTime.keliling(10, 13)
        );

    }

}