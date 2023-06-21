import java.util.Scanner;
class CheckPalindrome{
    String rev = "";
    public void palindrome(String str){
        int n = str.length();
        for(int i = n -1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        System.out.println("String is "+str);
        System.out.println("String is "+rev);
        if(str.equals(rev)){
            System.out.print("String is palindrome");
        }
        else{
            System.out.print("String is not palindrome");
        }         
    }
}
public class PalindromeString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an String : ");        
        String str = sc.nextLine();
        CheckPalindrome cp = new CheckPalindrome();
        cp.palindrome(str);
    }
}