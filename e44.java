class Person{
    String name;

    Person(String n){
        name=n;
    }

}

class Employee extends Person{

    
    String ni_no="123";
    int annual_salary=100000000;
    double year=2020;

    Employee(String anyvar){
        super(anyvar);
    }
    void display(){
        System.out.println(ni_no);
        System.out.println(name);

    }
    
}


public class e44{

    public static void main(String[] args){

        Employee e= new Employee("Devika");
        e.display();

    }

}