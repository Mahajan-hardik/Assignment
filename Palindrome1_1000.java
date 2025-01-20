public class Palindrometilln {
    public static void main(String[] args) {
        int val = 1000;
        for (int i = 1; i <= val; i++) {
            if (isPalindrome(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPalindrome(int n) {
        return n == reverse(n);
    }
    
    public static int reverse(int n) {
        int rev = 0;
        int digit = 0;
        while (n > 0) {
            digit = n % 10;
            rev = (rev * 10) + digit;
            n = n / 10;
        }
        return rev;
    }
}
