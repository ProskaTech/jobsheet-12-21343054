package LATIHAN6;
//Maulana Hafizul Haq -21343054
public class EncapsulationBuah {

    private String namaBuah;
    private String hargaBuah;
    private String warnaBuah;

    public EncapsulationBuah(String namaBuah, String hargaBuah, String warnaBuah){
        this.namaBuah   = namaBuah;
        this.hargaBuah = hargaBuah;
        this.warnaBuah = warnaBuah;
    }

    public void setName(String namaBuah){
        this.namaBuah = namaBuah;
    }
    public void setPrice(String hargaBuah){
        this.hargaBuah = hargaBuah;
    }
    public void setColor (String warnaBuah){
        this.warnaBuah = warnaBuah;
    }

    public String getName(){
        return namaBuah;
    }
    public String getPrice(){
        return hargaBuah;
    }
    public String getColor(){
        return warnaBuah;
    }
    
}
