import java.sql.SQLOutput;

public class Employee {
    String name;
    String mansion;
    String email;
    String tel;
    String salary;
    int age;



    public Employee(String name, String mansion, String email, String tel, String salary, int age) {
    this.name = name;
    this.mansion = mansion;
    this.email = email;
    this.tel = tel;
    this.salary = salary;
    this.age = age;
    }

    public void employeeInfo(){
        System.out.println("Сотрудник "+ name + "eMail " + "телефон: "+ tel + "зарплата " + salary + "возраст " + age);
    }


}
