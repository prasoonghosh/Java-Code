class Member {
    String Name;
    int age;
    int phoneNumber;
    String Address;
    int Salary;
    public void printSalary(){
        System.out.println(Salary);
    }
}
class Employee extends Member{
    String specialization;
}
class Manager extends Member{
    String department;
}
class objEmp{
    public static void main(String[] args){
        Employee emp = new Employee();
        emp.Name= "Prasoon";
        emp.age = 20;
        emp.Address = "Patna";
        emp.Salary = 10000;
        emp.specialization = "programmer";
        System.out.println(emp.Name);
        System.out.println(emp.age);
        System.out.println(emp.Address);
        System.out.println(emp.Salary );
        System.out.println(emp.specialization);
    }
}
class objMan{
    public static void main(String[] args){
        Manager man = new Manager();
        man.Name = "Pragat";
        man.age = 20;
        man.Address = "Dehradun";
        man.Salary = 12000;
        man.department = "BFSI";
        System.out.println(man.Name);
        System.out.println(man.age);
        System.out.println(man.Address);
        System.out.println(man.Salary);
        System.out.println(man.department);
    }
}
