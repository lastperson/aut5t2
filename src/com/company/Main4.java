class Main4 {
  public static void main(String[] args) {
    Stakan s = new Stakan("Super");
    Stakan k = new Stakan("Bigger");
    System.out.println("s: " + s.imia);
    System.out.println("k: " + k.imia);
    System.out.println("Stakan: " + Stakan.material());
    System.out.println("Stakan: " + Stakan.vysota());
    System.out.println("s: " + s.procentZapolneniia());
    s.nalit(30);
    System.out.println("s: " + s.procentZapolneniia());
    int v = s.vylit();
    System.out.println("v: " + v);
    System.out.println("k: " + k.procentZapolneniia());
    k.nalit(v);
    System.out.println("k: " + k.procentZapolneniia());
    s.nalit(k.vylit());
    System.out.println("s: " + s.procentZapolneniia());
    System.out.println("k: " + k.procentZapolneniia());
    s.nalit(50);
    System.out.println("s: " + s.procentZapolneniia());
    s.nalit(45);
    System.out.println("s: " + s.procentZapolneniia());
    s.imia = "ReSuper";
    System.out.println("s: " + s.imia);
    System.out.println("k: " + k.imia);
    System.out.println("Obiom Stakana vysotoy 20: " + Stakan.obiom(20));
  }
}

class Stakan {
   public String imia;
   private int zapolnenie;
   
   public Stakan(String s) {
       imia = s;
   }
   
   public int procentZapolneniia() {
       return zapolnenie;
   }
   
   public void nalit(int n) {
       zapolnenie = zapolnenie + n;
       if (zapolnenie > 100) {
           System.out.println(imia + " perepolnen. Lishnee vylilos.");
           zapolnenie = 100;
       }
   }
   
   public int vylit() {
       int voda = zapolnenie;
       zapolnenie = 0;
       return voda;
   }
   
   public static String material() {
       return "Bumaga";
   }
   
   public static int vysota() {
       return 10;
   }
   
   public static int obiom(int v) {
       return v * 20;
   }
}
