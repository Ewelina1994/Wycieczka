public class Dziecko extends Uczestnik {
    private long nrLeg;
    public Dziecko(String nazwisko,String imie,String pesel, Adres adres,long nrLeg)
    {
        super(nazwisko,imie,pesel,new Adres(adres));
        this.nrLeg=nrLeg;
    }
    public String toString() { return "(d) "+super.toString()+" "+nrLeg; }
    public long dajNrLeg() { return nrLeg; }
}

