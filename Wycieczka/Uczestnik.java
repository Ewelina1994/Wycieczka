public abstract class Uczestnik implements Comparable<Uczestnik>
{
    protected String nazw;
    protected String imie;
    protected String pesel;
    protected Adres adres;
    public Uczestnik(String nazw, String imie, String pesel, Adres adres)
    {
        this.nazw=nazw;
        this.imie=imie;
        this.pesel=pesel;
        this.adres=adres;
    }
    
    @Override
    public boolean equals(Object o) { 
        if(o instanceof Uczestnik)
        {
            Uczestnik u = (Uczestnik) o;
            return pesel.equals(u.dajPesel()); 
        }
        return false;
    }
    
    public String toString()
    { return "  "+nazw+" "+imie+" " +pesel+" "+adres; }
 
    public String dajNazwisko() { return nazw; }
    public String dajImie() { return imie; }
    public String dajPesel() { return pesel; }
    public String dajAdres() { return adres.toString(); }

    @Override
    public int compareTo(Uczestnik s){   
        return (nazw.compareTo(s.nazw)!=0 ? nazw.compareTo(s.nazw) : imie.compareTo(s.imie));
    }
}
