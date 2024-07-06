public class Insertion_sort {
    static void insertionsort(int arr[],int n){
        for(int i=0; i<=n-1 ;i++){
            int j =i;
            while( j>0 && arr[j-1] > arr[j] ){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }

        }
        System.out.println("After Insertion Sort: ");
        for(int i =0; i<n ;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        }
    public static void main(String[] args) {
        int arr[] = {22, 46, 9, 2, 70, 19};
        int n = arr.length;
        System.out.println("After Insertion Sort: ");
        for(int i =0; i<n ;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        insertionsort(arr, n);

    }  
        
}
