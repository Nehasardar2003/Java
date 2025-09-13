import java.util.*;

class Complex_1{
    double realPart;
    double imaginaryPart;

    public Complex_1(){
        this.realPart=0;
        this.imaginaryPart=0;
    }      

    public Complex_1(double realPart,double imaginaryPart)
    {
        this.realPart=realPart;
        this.imaginaryPart=imaginaryPart;
    }

    public Complex_1 add(Complex_1 otherNumber){
        double newreal=this.realPart + otherNumber.realPart;  
        double newimg=this.imaginaryPart+otherNumber.imaginaryPart;
        return new Complex_1(newreal,newimg);      
    }

    public Complex_1 sub(Complex_1 otherNumber){
        double newreal=this.realPart-otherNumber.realPart;
        double newimg=this.imaginaryPart-otherNumber.imaginaryPart;
        return new Complex_1(newreal,newimg);
    }

    public Complex_1 mul(Complex_1 otherNumber){
        double newreal=(this.realPart*otherNumber.realPart)-(this.imaginaryPart*otherNumber.imaginaryPart);
        double newimg =(this.realPart*otherNumber.imaginaryPart)+(this.imaginaryPart*otherNumber.imaginaryPart);
        return new Complex_1(newreal,newimg);
    }

    public Complex_1 div(Complex_1 otherNumber){
        double deno=Math.pow(otherNumber.realPart,2)+Math.pow(otherNumber.imaginaryPart,2);
        if (deno == 0){
            throw new IllegalArgumentException("Cannot didved by zero(0 + 0i)");
        } 
        double newreal=(this.realPart*otherNumber.realPart)+(this.imaginaryPart*otherNumber.imaginaryPart)/deno;
        double newimg=(this.imaginaryPart*otherNumber.realPart)-(this.realPart*otherNumber.imaginaryPart)/deno;

        return new Complex_1(newreal,newimg);
    }

    public double getRealPart(){
        return this.realPart;
    }

    public void setRealPart(double realPart){
        this.realPart=realPart;
    }

    public double getImaginaryPart(){
        return this.imaginaryPart;
    }

    public void setImaginartPart(double imaginaryPart){
        this.imaginaryPart=imaginaryPart;
    }

    public String toString(){
        return realPart + " + " + imaginaryPart + "i";
    }
}  

public class ComplexDemo1{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("\t First complex number");
        System.out.println("Enter the Real and imgainary part of First Complex number: ");
        System.out.println("Real Part:");
        double r1 = sc.nextDouble();
        System.out.println("Imaginary Part: ");
        double i1=sc.nextDouble();
        Complex_1 c1= new Complex_1(r1,i1);

        System.out.println("\t Second Complex Number");
        System.out.println("Enter the Second Complex numbe");
        System.out.println("Reall part: ");
        double r2=sc.nextDouble();
        System.out.println("Imaginary Part: ");
        double i2=sc.nextDouble();
        Complex_1 c2 =new Complex_1(r2,i2);

        System.out.println("First Complex number "+c1);
        System.out.println("Second Complex number "+c2);
        Complex_1 sum = c1.add(c2);

        System.out.println("Addition of ( "+c1+" ) + ( "+c2+" ) = "+sum);
        Complex_1 diff= c1.sub(c2);

        System.out.println("Substraction of ( "+c1+" ) + ( "+c2+" ) = "+diff);
        Complex_1 multiply= c1.mul(c2);

        System.out.println("Multiplication of ( "+c1+" ) + ( "+c2+" ) = "+multiply);
        try{
        Complex_1 division= c1.div(c2);
        System.out.println("Division of ( "+c1+" ) + ( "+c2+" ) = "+division);
        }
        catch(IllegalArgumentException e){
            System.out.println("Division Error: "+ e.getMessage());
        }
        sc.close();
    }
}