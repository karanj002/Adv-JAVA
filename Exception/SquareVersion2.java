package Exception;

public class SquareVersion2 {
    private double side;
    public SquareVersion2(double sideIn) throws SquareException{
        if(sideIn<=0){
            throw new SquareException();
        }
        else{
            this.side=sideIn;
        }
    }
    public double calculateArea(){
        return this.side*this.side;
    }
}
