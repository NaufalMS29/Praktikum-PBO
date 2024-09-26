public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Reva", 19, "Gandul");
        person1.displayInfo();

        person1.setName("Re");
        person1.setAge(19);

        System.out.println("Upadate Infromation: ");
        person1.displayInfo();
    }
    
}
