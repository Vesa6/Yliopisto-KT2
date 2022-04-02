public class Asukas {

    private String nimi;
    private String syntyma_aika;

    public Asukas(String nimi, String syntyma_aika) {
        setNimi(nimi);
        setSyntyma_aika(syntyma_aika);
    }

    public String getNimi() {
        return this.nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    @Override
    public String toString() {
        return "\nAsukkaan nimi: " + nimi + " Syntyma_aika: " + syntyma_aika + "";
    }

    public String getSyntyma_aika() {
        return this.syntyma_aika;
    }

    public void setSyntyma_aika(String syntyma_aika) {
        this.syntyma_aika = syntyma_aika;
    }

}
