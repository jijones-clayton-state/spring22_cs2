/** Represents a Rational number. A rational number is the ratio of two
  * integers. For example, 2/3. You can also think of a single number
  * (e.g., 6) as a Rational number with an implicit denominator of 1
  * (e.g., 6/1).
  *
  * @author Jillian Morgan
  */

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
    /** Creates a Rational number based on given numerator and
      * denominator.
      *
      * @param num the numerator to assign
      * @param den the denominator to assign
      */
    public Rational(int num, int den){
        this.num = num;
        this.den = den;
    }
    
    // classes can contain methods that aren't getters,
    // setters, and constructors!
    /** Reverses the sign of the Rational (e.g., 2/3 becomes -2/3)
      */
    
    public void negate(){
        num = -num;
    }
    
    /** Swaps the denominator and numerator of the Rational (e.g., 2/3 becomes 3/2)
     */
    public void invert(){
        int helper = num;
        num = den;
        den = helper;
        // no need to return the value here
        // we're just actually inverting the numbers that already 
        // exist in the class
    }
}