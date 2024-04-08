package Exception;

public class SquareException extends Exception{
    public SquareException(){
        super("zero or -ve number was entered");
    }
    public SquareException(String message){
        super(message);
    }
    @Override
    public String toString(){
        return "The sides of a square cannot be zero or negative.";
    }
}
