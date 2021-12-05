package hw6;

public class Cat extends Animal {
    public Cat(String name, String color, int age) {
        super(name, color, age);

        run(201);
    }

    public void run(int run) {
        if (run < maxCatRun) {
            System.out.println(name + " runs " + run + " метров");
        } else {
            System.out.println(name + " не пробежит столько");

        }

    }

    public void voice() {
        System.out.println(name + " miaou");
    }

}
