import java.util.*;
public class Bubble_sort {
    static void bubblesort(int arr[],int n){
        for(int i = n -1 ; i>=1 ; i--){
            for(int j = 0 ; j<=i-1 ; j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("After Bubble Sort: ");
        for(int j=0;j < n ;j++){
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {13,46,24,52,34,76,20,9};
        int n = arr.length;
        System.out.println("Before Bubble Sort: ");
        for(int i = 0 ;i < n ;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubblesort(arr,n);
        
    }
    
}
