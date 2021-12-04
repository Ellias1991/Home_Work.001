package hw5;

public class Employee {
    private String name;
    private String surname;
    private String position;
    private String email;
    private String phone_number;
    private int salary;
    private int age;

    public Employee(Employee employee1) {

    }

    public Employee(String name, String surname, String position, String email, String phone_number, int salary, int age) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
    }


    public void info() {
        System.out.printf("Employee information: %s %s\n%s\n%s\n%s\n%d\n%d\n", name, surname, position, email, phone_number, salary, age);
    }

    public int getSalary() {
        return salary;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getEmail() {
        return email;
    }

    public String getPosition() {
        return position;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}