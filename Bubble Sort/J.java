// Bubble sort without optimization 
// public class J {
//     public static void bubbleSort(int arr[]){
//         for(int i=0;i<arr.length-1;i++){
//             for(int j=0;j<arr.length-i-1;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }
//         for(int i=0;i<arr.length;i++)
//          System.out.println(arr[i]);
//     }

//     public static void main(String[] args) {
//        int arr[]= {5, 1, 4, 2};
//        bubbleSort(arr);
//     }
// }

//Bubble sort with optimisation
public class J {
    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
               boolean swapped=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false){
            break;
        }
        }
        for(int i=0;i<arr.length;i++)
         System.out.println(arr[i]);
    }

    public static void main(String[] args) {
       int arr[]= {5, 1, 4, 2};
       bubbleSort(arr);
    }
}