import java.util.Scanner;

public class Main {
//    public static void main(String[] args) {
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
    // Magic number
//        int num = 50113;
//        int temp =num;
//        while(temp>9){
//            int sum =0;
//            while(temp !=0){
//                sum += temp % 10;
//                temp /=10;
//            }
//            temp = sum;
//        }
//        if(temp ==1){
//            System.out.println("Magic numbers");
//        }else{
//            System.out.println("Not a magic number");
//        }
//2 digit reduced subtracted form
//        String num = "6928";
//        while (num.length() > 2) {
//            String result = "";
//            for (int i = 0; i < num.length() - 1; i++) {
//                int a = num.charAt(i) - '0';
//                int b = num.charAt(i + 1) - '0';
//                result += Math.abs(a - b);
//            }
//            System.out.println(result);
//            num = result;
//        }
//        System.out.println("Final Output: " + num);
//        sum of odd numbers and arrangement of odd sequence
//        String num = "361589";
//        String odd = "";
//        String even = "";
//        for (int i = 0; i < num.length(); i++) {
//            char ch = num.charAt(i);
//            if ((ch - '0') % 2 != 0) {
//                odd += ch;
//            } else {
//                even += ch;
//            }
//        }
//        System.out.println(odd + even);

//        Arrangement of odd sequence followed by even sequence

//        String num = "361589";
//        String odd = "";
//        String even = "";
//        for (int i = 0; i < num.length(); i++) {
//            char ch = num.charAt(i);
//
//            if ((ch - '0') % 2 != 0) {
//                odd += ch;
//            } else {
//                even += ch;
//            }
//        }
//        System.out.println(odd + even);

//        Program to reverse the number using a loop
//
//        int num = 143;
//        int rev =0;
//        while(num!=0){
//            int digit=num %10;
//            rev = rev *10 + digit;
//            num /=10;
//        }
//        System.out.println(rev);

//        Problem to check whether all the numbers are arranged in ascending order

//        String num = "4567";
//        boolean ascending = true;
//        for (int i = 0; i < num.length() - 1; i++) {
//            if (num.charAt(i) >= num.charAt(i + 1)) {
//                ascending = false;
//                break;
//            }
//        }
//        if (ascending) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
    // stepping numbers
//        String num = "12345";
//        boolean step = true;
//        for (int i = 0; i < num.length() - 1; i++) {
//            int diff = Math.abs((num.charAt(i) - '0') - (num.charAt(i + 1) - '0'));
//            if (diff != 1) {
//                step = false;
//                break;
//            }
//        }
//        if (step) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }

//        . Sum of Sums of Digits in Cyclic order
//        String num = "1234";
//        int total = 0;
//        String temp = num;
//        for (int i = 0; i < num.length(); i++) {
//            int sum = 0;
//            for (int j = 0; j < temp.length(); j++) {
//                sum += temp.charAt(j) - '0';
//            }
//            total += sum;
//            temp = temp.substring(1) + temp.charAt(0);
//        }
//        System.out.println(total);

//        Generate series and find Nth element:
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter first term: ");
//        int a = sc.nextInt();
//        System.out.print("Enter common difference: ");
//        int d = sc.nextInt();
//        System.out.print("Enter N: ");
//        int n = sc.nextInt();
//        int nthTerm = a + (n - 1) * d;
//        System.out.println("Nth Element = " + nthTerm);

//        Find result after alternate add_sub on N:
//        String num = "1234";
//        int result = num.charAt(0) - '0';
//        for (int i = 1; i < num.length(); i++) {
//            int digit = num.charAt(i) - '0';
//            if (i % 2 == 1) {
//                result += digit;
//            } else {
//                result -= digit;
//            }
//        }
//        System.out.println(result);
//        Find Password (stable unstable):
//        String num = "1232";
//        int freq = -1;
//        boolean stable = true;
//        for (int i = 0; i < num.length(); i++) {
//            int count = 0;
//            boolean checked = false;
//            for (int k = 0; k < i; k++) {
//                if (num.charAt(i) == num.charAt(k)) {
//                    checked = true;
//                    break;
//                }
//            }
//            if (checked)
//                continue;
//            for (int j = 0; j < num.length(); j++) {
//                if (num.charAt(i) == num.charAt(j)) {
//                    count++;
//                }
//            }
//            if (freq == -1) {
//                freq = count;
//            } else if (freq != count) {
//                stable = false;
//                break;
//            }
//        }
//        if (stable)
//            System.out.println("Stable");
//        else
//            System.out.println("Unstable");

//    Calculate sum of non-prime index values:
//        static boolean isPrime(int n) {
//            if (n < 2)
//                return false;
//            for (int i = 2; i <= Math.sqrt(n); i++) {
//                if (n % i == 0)
//                    return false;
//            }
//            return true;
//        }
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//            int[] arr = new int[n];
//            for (int i = 0; i < n; i++) {
//                arr[i] = sc.nextInt();
//            }
//            int sum = 0;
//            for (int i = 0; i < n; i++) {
//                if (!isPrime(i)) {
//                    sum += arr[i];
//                }
//            }
//            System.out.println(sum);

    //            Find the one digit to be removed to form palindrome:
//    static boolean isPalindrome(String s) {
//        int i = 0, j = s.length() - 1;
//        while (i < j) {
//            if (s.charAt(i) != s.charAt(j))
//                return false;
//            i++;
//            j--;
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String num = sc.next();
//        boolean found = false;
//        for (int i = 0; i < num.length(); i++) {
//            String str = num.substring(0, i) + num.substring(i + 1);
//            if (isPalindrome(str)) {
//                System.out.println("Digit to remove: " + num.charAt(i));
//                found = true;
//                break;
//            }
//
//            if (!found) {
//                System.out.println("Not Possible");
//            }
//        }
//    Create PIN using alpha, beta, gamma:
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int alpha = sc.nextInt();
//        int beta = sc.nextInt();
//        int gamma = sc.nextInt();
//        int min = 9;
//        int max = 0;
//        int[] arr = {alpha, beta, gamma};
//        for (int num : arr) {
//            int temp = num;
//            while (temp > 0) {
//                int digit = temp % 10;
//                if (digit < min)
//                    min = digit;
//                if (digit > max)
//                    max = digit;
//                temp /= 10;
//            }
//        }
//        int unitMin = Math.min(alpha % 10, Math.min(beta % 10, gamma % 10));
//        int unitMax = Math.max(alpha % 10, Math.max(beta % 10, gamma % 10));
//        System.out.println("" + min + max + unitMin + unitMax);
//    }

//    Missing number in an array of shuffled order
//    Input:[3, 7, 1, 2, 8, 4, 5]
public static void main(String[] args) {
    int[] arr = {3, 7, 1, 2, 8, 4, 5};
    int n = arr.length + 1;
    int total = n * (n + 1) / 2;
    int sum = 0;
        for (int i = 0; i < arr.length; i++) {
        sum += arr[i];
    }
        System.out.println("Missing Number = " + (total - sum));
}
}



