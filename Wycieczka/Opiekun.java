public class Opiekun extends Uczestnik {
    private String nrDO;
    public Opiekun(String nazwisko,String imie,String pesel, Adres adres, String nrDO)
    {
        super(nazwisko,imie,pesel,new Adres(adres));
        this.nrDO=nrDO;
    }
    public String toString() { return "(o) "+super.toString()+" "+nrDO; }
    public String dajNrDO() { return nrDO; }
}