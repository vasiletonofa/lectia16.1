package magazin;

public class MagazinElectronice extends Magazin implements Credit {

    public MagazinElectronice(String deunimire, String adresa) {
        super(deunimire, adresa);
    }

    @Override
    public void procuraInCredit() {
        System.out.println("Procurare in credit  " + getDenumire() + " adresa: " + getAdresa());
    }
}
