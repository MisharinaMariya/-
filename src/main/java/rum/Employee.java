package rum;

public class Employee {
         String fio;
         String post;
         String email;
         int phoneNumber;
         int salary;
         int age;

    public Employee(String fio, String post, String email,int phoneNumber, int salary,int age) {
        this.fio = fio;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;

    }

    public void console(){
        System.out.println(fio);
        System.out.println(post);
        System.out.println(email);
        System.out.println(phoneNumber);
        System.out.println(salary);
        System.out.println(age);



    }

}
