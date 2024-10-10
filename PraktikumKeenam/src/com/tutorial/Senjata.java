package com.tutorial;

//Senjata
class Senjata{
    private String namaSenjata;
    private int Serang;

    public Senjata(String namaSenjata, int Serang){
        this.namaSenjata = namaSenjata;
        this.Serang = Serang;
    }

    public String getnamaSenjata(){
        return this.namaSenjata;
    }

    public int getSerang(){
        return this.Serang;
    }
}
