package hw6;

public class Dog extends Animal {
    public Dog(String name, String color, int age) {
        super(name, color, age);

        run(501);
    }

    public void run(int run) {
        if (run < maxDogRun) {
            System.out.println(name + " runs " +  run  + " метров");
        } else {
            System.out.println(name + " не пробежит столько");

        }

    }

    public void voice() {
        System.out.println(name + " gaav");
    }

}
