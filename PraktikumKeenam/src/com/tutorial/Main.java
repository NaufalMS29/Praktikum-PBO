package com.tutorial;

public class Main{
    public static void main(String[] args) {
        Jagoan jakaSembung = new Jagoan("Jaka Sembung");
        Jubah jubahPUtih = new Jubah("Jubah Putih",7,50);
        Senjata Golok = new Senjata("Golok", 25);
        jakaSembung.setJubah(jubahPUtih);
        jakaSembung.setSenjata(Golok);

        Jagoan Pitung = new Jagoan("Pitung");
        Jubah jubahHitam = new Jubah("Jubah Hitam",8,52);
        Senjata Toya = new Senjata("Toya", 24);
        Pitung.setJubah(jubahHitam);
        Pitung.setSenjata(Toya);

        System.out.println("<---- Jagoan 1 ---->");
        jakaSembung.display();
        System.out.println("<---- Jagoan 2 ---->");
        Pitung.display();

        jakaSembung.Serang(Pitung);
        jakaSembung.Serang(Pitung);
        Pitung.Serang(jakaSembung);
        jakaSembung.Serang(Pitung);
        Pitung.Serang(jakaSembung);
    }
}
