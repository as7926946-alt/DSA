// public class J {
//     public static int binarySearch(int arr[],int target){
//         int low=0;
//         int high=arr.length-1;
//         int mid;
//         while (low<=high) {
//            mid=(low+high)/2;
//             if(arr[mid]==target){
//                 return mid;
//             }
//             else if(arr[mid]>target){
//                    high=mid-1;
//             }
//             else if(arr[mid]<target){
//                  low=mid+1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,5,6};
//         System.out.println(binarySearch(arr, 5));
//     }
// }

