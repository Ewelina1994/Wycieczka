public class PowtorneDopisanie extends RuntimeException {
  public PowtorneDopisanie(Uczestnik u) { 
      super("Powtorne dopisanie uczestnika \n"+u+"\nniedopuszczalne!"); 
  }
}
