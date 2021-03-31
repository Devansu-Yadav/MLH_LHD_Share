import java.util.*;

class QuickSort_Algo_implementation{                 
    public static int partition(int[] a, int left, int right) {
        int pivot = a[left];
        while(true) {
            //Incrementing left till pivot < left element
            while(a[left] < pivot)
                left++;
            //Decrementing left till pivot > left element
            while(a[right] > pivot) 
                right--;
            //Swapping left and right element if left < right
            if(left < right) {
                int tmp = a[left];
                a[left] = a[right];
                a[right] = tmp;                                     
            }
            //Swapping right element with pivot if right >= left
            else{
                a[left] = a[right];
                a[right] = pivot;
                break;
            }
        }
        //Correct position of pivot element
        return right; 
    }
    public static void recursiveQuickSort(int[] a, int i, int j) {
       int idx = partition(a, i, j);
       //Recursively breaking array into smaller chunks using pivot
       if(i < idx-1) {
           recursiveQuickSort(a, i, idx-1);
        }
       if(j > idx) {
           recursiveQuickSort(a, idx + 1, j);
        }
    }

    static void printarray(int arr[]){
        int len = arr.length;
        for(int i=0; i<len; i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of arrays:- ");
        for(int i = 0;i<n; i++){
            arr[i] = sc.nextInt();
        }
        QuickSort_Algo_implementation.recursiveQuickSort(arr, 0, arr.length-1);
        QuickSort_Algo_implementation.printarray(arr);
        
    }
}
