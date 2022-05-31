package Domeinlaag;

public class Sneaker {
    private String sneakernaam;
    private String sku;
    private String maat;
    private String platfrom;

    public Sneaker (String sn, String sk, String mt, String pm){
        sneakernaam = sn;
        sku = sk;
        maat = mt;
        platfrom = pm;


    }

    public String getSneakernaam() {
        return sneakernaam;
    }

    public void setSneakernaam(String sneakernaam) {
        this.sneakernaam = sneakernaam;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getMaat() {
        return maat;
    }

    public void setMaat(String maat) {
        this.maat = maat;
    }

    public String getPlatfrom() {
        return platfrom;
    }

    public void setPlatfrom(String platfrom) {
        this.platfrom = platfrom;
    }
}
