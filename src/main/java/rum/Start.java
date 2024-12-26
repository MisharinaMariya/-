package rum;

public class Start {
    public static void main(String[] args){
        Employee employee1 = new Employee ("Иванов Иван Иванович", "менеджер", "test@test.ru", 880020600, 33330, 44);
        employee1.console();

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Чернов Иван Иванович", "менеджер", "test@test.ru", 880020600, 33330, 44);
        persArray[1] = new Employee("Бурунов Иван Иванович", "менеджер", "test@test.ru", 880020600, 33330, 44);
        persArray[2] = new Employee("Грязнов Иван Иванович", "менеджер", "test@test.ru", 880020600, 33330, 44);
        persArray[3] = new Employee("Блинов Иван Иванович", "менеджер", "test@test.ru", 880020600, 33330, 44);
        persArray[4] = new Employee("Иванов Иван Иванович", "менеджер", "test@test.ru", 880020600, 33330, 44);





    }



}
