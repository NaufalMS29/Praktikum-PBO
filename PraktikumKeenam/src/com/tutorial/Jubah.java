package com.tutorial;

// Jubah
class Jubah{
    private String namaJubah;
    private int strength;
    private int Darah;

    public Jubah(String namaJubah, int strength, int Darah){
        this.namaJubah = namaJubah;
        this.strength = strength;
        this.Darah = Darah;
    }

    public String getnamaJubah(){
        return this.namaJubah;
    }

    public int getAddDarah(){
        return this.strength*10 + this.Darah;
    }

    public int getDefencePower(){
        return this.strength*2;
    }

}
