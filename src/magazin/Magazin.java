package magazin;

public class Magazin {

    private String denumire;
    private String adresa;

    public Magazin(String denumire, String adresa) {
        this.denumire = denumire;
        this.adresa = adresa;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
}
