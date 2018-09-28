/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2.task2;

/**
 *
 * @author TB
 */

  public class Fraction {

    public int numerator;
    public int denomiator;

    int gcd(int a,int b){
        a=Math.abs(a);
        b=Math.abs(b);
        if(a==0){
            return b;
        }
        else{
            return gcd(b%a,a);
        }
    }
    public Fraction(int numerator, int denominator) {
        this.numerator=numerator;
        this.denomiator=denominator;
    }
    public int getNumerator() {
        return numerator;
    }

    public int getDenomiator() {
        return denomiator;
    }
    public Fraction add(Fraction other) {
        int a=this.numerator*other.getDenomiator()+this.denomiator*other.getNumerator();
        int b=this.denomiator*other.getDenomiator();
        Fraction c=new Fraction(a,b);
        c.prin();
        return c;
    }



    public Fraction subtract(Fraction other) {
        int a=this.numerator*other.getDenomiator()-this.denomiator*other.getNumerator();
        int b=this.denomiator*other.getDenomiator();
        Fraction c=new Fraction(a,b);
        return c;
    }

    public Fraction multiply(Fraction other) {
        int a=this.numerator*other.getNumerator();
        int b=this.denomiator*other.getDenomiator();
        Fraction c=new Fraction(a,b);
        return c;
    }

    public Fraction divide(Fraction other) {
        int a=this.numerator*other.getDenomiator();
        int b=this.denomiator*other.getNumerator();
        Fraction c=new Fraction(a,b);
        return c;
    }
    public void prin(){
        int a=gcd(this.numerator, this.denomiator);
        if(a!=0){
            if(this.denomiator/a==1){
                System.out.println(this.numerator/a);
            }
            else if(this.denomiator/a==-1){
                System.out.println((-this.numerator/a));
            }
            else if(this.denomiator/a==0){
                System.out.println("Phân số không xác định ^^");
            }
            else{
                if((this.numerator/a>0 && this.denomiator/a<0)|| (this.numerator/a<0 && this.denomiator/a<0)){
                    System.out.println((-this.numerator/a)+"/"+(-this.denomiator/a));
                }
                else {
                    System.out.println(this.numerator/a+"/"+this.denomiator/a);
                }
            }
        }
        else{
            System.out.println("Phân số không xác định ^^");
        }
    }
    public boolean sosanh(Fraction other){
        return this.numerator*other.getDenomiator()==this.denomiator*other.getNumerator();
    }
    public static void main(String[] args){
        Fraction a=new Fraction(2,4);
        Fraction b=new Fraction(2,4);
        Fraction c=new Fraction(-6,5);
        c=a.add(b);
//        c=a.divide(b);
//        c=a.multiply(b);
//        c=a.subtract(b);
        //c.prin();
        System.out.println(a.sosanh(b));
    }
}
