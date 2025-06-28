// import java.util.*;
public class BitManuplation {
    public static int getith(int n , int i) {
        int mask =(1<<i);
        if((n & mask)== 0 ){
            return 0;
        } else {
            return 1;
        }
    }
    public static int set(int n, int i){
        int mask = (1<<i);
        return n | mask;
    }
    public static int clear(int n , int i){
        int mask = ~(1<<i);
        return n & mask;
    }
    public static int update(int n , int i , int newbit){
        if(newbit == 0){
            return clear(n,i);
        } else{
            return set(n,i);
        }
    }

    public static int clearlast(int n , int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }
    public static int countset(int n){
        int count = 0;
        while(n >0 ){
            if((n & 1) !=0 ){
                count ++;
            } 
            n=n>>1;
            
            }
            return count;
        }

    public static int fastExpo(int a,int n ){
        int ans = 1;
        while(n > 0){
            if((n & 1 ) != 0){
                ans = ans * a;
            }
            a = a *a ;
            n= n>>1;
        } return ans;
    }
    
    public static void main(String args[]) {
        System.out.println(fastExpo(5, 3));
    }
}
