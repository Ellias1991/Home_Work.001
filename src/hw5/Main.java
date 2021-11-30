package hw5;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Ilya", "Tumanov", "Java developer",
                "ilya.tumanow2015@yandex.ru", "89035973167",
                120000, 30);
        Employee employee2 = new Employee("Petr", "Petrov", "Python developer",
                "petr.petrov@yandex.ru", "89999435677",
                110000, 35);
        Employee employee3 = new Employee("Ivan", "Ivanov", "Kotlin developer",
                "ivan.ivanov@yandex.ru", "89999455678",
                130000, 40);
        Employee employee4 = new Employee("Denis", "Denisov", "Web designer",
                "denis.denisov@yandex.ru", "89939455578",
                140000, 45);
        Employee employee5 = new Employee("Andrey", "Andreev", "PHP developer",
                "andrey.andreev@yandex.ru", "89989455588",
                150000, 50);

        Employee[] employees = new Employee[]{
                new Employee("Ilya", "Tumanov", "Java developer",
                        "ilya.tumanow2015@yandex.ru", "89035973167",
                        120000, 30),
                new Employee("Petr", "Petrov", "Python developer",
                        "petr.petrov@yandex.ru", "89999435677",
                        110000, 35),
                new Employee("Ivan", "Ivanov", "Kotlin developer",
                        "ivan.ivanov@yandex.ru", "89999455678",
                        130000, 40),
                new Employee("Denis", "Denisov", "Web designer",
                        "denis.denisov@yandex.ru", "89939455578",
                        140000, 45),
                new Employee("Andrey", "Andreev", "PHP developer",
                        "andrey.andreev@yandex.ru", "89989455588",
                        150000, 50),
        };
        //   employees[0].info();
        //  employees[1].info();
        //  employees[2].info();
        //  employees[3].info();
        //   employees[4].info();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].info();

            }
        }
    }

}


