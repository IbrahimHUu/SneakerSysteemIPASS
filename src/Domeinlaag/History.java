package Domeinlaag;

public class History {
    private float omzet;
    private float winst;

    public History (float om, float wnst){
        omzet = om;
        winst = wnst;
    }

    public float getOmzet() {
        return omzet;
    }

    public void setOmzet(float omzet) {
        this.omzet = omzet;
    }

    public float getWinst() {
        return winst;
    }

    public void setWinst(float winst) {
        this.winst = winst;
    }
}
