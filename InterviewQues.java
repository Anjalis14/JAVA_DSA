public class InterviewQues {
    
    //Tiling Question Amazon //

    public static int tiling(int n){
         //Base case //

         if(n == 0 || n == 1){
            return 1 ;
         }
        //vertical tile floor fitting (n-1) for 2 * n floor where 2 is breadth and n is length//

        int fnm1 = tiling(n-1);
        //horizontal tile floor fitting (n-2) for 2 * n floor where 2 is breadth and n is length//
        int fnm2 = tiling(n-2);

        // total ways to put //
        int ways = fnm1 + fnm2;
        return ways;
    }

// Friends pairing problem   GOLDMAN SACHS// 
    public static int frndpair(int n){
        if(n == 1 || n ==2){
            return n;
        }

        //single choice //
        int fnm1 = frndpair(n-1);
        // if pair  banaya //
        int fnm2 = frndpair(n-2);
        //ek k sath pair banaya then aur kitne choice the pair banane k iske alawa//
        int pair = (n-1) * fnm2;
        //total ways//
        int totalways = fnm1 + pair;
        return totalways;

        //code in single line  //
        // return frndpair(n-1) + (n-1)*frndpair(n-2);
    }

    //Binary strings with no consecutive 1s    PAYTM //

    public static void printBin(int n , int lastplace , String str){

        if(n == 0){
            System.out.println(str);
            return ;
        }
        //last place 0 //
        printBin(n-1, 0, str+"0");
        if(lastplace == 0 ){
            printBin(n-1 ,1 , str+"1");
        }
    }

    // SORTED AND ROTATED ARRAY//

    public static int search(int arr[],int tar,int s, int e){
        //base case//
        if(s > e){
            return -1;
        }

        //kaam//
        int mid = s + (e-s)/2;
        // case found at mid only //
        if(arr[mid] == tar){
            return mid;
        }
        //case 1  ==> Mid on L1 //
        if(arr[s] <= arr[mid]){
            // case a: left side //
            if(arr[s] <= tar && tar <=arr[mid]){
                return search(arr , tar , s , mid-1);
            } //case b: right side //
            else{
                return search(arr , tar , mid+1 , e);
            }
        } //case 2 ==>mid on L2 //
        else{
            //case c : right//
            if(arr[mid] <=tar && tar <=arr[e]){
                return search(arr , tar , mid+1, e);
            } else{
                //case d: lrft side //
                return search(arr , tar , s , mid-1);
            }
        } 
    }
    public static void main(String[] args) {
       int arr[] = { 4,5,6,0,1,2,3};
       int tar = 0;
       int tarTdx = search(arr, tar, 0, arr.length-1);
       System.out.println(tarTdx);
    }
}
