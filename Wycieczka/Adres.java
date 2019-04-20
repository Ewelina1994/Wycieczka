public class Adres
{
    private String kod,miasto,ulica,nr;
    public Adres(String kod, String miasto, String ulica,String nr){
      this.kod=kod;
      this.miasto=miasto;
      this.ulica=ulica;
      this.nr=nr;
    }
    public Adres(Adres adres){
      kod=adres.dajKod();
      miasto=adres.dajMiasto();
      ulica=adres.dajUlice();
      nr=adres.dajNr();
    }
    public String dajKod() { return kod; }
    public String dajMiasto() { return miasto; }
    public String dajUlice() { return ulica; }
    public String dajNr() { return nr; }
    public String toString(){ return "("+kod+" "+miasto+", "+ulica+" "+nr+")"; }
}
