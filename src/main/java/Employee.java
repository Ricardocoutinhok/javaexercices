public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    //Construtor
    public Employee(int id, String firstName, String lastName, int salry){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salry;
    }

    //Funções

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName(){
        String name = firstName +" "+lastName;
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary(){
        int annualsalary= salary*12;
        return annualsalary;
    }

    public int raiseSalary(int percent){
        int Percent= percent / 100 ;
        int raisesalary = salary * Percent;
        return raisesalary;
    }
    public String toString(){
        return "Employee[id="+id+",name="+getName()+",salary="+salary+"anual salary="+getAnnualSalary()+"raise salary="+ raiseSalary(200)+"]";
    }
}
