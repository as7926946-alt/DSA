// public class array {
//     public static int sumArray(int arr[]){
//         int sum=0;
//         for(int i=0;i<arr.length;i++){
//             sum=sum+arr[i];
//         }
//         return sum;
//     }
//     public static void main(String[]args){
//         int arr[]={2,8,1,5};
//         System.out.println(sumArray(arr));
//     }
// }

// public class array{
//     public static int countEven(int arr[]){
//         int count=0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]%2==0){
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         int arr[]={2, 7, 8, 5, 10};
//         System.out.println(countEven(arr));
//     }
// }

// public class array{
//     public static int findMin(int arr[]){
//         int min=arr[0];
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]<min){
//                 min=arr[i];
//             }
//         }
//         return min;
//     }
//     public static void main(String[] args) {
//          int arr[]={2, 7, 8, 5, 1};
//          System.out.println(findMin(arr));
// }
// }

// public class array{
//     public static int findTar(int arr[],int target){
//         for( int i=0;i<arr.length;i++){
//             if(target==arr[i]){
//            return i;
//             }
//         }
//         return -1;
        
//     }
//     public static void main(String[] args) {
//         int arr[]= {4, 8, 2, 9, 5};
//        int  target=1;
//        System.out.println(findTar(arr, target));
//     }

// }

// public class array{
//     public static int findTar(int arr[],int target){
//         int count=0;
//         for( int i=0;i<arr.length;i++){
//             if(target==arr[i]){
//            count++;
//             }
//         }
//         return count;
        
//     }
//     public static void main(String[] args) {
//         int arr[]= {2, 5, 2, 7, 2, 9};
//        int  target=2;
//        System.out.println(findTar(arr, target));
//     }

// }

// public class array{
//     public static int findTar(int arr[],int target){
//         int pos=-1;
//         for( int i=0;i<arr.length;i++){
//             if(target==arr[i]){
//            pos=i;
//             }
//         }
//         return pos;
        
//     }
//     public static void main(String[] args) {
//         int arr[]= {2, 5, 2, 7, 2, 9};
//        int  target=2;
//        System.out.println(findTar(arr, target));
//     }
//}

// public class array{
//     public static void reverseArr(int arr[]){
//         int temp=0;
//         int left=0;
//         int right=arr.length-1;
//         while (left<right){
//           temp = arr[left];
// arr[left] = arr[right];
// arr[right] = temp;
//             left++;
//             right--;
//         }
//         for(int i=0;i<arr.length;i++){
//     System.out.print(arr[i] + " ");
// }
//     }
//     public static void main(String[] args) {
//         int arr[]= {2, 5, 2, 7, 2, 9};
//      reverseArr(arr);    
//     }

// }

// public class array{
//     public static int findSl(int arr[]){
//         int max=0;
//         int sm=0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>max){
//                 sm=max;
//                 max=arr[i];
//             }
//             else if(max>arr[i] && sm<arr[i]) {
//                 sm=arr[i];
//             }
//         }
//         return sm;
//     }
//     public static void main(String[] args) {
//         int arr[]={9,8,7};
//         System.out.println(findSl(arr));
//     }
// }

// public class array{
//     public static boolean checkSorted(int arr[]){
//         for(int i=0;i<arr.length-1;i++){
//             if(arr[i]>arr[i+1]){
//                return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         int arr[]={1,92,3,4,5,6};
//         System.out.println(checkSorted(arr));
//     }
// }

// public class array{
//     public static int findLar(int arr[]){
//         int max=arr[0];
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>max){
//                 max=arr[i];
//             }
//         }
//         return max;
//     }
//     public static void main(String[] args) {
//         int arr[]={9,8,7,45,69};
//         System.out.println(findLar(arr));
//     }
// }

// public class array{
//     public static int sumOdd(int arr[]){
//         int sum=0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]%2==1){
//                 sum=sum+arr[i];
//             }
//         }
//         return sum;
//     }
//     public static void main(String[] args) {
//         int arr[]={3,1,23,4,5,6};
//         System.out.println(sumOdd(arr));
//     }
// }

