package app;

public class Dog extends Animal implements Pet{
    private String name;
    
    public Dog(){
        super(4);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void play(){
        System.out.println(name + " Bermain tangkap stik kayu");
    }
    
    public void eat(){
        System.out.println(name + " Makan Daging");
    }

    @Override
    public void walk(){
        System.out.println(name + " Jalan bersama Tuannya");
    }
}
