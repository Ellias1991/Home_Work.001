package hw6;

public class Animal {
    protected String name;
    protected String color;
    protected int age;
    protected int maxCatRun = 200;
    protected int maxDogRun = 500;
    protected int maxCatSwim = 0;
    protected int maxDogSwim = 10;



    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void run() {
        System.out.println(name + " runs");
    }
    public void swim() {
        System.out.println(name + " swims");
    }

    public void voice() {
        System.out.println(name + " издает звук");
    }

}