public class Recursion{
    public static void printDec(int n ){
        if(n == 1 ){
            System.out.print(n);
            return;
        }
        
        printDec(n-1);
        System.out.print(n + " ");
    }
 // factorial of n //
    public static int fact(int n){
        if(n == 0) {
            return 1;
        }
        int fnm1= fact(n-1);
        int fn = n * fact(n-1);
        return fn;
    }

    //sum of n natural number //

    public static int sum(int n){

        if(n == 1){
            return 1;
        }

        int snm1= sum(n-1);
        int Sn = n + snm1;
        return Sn;
    }

    //fibonachi series of nth number//

    public static int fib(int n){
        if(n == 0 || n ==1){
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    // array is sorted or not //

    public static boolean issorted(int arr[], int i){

        if(i == arr.length-1){
            return true;
        }

        if(arr[i] > arr[i+1]){
            return false ;
        
        }

        return issorted(arr, i+1);
    }


    // first occurance in an array //

    public static int firstOcc(int arr[] , int key ,int i ){


        if(i == arr.length){
            return -1;
        }

        if(arr[i] == key){
            return i;
        }

        return firstOcc(arr ,key ,i+1);
    }

    // find x^n of any number// 
    public static int pow(int x , int n){

        if(n == 0){
            return 1;
        }

        int xnm1 =pow(x , n-1);
        int xn = x * xnm1;
        return xn;
    }

// optimized code for  X^n //

public static int optPow(int x , int n){

    if(n == 0 ){
        return 1;
    }

    // even power  = X^n/2  * X^n/2//
    int pow = optPow(x , n/2);
    int power = pow * pow;

    //for odd power = X *  X^n/2 * X^n/2   means X * power//
    if(n % 2 != 0){
        power = x * power;
    }
    return power;
}
    public static void main(String[] args){
        
        System.out.println(optPow(2 , 5));
    }
}