package Practice;

public class Check {
    private Float n;
    public Check(Float n) throws Exception{
        if (n > 0){
            n=n/0;
            throw  new Exception();
        }
        else{
            this.n=n;
        }
    }
}
