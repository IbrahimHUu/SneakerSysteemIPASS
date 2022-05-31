package Testen;

import Domeinlaag.Gebruiker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GebruikerTest {

    @Test
    public void testVoornaamGebruiker() {
        Gebruiker gebruiker = new Gebruiker("Ibrahim", "Errahoui", "Ibra_him", "HBO-ICT123");
        gebruiker.setNaam("Ibrahim");
        assertEquals("Ibrahim", gebruiker.getNaam());

    }
    @Test
    public void testAchternaamGebruiker() {
        Gebruiker gebruiker = new Gebruiker("Ibrahim", "Errahoui", "Ibra_him", "HBO-ICT123");
        gebruiker.setAchternaam("Errahoui");
        assertEquals("Errahoui", gebruiker.getAchternaam());
    }

    @Test
    public void testGebruikersnaamVanGebruiker() {
        Gebruiker gebruiker = new Gebruiker("Ibrahim", "Errahoui", "Ibra_him", "HBO-ICT123");
        gebruiker.setGebruikersnaam("Ibra_him");
        assertEquals("Ibra_him", gebruiker.getGebruikersnaam());
    }

    @Test
    public void testWachtwoordVanGebruiker() {
        Gebruiker gebruiker = new Gebruiker("Ibrahim", "Errahoui", "Ibra_him", "HBO-ICT123");
        gebruiker.setWachtwoord("HBO-ICT123");
        assertEquals("HBO-ICT123", gebruiker.getWachtwoord());
    }

    @Test
    public void testWijzigWachtwoordVanGebruiker() {
        Gebruiker gebruiker = new Gebruiker("Ibrahim", "Errahoui", "Ibra_him", "HBO-ICT123");
        gebruiker.setWachtwoord("IBRA123");
        assertEquals("IBRA123", gebruiker.getWachtwoord());
    }




}