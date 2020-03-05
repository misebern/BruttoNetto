package edu.campus02;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int nettoPreis = 200;
        int steuerklasse = 1;

        double steuer1 = 0.2;
        double steuer2 = 0.16;
        double steuer3 = 0.08;
        double steuer = 0;
        double brutto;

        if (steuerklasse == 1) {
            steuer = nettoPreis * steuer1;
        } else if (steuerklasse == 2) {
            steuer = nettoPreis * steuer2;
        }  else if (steuerklasse == 3) {
            steuer = nettoPreis * steuer3;
        }

        brutto = nettoPreis + steuer;
        System.out.println("Brutto: " + brutto);
        
    }
}
