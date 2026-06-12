 //import java.util.Scanner;

// public class array {
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         int max=Integer.MIN_VALUE;
//         int sl=Integer.MIN_VALUE;
//          for(int i=0;i<arr.length;i++){
//              if(arr[i]>max){
//                  sl=max;
//                  max=arr[i];
//             }
//             else if(sl<arr[i] && arr[i]!=max){
//                 sl=arr[i];
//             }
//     }

//         System.out.println(max);
//          if(sl == Integer.MIN_VALUE){
//     System.out.println("No second largest");
//          }
//          else{
//               System.out.println(sl);
//          }
// }
// }


// public class array {
// 	public static void main(String[] args) {
//     int[] nums = {1,2,2,3,1,4};
//     countOccurrencesNL(nums);
//   }
  
//   public static void countOccurrencesNL(int[] nums) {
//     int len = nums.length;
//     boolean[] visited = new boolean[len];
//     for(int i = 0; i < len; i++) {
//       if(visited[i]) {
//         continue;
//       }
//       int count = 1;
//       int n = nums[i];
//       for(int j = i + 1; j < len; j++) {
//         if(n == nums[j]) {
//           // mark as visited so that it is not picked again
//           visited[j] = true;
//           count++;
//         }
//       }
//       System.out.println(n + " " +count);
//     }
//   }
// }

// public class array{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter size of the array");
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<arr.length;i++){
//              arr[i]=sc.nextInt();
//        }
//        checkSorted(arr,n);
//     }

//     public static void checkSorted(int arr[],int n){
//         boolean sorted=true;
//         for(int i=0;i<n-1;i++){
//             if(arr[i] > arr[i+1]){
//                 sorted=false;
//                 break;
//             }
//         }
//             if (sorted==false){
//                 System.out.println("Not sorted");
//             }
//             else{
//                 System.out.println("sorted");
//             }
//     }
// }