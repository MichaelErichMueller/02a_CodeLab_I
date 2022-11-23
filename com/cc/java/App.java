package com.cc.java;

public class App {
    static int Wert =100000;
    

    public static void main(String[] args) {

    
Konto konto1 = new Konto(Wert);
Konto konto2 = new Konto(Wert);
Konto konto3 = new Konto(Wert);

output(String.valueOf(konto1.getKontostand()));
output(String.valueOf(konto2.getKontostand()));
output(String.valueOf(konto3.getKontostand()));

konto1.setKontostand(Wert*2);
output(String.valueOf(konto1.getKontostand()));

konto2.setKontostand(Wert*3);
output(String.valueOf(konto2.getKontostand()));

konto3.setKontostand(Wert*10);
output(String.valueOf(konto3.getKontostand()));
}



    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

