package app;

public class app {
    public static void main(String[] args) {
        System.out.println();
        
        Spider laba2Imut = new Spider();
        laba2Imut.eat();
        
        System.out.println();
        
        Dog doggy = new Dog();
        doggy.setName("Doggy");
        System.out.println("Saya adalah " + doggy.getName());
        doggy.play();
        doggy.eat();
        doggy.walk();
        
        System.out.println();
        
        Cat kimung = new Cat("Kimung");
        kimung.setName("Meong");
        System.out.println("Saya adalah " + kimung.getName());
        kimung.play();
        kimung.eat();
        kimung.walk();

        System.out.println();
    }    
}
