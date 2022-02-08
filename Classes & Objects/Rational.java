public class Rational{
    // attributes
    private int num;
    private int den;
    
    // getters
    public int getNum(){
        return num;
    }
    public int getDen(){
        return den;
    }
    
    // setters
    public void setNum(int n){
        num = n;
    }
    public void setDen(int d){
        den = d;
    }
    
    // no-args constructor
    public Rational(){
        num = 0;
        den = 1;
    }
    
    // parameterized constructor
    public Rational(int num, int den){
        this.num = num;
        this.den = den;
    }
    
    // classes can contain methods that aren't getters,
    // setters, and constructors!
    public void negate(){
        num = -num;
    }
    
    public void invert(){
        int helper = num;
        num = den;
        den = helper;
    }
}