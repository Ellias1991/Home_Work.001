package hw5;

public class Employee {
    private String name;
    private String surname;
    private String position;
    private String email;
    private String phone_number;
    private int salary;
    private int age;

    public Employee(){

    }
    public Employee(String name,String surname,String position,String email,String phone_number,int salary,int age){
        this.name=name;
        this.surname=surname;
        this.position=position;
        this.email=email;
        this.phone_number=phone_number;
        this.salary=salary;
        this.age=age;
    }


    public void info(){
        System.out.printf("Employee information: %s %s\n%s\n%s\n%s\n%d\n%d\n",name,surname,position,email,phone_number,salary,age);
    }

}