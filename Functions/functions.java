// public class function {
//     public static int sumDigit(int n){
//         int sum=0;
//         int digit=n;
//         while(n>0){
//             digit=n%10;
//             sum=sum+digit;
//             n=n/10;
//         }
//         return sum;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         System.out.println(sumDigit(n));
//     }
// }


// public class function{
//     public static boolean isPalindrome(int n){
//         int ori=n;
//         int rev=0;
//         while(n>0){
//             int digit=n%10;
//             rev=rev*10+digit;
//             n/=10;
//         }
//         if(rev==ori){
//             return true;
//         }
//         else
//         return false;
        
//     }
//     public static void main(String[]args){
//         int n=121;
//        System.out.println(isPalindrome(n));
//     }
// }

// public class function{
//     public static int countDigit(int n){
//         int count=0;
//          while(n>0){
//             count++;
//             n=n/10;
//         }
//         return count;
//     }
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         System.out.println(countDigit(n));
//     }
// }

// public class function{
//     public static void countEvenOdd(int n){
//         int even=0;
//         int odd=0;
//         while(n>0){
//             int digit=n%10;
//             if(digit%2==0){
//                 even++;
//             }
//             else{
//                 odd++;
//             }
//             n=n/10;
//         }
//         System.out.println("Even digits are"+" "+ even+ " "+"Odd digits are"+odd+ " ");
//     }
//     public static void main(String[]args){
//         int n= 123;
//           countEvenOdd(n);
//         }
//     }

// public class functions{
//     public static int productDigit(int n){
//         int product=1;
//       while(n>0){
//             int digit=n%10;
//             product=product*digit;
//             n=n/10;   
//              }
//              return product;
// }
// public static void main(String[] args) {
//     int n=98520671;
//     System.out.println(productDigit(n));
// }
// }

// public class functions{
//     public static int sumDigit(int n){
//         int sum=0;
//         while(n>0){
//             int digit=n%10;
//             if(digit%2==0){
//                 sum=sum+digit;
//             }
//             n=n/10;
//         }
//         return sum;
//     }
//     public static void main(String[] args) {
//         int n=1234;
//         System.out.println(sumDigit(n));
//     }
// }

// public class functions{
//     public static int countNumber(int n){
//         int count=0;
//         while(n>0){
//             int digit=n%10;
//             if(digit>5){
//               count++;
//             }
//         n=n/10;
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         int n=123456789;
//         System.out.println(countNumber(n));
//     }
// }

// public class functions{
//     public static int findLargest(int n){
//         int largest=0;
//         while(n>0){
//             int digit=n%10;
//             if(largest<digit){
//                 largest=digit;
//             }
//             n=n/10;
//         }
//         return largest;
//     }
//     public static void main(String[] args) {
//         int n=1249;
//         System.out.println(findLargest(n));
//     }
// }

// import java.util.Scanner;

// public class functions{
//     public static void main(String[]args){
//         int count=0;
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();
//         s=s.toLowerCase();
//         for(int i=0;i<s.length();i++){
//        if(s.charAt(i)=='a'|| s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o'||s.charAt(i)=='u'){
//         count++;
//        }
//     }
//     System.out.println(count);
// }
// }

// import java.util.Scanner;

// public class functions{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int count=0;
//         String s=sc.nextLine();
//         s=s.toLowerCase();
//             for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);

//             if (ch >= 'a' && ch <= 'z') {
//                 if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
//                     count++;
//                 }
//             }
//         }
//          System.out.println(count);
//     }
// }

// public class functions{
//     public static void main(String[]args){
//         int count=0;
//         String s="abc123xyz45";
//         for(int i=0;i<s.length();i++){
//              char ch = s.charAt(i);
//             if(Character.isDigit(ch)){
//                 count++;
//             }
//         }
//         System.out.println(count);

//     }
// }

