// import java.util.*;
// class Selection_sort{
//     static void selectionsort(int arr[],int n){
//         for(int i = 0; i < n -1 ; i++){
//             int mini = i;
//             for(int j = i + 1; j < n; j++){
//                 if (arr[j] < arr[mini]){
//                     mini = j;
//                 }
//             }
//             int temp = arr[mini];
//             arr[mini] = arr[i];
//             arr[i] = temp;
//         }
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }


// public static void main(String[]args) {
//     int arr[] = {13,46,24,52,20,9};
//     int n = arr.length;
//     for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//         selectionsort(arr,n);
        
    
// }
// }

import java.util.*;
public class Selection_sort{
    static void selectionsort(int arr[],int n){
        for(int i = 0 ; i < n- 1 ;i++){
            int mini = i;
            for(int j = i + 1; j < n ;j++){
                if(arr[j] < arr[mini]){
                    mini=j;
                }
                
            }
            int temp = arr[mini];
            arr [mini] = arr[i];
            arr[i] = temp;
        }
        System.out.println("After sorting");
        for(int i = 0;i < n;i++){
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();

    }
   
public static void main(String[] args) {
    int arr[] = {13,46,24,52,20,9};
    int n = arr.length;
    System.out.println("Before sorting : ");
    for(int i= 0; i < n ; i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();
    selectionsort(arr,n);

}    
}
