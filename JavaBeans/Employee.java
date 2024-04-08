package JavaBeans;
// A java class is a Java Bean if:
// --> It implements serializable interface,
// --> Has private fields with getters and setter methods,
// --> And has a no arg constructor.
import java.io.Serializable;

public class Employee implements Serializable {
    private int id;
    private String name;
    // No arg constructor- if u dont have anything to write in this just leave it empty
    public Employee(){}
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
}


/*
import java.util.Arrays;
public class ArrayDemo {
    public static void main(String[] args) {
    int[] numbers = {5, 2, 9, 1, 7};
    System.out.println("Array elements:");
    for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
    }
    Arrays.sort(numbers);
    System.out.println("Sorted array:");
    for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
    }
    int max = numbers[numbers.length - 1];
    int min = numbers[0];
    System.out.println("Maximum value: " + max);
    System.out.println("Minimum value: " + min);
    }
    }*/
