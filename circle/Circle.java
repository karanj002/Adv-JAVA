package circle;

public class Circle {
    private double radius;
    public Circle(double radius){
        if (radius<0){
            System.out.println("Invalid / Negative value");
            this.radius=0;
        }
        else{
            this.radius=radius;
        }
    }
    public double Area(){
        return (Math.PI*radius*radius);
    }
    public double Perimeter(){
        return (2*Math.PI*radius);
    }
}
