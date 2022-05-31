package Domeinlaag;

import Domeinlaag.History;

public class Inventory {
    private Integer aantalSneakers;
    private float totaleWaarde;
    private History sneakerHistory;

    public Inventory (int as, float tw){
        aantalSneakers = as;
        totaleWaarde = tw;
    }


    public Integer getAantalSneakers() {
        return aantalSneakers;
    }

    public void setAantalSneakers(Integer aantalSneakers) {
        this.aantalSneakers = aantalSneakers;
    }

    public float getTotaleWaarde() {
        return totaleWaarde;
    }

    public void setTotaleWaarde(float totaleWaarde) {
        this.totaleWaarde = totaleWaarde;
    }

    public History getSneakerHistory() {
        return sneakerHistory;
    }

    public void setSneakerHistory(History sneakerHistory) {
        this.sneakerHistory = sneakerHistory;
    }
}
