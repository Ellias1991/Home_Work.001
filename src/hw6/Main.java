package hw6;

public class Main {
    public static void main(String[] args) {


        //               Cat cat= new Cat("Murzik", "black", 7);
        //              Dog dog= new Dog("Sharik", "red", 8);
        Animal[] animals = new Animal[]{
                new Cat("Murzik", "black", 7),
                new Dog("Sharik", "red", 8),
        };
        for (int i = 0; i < animals.length; i++) {

            animals[i].voice();
        }

    }
}

