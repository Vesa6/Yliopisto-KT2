public class Tontti {

    private String nimi;
    private double tonttiA;
    private String sijainti;
    private Rakennus rakennus;

    public Tontti(String nimi, String sijainti, double pinta_ala, Rakennus rakennus) {

        setNimi(nimi);
        setTonttiA(pinta_ala);
        setSijainti(sijainti);
        setRakennus(rakennus);

    }

    public String getNimi() {
        return nimi;
    }

    public String getSijainti() {
        return sijainti;
    }

    public void setSijainti(String sijainti) {
        this.sijainti = sijainti;
    }

    public double getTonttiA() {
        return tonttiA;
    }

    public void setTonttiA(double tonttiA) {
        this.tonttiA = tonttiA;
    }

    @Override
    public String toString() {
        return "\nTontin tiedot:\nTontin nimi: " + getNimi() + "\nSijainti: " + getSijainti() + "\nTontin pinta-ala: "
                + getTonttiA() + "\n\nRakennuksen tiedot:\n" + getRakennus();
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public Rakennus getRakennus() {
        return rakennus;
    }

    public void setRakennus(Rakennus rakennus) {
        this.rakennus = rakennus;
    }

}
