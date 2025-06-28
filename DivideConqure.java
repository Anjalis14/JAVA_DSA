public class DivideConqure{
    //MERGE SORT  //

    //to print array//
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        } //System.out.println("Index: " + i + ", Value: " + numbers[i]);//
    }

    //Merge sort code//
    public static void mergeSort(int arr[] , int s , int e){
        //Base Case//
        if(s >= e){
            return;
        }
        // kaam//
        int mid = s+(e - s)/2;  //formula to find mid //
        mergeSort (arr , s ,mid); // to get left part//
        mergeSort (arr, mid+1, e);  // to get right part//
        merge(arr , s , mid ,e );  // to merge two parts ie. left and right//
    }
        // Merge Function //

    public static void merge(int arr[], int s, int mid , int e){
            //Temporary array to store left and right sorted values//
            int temp[] = new int[ e -s +1];   // size of temp array is e-s+1//
            int i = s;  //iterator for left part//
            int j = mid+1;  //iterator for right part//
            int k = 0;  //iterator for temp array//

            while(i<= mid && j <= e){    //j  from mid+1 to e //
                if (arr[i] < arr[j]){     // if left [art is smaller than right part  store left part it in temp arr//
                    temp[k] = arr[i];
                    i++ ;
                    k++;
                } else{
                    temp[k] = arr[j];  // if right part is smaller than left part store right//
                    j++;
                    k++;

                } 
                
            }
            //if there are remaining elements in left part//
            while(i <= mid){
                temp[k] = arr[i];
                i++;
                k++;
            }
            //if there are remaining elements in right part//
            while(j <= e){
                temp[k] = arr[j];
                j++;
                k++;
            }

        // Copy temp array to original array//
        for(k= 0, i=s; k < temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }

    // QUICK SORT //

    public static void quicksort (int arr[], int s, int e){
        // Base case//
        if(s >= e){
            return ;
        }
        // Partition the array and taking last element as pivot//
         
        int pidx =partition(arr , s, e);
        // Recursively sort the left and right subarrays//
        quicksort( arr , s , pidx-1);
        quicksort(arr , pidx+1 , e);
    }

    public static int partition(int arr[], int s , int e){
        int pivot =arr[e];
        int i = s-1;   // i = -1 place for index of smaller element than pivot //
        for(int j= s; j<e; j++){
            if(arr[j] <= pivot){
                i++;
                // swap arr[i] and arr[j]//
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // swap arr[i+1] and arr[e]   right part//
        i++;
        int temp = pivot;
        arr[e] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args){
        int arr[] = {6 , 3, 9, 2, 5, 1 ,0 ,5,10 };
        quicksort(arr , 0 , arr.length-1);
        printArray(arr);
        
    }
}
