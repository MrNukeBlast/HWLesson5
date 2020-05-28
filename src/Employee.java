import java.sql.SQLOutput;

public class Employee {
    String name;
    String mansion;
    String email;
    String tel;
    String salary;
    int age;
//Конструктор для создания сотрудника
    public Employee(String name, String mansion, String email, String tel, String salary, int age) {
    this.name = name;
    this.mansion = mansion;
    this.email = email;
    this.tel = tel;
    this.salary = salary;
    this.age = age;
    }
//Метод вывода инвормации о сотруднике на єкран
    public void employeeInfo(){
        System.out.println("Сотрудник "+ name + " eMail " + email + " телефон: "+ tel + " зарплата " + salary + " возраст " + age);
    }
//Вытащить возраст с сотрудника чтоб закинуть в цыкл
    public int empAge(){
        return age;
    }
}
