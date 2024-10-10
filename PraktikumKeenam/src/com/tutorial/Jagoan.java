package com.tutorial;

// Jagoan
class Jagoan{
    private String namaJagoan;
    private int baseDarah;
    private int baseSerang;
    private int incrementDarah;
    private int incrementSerang;
    private int level;
    private int totalDamage;
    private boolean isAlive;

    // Ini adalah object member
    private Jubah jubah;
    private Senjata senjata;

    public Jagoan(String namaJagoan){
        this.namaJagoan = namaJagoan;
        this.baseDarah = 300;
        this.baseSerang = 100;
        this.level = 1;
        this.incrementDarah = 20;
        this.incrementSerang = 20;
        this.isAlive = true;
    }

    public String getnamaJagoan(){
        return this.namaJagoan;
    }

    public int getDarah(){
        return this.maxDarah() - this.totalDamage;
    }

    public void display(){
        System.out.println("Jagoan\t\t: " + this.namaJagoan);
        System.out.println("Jubah\t\t: " + this.jubah.getnamaJubah());
        System.out.println("Senjata\t\t: " + this.senjata.getnamaSenjata());
        System.out.println("Level\t\t: " + this.level);
        System.out.println("Darah\t\t: " + this.getDarah() +"/" + this.maxDarah());
        System.out.println("Serang\t\t: " + this.getSerangan());
        System.out.println("Alive\t\t: " + this.isAlive + "\n");
    }

    public void Serang(Jagoan Lawan){
        // hitung damage
        int damage = this.getSerangan();
        // print event
        System.out.println(this.namaJagoan + " Menyerang " + Lawan.getnamaJagoan() + " dengan " + damage + " damage");
        // Serang si Lawan
        Lawan.defence(damage);

        this.levelUp();
    }

    public void defence(int damage){

        // receive damage
        int defencePower = this.jubah.getDefencePower();
        int deltaDamage;

        System.out.println(this.namaJagoan + " defence power = "+ defencePower);
        if(damage > defencePower){
            deltaDamage = damage - defencePower;
        } else {
            deltaDamage = 0;
        }
        
        System.out.println("damage diterima = " + deltaDamage + "\n");
        
        // adding total damage
        this.totalDamage += deltaDamage;

        // check is alive
        if (this.getDarah() <= 0){
            this.isAlive = false;
            this.totalDamage = this.maxDarah();
        }

        this.display();
    }
    
    private int getSerangan(){
        return this.baseSerang + this.level*this.incrementSerang + this.senjata.getSerang();
    }

    private void levelUp(){
        this.level++;
    }

    public void setJubah(Jubah jubah){
        this.jubah = jubah;
    }

    public void setSenjata(Senjata senjata){
        this.senjata = senjata;
    }

    public int maxDarah(){
        return this.baseDarah + this.level*this.incrementDarah + this.jubah.getAddDarah();
    }
}