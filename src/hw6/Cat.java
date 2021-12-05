package hw6;

public class Cat extends Animal {
    public Cat(String name, String color, int age) {
        super(name, color, age);

        run(199);
        swim(5);
    }

    public void run(int run) {
        if (run <= maxCatRun) {
            System.out.println(name + " пробежал " + run + " метров");
        } else {
            System.out.println(name + " не пробежит столько");

        }

    }

    public void swim(int swim) {
        if (swim > maxCatSwim) {
            System.out.println(name + " не умеет плавать ");
        }
    }

        public void voice () {
            System.out.println(name + " miaou");
        }

    }

