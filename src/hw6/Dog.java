package hw6;

public class Dog extends Animal {
    public Dog(String name, String color, int age) {
        super(name, color, age);

        run(499);
        swim(9);
    }

    public void run(int run) {
        if (run <= maxDogRun) {
            System.out.println(name + " пробежал " +  run  + " метров");
        } else {
            System.out.println(name + " не пробежит столько");

        }

    }
    public void swim(int swim) {
        if (swim <= maxDogSwim) {
            System.out.println(name + " проплыл " +  swim  + " метров");
        } else {
            System.out.println(name + " не проплывет столько");

        }

    }


    public void voice() {
        System.out.println(name + " gaav");
    }

}
