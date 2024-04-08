package Inheritance_Employee;

public class PartTimeEmployee extends Employee {
    private double hourlyPay;
    public PartTimeEmployee(String id, String surname, String number, double hourlyPay) {
        super(id, surname, number);
        this.hourlyPay = hourlyPay;
    }
    public void setHourlyPay(){
        this.hourlyPay=hourlyPay;
    }
    public double getHourlyPay() {
        return hourlyPay;
    }
    public double CalculateWeeklyPay (int nofhrs){
        return nofhrs * hourlyPay;
    }
}

