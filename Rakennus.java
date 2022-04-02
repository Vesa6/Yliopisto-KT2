import java.util.Arrays;

public class Rakennus {

    private double rakennusA;
    private int huoneet;
    private int asukkaat;
    private Asukas asukasTiedot[];

    public Rakennus(double rakennusA, int huoneet, int asukkaat, Asukas[] asukasTiedot) {
        setRakennusA(rakennusA);
        setHuoneet(huoneet);
        setAsukkaat(asukkaat);
        setAsukasTiedot(asukasTiedot);
    }

    public double getRakennusA() {
        return rakennusA;
    }

    public void setRakennusA(double rakennusA) {
        this.rakennusA = rakennusA;
    }

    public int getHuoneet() {
        return huoneet;
    }

    @Override
    public String toString() {
        return "Rakennuksen pinta-ala: " + rakennusA + "\nHuoneiden maara: " + huoneet + "\nAsukkaiden maara: "
                + asukkaat + "\n\nAsukasTiedot: " + Arrays.toString(asukasTiedot);
    }

    public void setHuoneet(int huoneet) {
        this.huoneet = huoneet;
    }

    public int getAsukkaat() {
        return asukkaat;
    }

    public void setAsukkaat(int asukkaat) {
        this.asukkaat = asukkaat;
    }

    public Asukas[] getAsukasTiedot() {
        return asukasTiedot;
    }

    public void setAsukasTiedot(Asukas[] asukasTiedot) {
        this.asukasTiedot = asukasTiedot;
    }
}
