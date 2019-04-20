public class TestWycieczki
{
    public static void main(String[] args){
        Wycieczka w = new Wycieczka(5);
        Adres adresKowalskich = new Adres("60-123","Poznan","Chrobrego","12");
        try {
         w.zapiszUczestnika(new Opiekun("Kowalski","Jan","72031204134",adresKowalskich,"ABC 123456"));
         w.zapiszUczestnika(new Opiekun("Nowak","Anna","02041205072",
                            new Adres("62-100","Kalisz","Lodzka","149"),"PWW 103817"));
         w.zapiszUczestnika(new Dziecko("Kowalski","Adam","02011401023",adresKowalskich,123));
         w.zapiszUczestnika(new Opiekun("Kowalski","Jan","72031204134",adresKowalskich,"ABC 123456"));
        } catch(Exception e) { System.out.println(e.getMessage()); }
        w.listaWgZapisow();
        w.usunUczestnika(new Opiekun("Kowalski","Jan","72031204134",adresKowalskich,"ABC 123456"));
        w.listaWgZapisow();
        w.listaWgTypowUczestnikow(false);
        w.listaWgTypowUczestnikow(true);
        w.listaWgPesel();
        w.listaWgZapisow();
    }
}
