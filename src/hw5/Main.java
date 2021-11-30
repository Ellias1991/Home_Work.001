package hw5;

public class Main {
    public static void main(String[] args) {
//        Employee employee1 = new Employee();
 //       employee1.name = "Ilya";
  //      employee1.surname = "Tumanov";
 //       employee1.position = "Java developer";
 //       employee1.email = "ilya.tumanow2015@yandex.ru";
 //       employee1.phone_number = "89035973167";
 //       employee1.salary = 90000;
 //       employee1.age = 30;

        Employee employee1 = new Employee("Ilya","Tumanov","Java developer",
                "ilya.tumanow2015@yandex.ru","89035973167",
                90000,30 );



        employee1.info();
    }

}
