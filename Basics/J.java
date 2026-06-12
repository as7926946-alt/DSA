// public class J {
//     public static void main(String[]args){
//         for(int i=1;i<=100;i++){
//             System.out.println(i);
//         }
//     }
// }

//import java.util.Scanner;

// public class J {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number");
//         int n = sc.nextInt();

//         int sum = 0;

//         while (n > 0) {
//             int digit = n % 10;
//             sum += digit;
//             n = n / 10;
//         }

//         System.out.println(sum);
//     }
// }

// public class J {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int rev=0;
//         while(n>0){
//             int digit=n%10;
//             rev=rev*10+digit;
//             n=n/10;
//         }
//         System.out.println(rev);
//     }
// }

// public class J{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();
//         int count=0;
//          s=s.toLowerCase();
//         for(int i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//             if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
//                 count++;
//             }
//         }
// System.out.println(count);
//     }
// }

// public class J{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<arr.length;i++){
//              arr[i]=sc.nextInt();
//         }
//         int max=arr[0];
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>max){
//                 max=arr[i];
//             }
//         }
//         System.out.println(max);
//     }
// }

// public class J{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int ori=n;
//         int rev=0;
//         while(n>0){
//             int digit=n%10;
//             rev=rev*10+digit;
//                 n=n/10;
//         }
//         System.out.println(rev);
//     if(ori==rev){
//             System.out.println("Palindrome");
//         }
//         else{
//             System.out.println("Not palindrome");
//         }
//     }
// }

