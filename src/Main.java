import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int n=100;
//        boolean isprime=true;
//        for (int i = 2; i <=Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                isprime = false;
//            }
//        }
//        return;
//        Scanner scan = new Scanner(System.in);
//        int no = scan.nextInt();
//        while(no>9){
//            int last = no % 10;
//            no /=10;
//            int prev = no%10;
//            int sum = Math.abs(last - prev);
//            if(sum!=1
//
//            ){
//                System.out.println("it is  stepping no");
//                return;
//            }
//        }
//        System.out.println("stepping nott");
//        String s = 123 +" ";
//        for(int i =0;i<s.length()-1;i++){
//            int a = s.charAt(i) -'0';
//            int b = s.charAt(i + 1)-'0';
//            int sum = Math.abs(a-b);
//            if(sum!=1){
//                System.out.println("not");
//                return;
//            }
//        }
//        System.out.println("yes");
//        int[] arr ={1,2,3,6,5};
//        for(int j=0;j<arr.length-1;j++){
//            if(arr[j]>arr[j+1]){
//                System.out.println("not");
//                return;
//            }
//        }
//        System.out.println("yes"); ascending
//        int n = 12345;
//        while(n>0){
//            int last = n%10;
//            n /=10;
//            int prev = n%10;
//            int sum = last-prev;
//            if(sum<0){
//                System.out.println("not");
//                return;
//            }
//        }
//        System.out.println("yesv");
//        for(int i =1;i<=100;i++){
//            if(i%3==0&&i%7==0){
//                System.out.println(i);
//            }
//        }
//       for(int i =3;i<=100;i +=3&&7){
//           System.out.println(i);
//       }
//        int a = 12322;
//        //int b = 1356;
//        int freq[] = new int[10];
//        while (a > 0) {
//            int d = a % 10;
//            freq[d]++;
//            a = a / 10;
//        }
//        int max = 0;
//        int result = -1;
//        for (int i = 0; i < 10; i++) {
//            max = freq[i];
//            result = i;
//        }
//       System.out.println(result);
//        int[] arr = {1,5,2,4};
//        int maxfreq = 0;
//        int result = -1;
//        for(int i =0;i<arr.length;i++){
//            int count =0;
//            for(int j =0;j<arr.length;j++){
//                if(arr[i]==arr[j]){
//                    count++;
//                }
//            }
//            if(count>maxfreq){
//                maxfreq= count;
//                result = arr[i];
//            }
//        }
//        if (maxfreq == 1) {
//            System.out.println("no frequency");
//        }else{
//            System.out.println(result);
//        }
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int sum = num;
//        while(sum > 9){
//            int temp = sum;
//            sum = 0;
//            while(temp > 0){
//                sum = sum + temp % 10;
//                temp = temp / 10;
//            }
//        }
//        if(sum == 1){
//            System.out.println("Magic Number");
//        }else{
//            System.out.println("Not Magic Number");
//        }
//        int num = 6928;
//        String s = String.valueOf(num);
//        while(s.length() > 2){
//            String result = "";
//            for(int i=0;i<s.length()-1;i++){
//                int a = s.charAt(i) - '0';
//                int b = s.charAt(i+1) - '0';
//                int diff = Math.abs(a-b);
//                result += diff;
//            }
//            System.out.println(result);
//            s = result;
//        }
//        int num = 56789;
//        int sum = 0;
//        while(num > 0){
//            sum += num % 10;
//            num = num / 10;
//        }
//        System.out.println(sum);
//        int num = 361589;
//        while(num > 0){
//            int digit = num % 10;
//            if(digit % 2 != 0){
//                System.out.print(digit);
//            }
//            num = num / 10;
//        }
//        int num = 361589;
//        String odd="";
//        String even="";
//        while(num>0){
//            int digit = num%10;
//            if(digit%2!=0)
//                odd = digit + odd;
//            else
//                even = digit + even;
//            num = num/10;
//        }
//        System.out.println(odd + even);
//        int num = 361589;
//        String odd="";
//        String even="";
//        int oddCount=0;
//        int evenCount=0;
//        while(num>0){
//            int digit = num%10;
//            if(digit%2!=0){
//                odd = digit + odd;
//                oddCount++;
//            }
//            else{
//                even = digit + even;
//                evenCount++;
//            }
//            num = num/10;
//        }
//        System.out.println(odd + oddCount + even + evenCount);
//        int num = 143;
//        int rev = 0;
//        while(num > 0){
//            int digit = num % 10;
//            rev = rev * 10 + digit;
//            num = num / 10;
//        }
//        System.out.println(rev);
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        long fact = 1;
//        for(int i=1;i<=n;i++){
//            fact *=i;
//        }
//        System.out.println(fact);
//Fibonacci Series;
//        int n = scan.nextInt();
//        int a =0;
//        int b=1;
//        for(int i=0;i<n;i++){
//            System.out.println(a +" ");
//            int c = a+b;
//            a=b;
//            b=c;
//        }
// sum of numbers
//        int n= 123;
//        int sum=0;
//        while(n!=0){
//            sum += n % 10;
//            n /=10;
//        }
//        System.out.println(sum);
// sum of even numbers;
//        int num = 123;
//        int sum=0;
//        while(num!=0){
//           int digit = num % 10;
//           if(digit %2 ==0){
//               sum += num %10;
//           }
//            num /=10;
//        }
//        System.out.println(sum);
// sum of odd numbers;
//        int num = 123456789;
//        int sum =0;
//        while(num!=0){
//            int digit = num %10;
//            if(num % 2!=0){
//                sum += num % 10;
//            }
//            num /=10;
//        }
//        System.out.println(sum);
    }
}




