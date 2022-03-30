package com.company;

public class Main {

    // Finde heraus ob eine Zahl eine Primzahl ist
    public static boolean istPrim(int zahl){
        // Variablen
        int counter = 0;
        int wert = 0;

        // gibt false zurück wenn die eingebene Zahl kleiner 2 ist
        if (zahl < 2) return false;

        // for-Schleife läuft von 1 bis zum Wert der Zahl durch
        // teilt die Zahl durch i (1 bis n)
        for (int i = 1; i <= zahl; i++){
           wert = zahl % i;
        // wenn Modulo gleich 0 ist, dann zähle den Counter hoch
           if(wert == 0) {
               counter++;
           }
        }

        // wenn der Counter 2 ergibt dann gib true zurück == eine Primzahl
        // (wenn der Counter genau 2 ist, dann kann die Zahl nur durch sich und 1 geteilt werden)
        if (counter == 2) {
            return true;
        }
        // trifft die If Anweisung oben nicht zu dann gib false zurück == keine Primzahl
        return false;
    }

    // Berechne die Quersumme einer Zahl
    public static int berechneQuersumme(int zahl){
        // Variablen definieren
        String temp = "";
        int wert = 0;

        // String temp mit dem Wert der Zahl belegen
        temp += zahl;

        // for-Schleife mit der Länge des Strings
        //
        for (int i = 0; i < temp.length(); i++){
            wert += temp.charAt(i);
        }
        return wert;
    }

    public static boolean loeseAufgabe(int zahl){
        if (istPrim(zahl) && istPrim(berechneQuersumme(zahl))) return true;
        return false;
    }

    public static void main(String[] args) {
	// write your code here

        for (int i = 1; i < 100; i++){

            if (loeseAufgabe(i)) {
                System.out.print(i + " ");
                System.out.print(loeseAufgabe(i));
                System.out.print("\n");
            }


        }

    }
}
