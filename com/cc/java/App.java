package com.cc.java;

public class App {
    
    

    public static void main(String[] args) {

    
Konto konto1 = new Konto(10000);
Konto konto2 = new Konto(10000);
Konto konto3 = new Konto(10000);

output(String.valueOf(konto1.getKontostand()));
output(String.valueOf(konto2.getKontostand()));
output(String.valueOf(konto3.getKontostand()));

konto1.setKontostand(10000*2);
output(String.valueOf(konto1.getKontostand()));

konto2.setKontostand(10000*3);
output(String.valueOf(konto2.getKontostand()));

konto3.setKontostand(10000*10);
output(String.valueOf(konto3.getKontostand()));
}



    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

