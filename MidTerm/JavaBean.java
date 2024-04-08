package MidTerm;

import java.io.Serializable;

public class JavaBean implements Serializable {
    private int salary;
    private int emp_id;
    private String emo_name;

    public JavaBean() {}

    //SETERS
    public void setSalary(){
        this.salary=salary;
    }
    public void setEmp_id(){
        this.emp_id=emp_id;
    }
    public void setEmo_name(){
        this.emo_name=emo_name;
    }

    //GETERS
    public int getSalary(){
        return salary;
    }
    public int getEmp_id(){
        return emp_id;
    }
    public String getEmo_name(){
        return emo_name;
    }
}
