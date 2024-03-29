public class Kontakt{
    // Attribute
    private String vorname = "";
    private String nachname = "";
    private String telefonnummer = "";

    // Konstruktoren
    public Kontakt(){};

    public Kontakt(String vorname, String nachname, String telefonnummer) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.telefonnummer = telefonnummer;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }
}
