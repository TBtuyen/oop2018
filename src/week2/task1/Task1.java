package week2.task1;


public class Task1 {
	public static int gcd(int a, int b) {
        if(a!=0){
            return gcd(b%a,a);
        }
        else{
            return b;
        }
    }

    public static int fibonacci(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else return fibonacci(n-1)+fibonacci(n-2);
    }
}
