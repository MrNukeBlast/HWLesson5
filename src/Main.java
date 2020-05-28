public class Main {

    public static void main(String[] args) {
//Массмв сотрудников
        Employee[] employes = new Employee[5];
        employes[0] = new Employee("Иванов Василий Фёдорович ", " Бухгалтер ", " ivan.fedorovich@test.com ", " +123456789 ", " 100000 ", 31);
        employes[1] = new Employee("Уткин Фёдор Васильевич ", " Економист ", " vasilevichf@test.com ", " +12332145 ", " 120000 ", 42);
        employes[2] = new Employee("Пупкин Андрей Карлович ", " Методист ", " pupkin.a.k@test.com ", " +123987654 ", " 123000 ", 39);
        employes[3] = new Employee("Карявка Степан Натанович ", " Охранник ", " stepAnatAn@test.com ", " +321456789 ", " 123342323 ", 43);
        employes[4] = new Employee("Блин Олег Свиридович ", " Гардеробщик ", " blin.oleg@test.com ", "+213546789", " 3000000 ", 21);


       employes[0].employeeInfo();

//Цыкл для вывода сотрудников по возросту.
        for (int i = 0; i < employes.length; i++) {
            int ageEmploy = employes[i].empAge();
            if(ageEmploy > 40){
                employes[i].employeeInfo();
            }
        }

    }

}