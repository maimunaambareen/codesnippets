public class Sort {

        // An optimized version of Bubble Sort
        static void bubbleSort(int arr[], int n){
/*            int i, j, temp;
            boolean swapped;
            for (i = 0; i < n - 1; i++) {
                swapped = false;
                for (j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {

                        // Swap arr[j] and arr[j+1]
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;
                    }
                }

                // If no two elements were
                // swapped by inner loop, then break
                if (swapped == false)
                    break;
            }*/
            int temp=0;
          for(int i=0;i<n-1;i++){
              for(int j=0;j<n-1-i;j++){
                  if(arr[j]>arr[j+1]){
                    temp=arr[j]   ;
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                  }
              }
          }
        }
        static void insertionSort(int arr[],int n){
            //34, 64, 25, 12, 22, 11, 90
        for(int i=1;i<n;i++){
            int key=arr[i];int j=i-1;
            //left side array is j
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    static void selectionSort(int arr[],int n){
            int temp=0;
        for(int i=0;i<n-1;i++){
            int min=i;
            //j loop to identify min ele
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            //once min ele identified swap with i index
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
    //QUICK SORT****************************************
    // Partition function
    static int partition(int[] arr, int low, int high) {

        // Choose the pivot
        int pivot = arr[high];

        // Index of smaller element and indicates
        // the right position of pivot found so far
        int i = low - 1;

        // Traverse arr[low..high] and move all smaller
        // elements to the left side. Elements from low to
        // i are smaller after every iteration
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        // Move pivot after smaller elements and
        // return its position
        swap(arr, i + 1, high);
        return i + 1;
    }

    // Swap function
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // The QuickSort function implementation
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            // pi is the partition return index of pivot
            int pi = partition(arr, low, high);

            // Recursion calls for smaller elements
            // and greater or equals elements
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
            /*10, 7, 8, 9, 1, 5(p)
            i=-1;j=4
            ar[j]<p,i++,swap i with j,j++
            1,7,8,9,10,5(p)
            i=0+1,swap i with p
            1,5,        8,9,10,7(p)
            i=0;p=0      i=0j=2,i++ swap i with p
            1,5,7,  9,10,8(p)
                    i=0j=1 i++ swap i with p
            1,5,7,8,  10,9(p)
                    i=0 i++ swap i with p
            1,5,7,8,9,10*/
        }
    }
    //MERGE SORT**************************************
    static void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // Merge the temp arrays

        // Initial indices of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    static void mergeSort(int arr[], int l, int r)
    {
        /*[]mergesort1:(184)
        l=0;m=2;r=5------------|
        [xx]mergesort2:(184)   |
        l=0;m=1;r=2            |
        [x]mergesort3:(185)    |
        l=0;m=0;r=1(merge)     |
                               |
        [xx]mergesort2(184):   |
        l=3;m=4;r=5   <--------|
        [x]mergesort3(185):
        l=3;m=3;r=4(merge)*/

        if (l < r) {

            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }


    // Function to print an array
        static void printArray(int arr[], int size){
            int i;
            for (i = 0; i < size; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }

        // Driver program
        public static void main(String args[]){
            int arr[] = { 12, 11, 13, 5, 6, 7 };//{10, 7, 8, 9, 1, 5};//{ 64, 34, 25, 12, 22, 11, 90 };
            int n = arr.length;//7
            //selectionSort(arr, n);
            //quickSort(arr, 0, n - 1);
            mergeSort(arr, 0, arr.length - 1);
            System.out.println("Sorted array: ");
            printArray(arr, n);
        }

}
