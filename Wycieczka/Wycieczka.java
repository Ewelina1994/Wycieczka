import java.util.*;
public class Wycieczka {
    private ArrayList<Uczestnik> lista;
    private TreeSet<Uczestnik> lista_p;
    private int limit;
    private int liczbaUcz=0;
    public Wycieczka(int limit) {
        lista=new ArrayList<Uczestnik> (limit);
        lista_p=new TreeSet<Uczestnik>();
        this.limit=limit;
    }
    
    public void zapiszUczestnika(Uczestnik uczestnik) throws ListaPelna, PowtorneDopisanie {
        if (liczbaUcz>=limit) throw new ListaPelna();
        if (!lista_p.add(uczestnik)) throw new PowtorneDopisanie(uczestnik);
         else {
             lista.add(uczestnik);
             liczbaUcz++;
         }
    }


    public void usunUczestnika(Uczestnik uczestnik) {
        if (lista_p.contains(uczestnik)) {
            lista_p.remove(uczestnik);
            ArrayList<Uczestnik> nowa_lista = new ArrayList<Uczestnik>(limit);
            liczbaUcz=0;
            for (Uczestnik u:lista)
              if (!u.equals(uczestnik)) { nowa_lista.add(u); liczbaUcz++; }
                else System.out.println("\nUsunieto uczestnika "+uczestnik+" z listy");
            lista=nowa_lista;
        }
    }
 
    public void listaWgZapisow(){
        System.out.println("\nLista uczestnikow wycieczki");
        System.out.println("---------------------------");
        if (liczbaUcz==0) System.out.println("Lista pusta");
        else {
            int i=0;
            for (Uczestnik u:lista) System.out.printf("%2d %40s\n",++i,u);
        }
    }
    
    public void listaWgTypowUczestnikow(boolean dziecko) {
        String nag = "\nLista ";
        if (dziecko) nag=nag+"dzieci";
          else nag=nag+"opiekunow";
        System.out.println(nag);
        System.out.println("---------------------------");
        int i=0;
        for (Uczestnik u:lista) 
          if (dziecko && u instanceof Dziecko ||
             !dziecko && u instanceof Opiekun)
            System.out.printf("%2d %40s\n",++i,u);        
    }
    private class ComparatorWgPeselu implements Comparator<Uczestnik> {
        public int compare(Uczestnik u1, Uczestnik u2) {
            return u1.dajPesel().compareTo(u2.dajPesel());
        }
    }
    public void listaWgPesel(){
        ArrayList<Uczestnik> nowa_lista = new ArrayList<Uczestnik>(lista);
        Collections.sort(nowa_lista,new ComparatorWgPeselu());
        System.out.println("\nLista uczestnikow wycieczki wg pesel");
        System.out.println("------------------------------------");
        if (liczbaUcz==0) System.out.println("Lista pusta");
        else {
            int i=0;
            for (Uczestnik u:nowa_lista) System.out.printf("%2d %40s\n",++i,u);
        }    
    }
    
}
