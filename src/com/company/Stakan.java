package com.company;

/**
 * Created by Oleksii on 5/8/2015.
 */
public class Stakan {
   public String imia;
   private int zapolnenie = 0;

   public Stakan(String s) {
       imia = s;
   }

   public String imia() {
       return imia;
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

   public static int vysota = 10;
   public static String material = "Bumaga";

   public static int obiom(int v) {
       return v * 20;
   }
}
