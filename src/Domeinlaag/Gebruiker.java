package Domeinlaag;

public class Gebruiker {

    private String naam;
    private String achternaam;
    private String gebruikersnaam;
    private String wachtwoord;

    public Gebruiker (String nm, String achtrnm, String gebnm, String ww){
        naam = nm;
        achternaam = achtrnm;
        gebruikersnaam = gebnm;
        wachtwoord = ww;



    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getGebruikersnaam() {
        return gebruikersnaam;
    }

    public void setGebruikersnaam(String gebruikersnaam) {
        gebruikersnaam = gebruikersnaam;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public void setWachtwoord(String wachtwoord) {
        wachtwoord = wachtwoord;
    }
}
