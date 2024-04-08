package Exception;

import java.util.Scanner;

public class Square {
    private double side;
    public Square(double side) throws Exception{
        if (side<=0){
            throw new Exception();
        }
        else{
            this.side=side;
        }
    }
    public double calculateArea(){
        return (this.side*this.side);
    }
}


