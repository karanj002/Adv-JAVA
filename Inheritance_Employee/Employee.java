package Inheritance_Employee;

public class Employee {
    private String id, name, surname;

    public Employee(String number, String name, String surname){
        this.id=number;
        this.name=name;
        this.surname=surname;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String fname) {
        this.name =    name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String lname) {
        this.surname = lname;
    }

    public String createShortName(){
        return this.name.charAt(0)+". "+this.surname;
    }
}
