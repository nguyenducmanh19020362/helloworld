public class Fraction{
    int numerator;
    int denominator = 1;
    public int getNumerator(){
        return numerator;
    }
    public void setNumerator(int a){
        this.numerator = a;
    }
    public int getDenominator(){
        return denominator;
    }
    public void setDenominator(int b){
        if (b != 0){
            denominator = b;
        }
    }
    public Fraction(int a,int b){
        this.numerator = a;
        if (b != 0) {this.denominator = b;}
    }
    public Fraction reduce(){
        int a = this.numerator;
        int b = this.denominator;
        while (a * b != 0){
            if(a > b){
                a = a%b;
            }
            else{
                b = b%a;
            }
        }
        int c = a + b;
        this.numerator = this.numerator / c;
        this.denominator = this.denominator / c;
        return this;
    }
    public Fraction add(Fraction a){
        this.numerator = this.numerator*a.denominator + this.denominator*a.numerator;
        this.denominator = this.denominator*a.denominator;
        this.reduce();
        return this;
    }
    public Fraction subtract(Fraction a){
        this.numerator = this.numerator*a.denominator - this.denominator*a.numerator;
        this.denominator = this.denominator * a.denominator;
        this.reduce();
        return this;
    }
    public Fraction multiply(Fraction a){
        this.numerator = this.numerator * a.numerator;
        this.denominator = this.denominator * a.denominator;
        this.reduce();
        return this;
    }
    public Fraction divide(Fraction a){
        if(a.numerator != 0){
            this.numerator = this.numerator*a.denominator;
            this.denominator = this.denominator * a.numerator;
            this.reduce();
        }
        return this;
    }
    public boolean equals(Object obj){
        if (obj instanceof Fraction) {
            Fraction other = (Fraction) obj;
            if(this.equals(other)){
                return true;
            }
            else return false;
        }
        return false;
    }
    public static void main(String[] args){

    }

}