import java.util.*;


public class HarshadNumber
{
    //start main function
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int store = num;
        int sum = 0;
        while(num > 0){
            int temp = num % 10;
            sum = sum + temp;
            num = num/10;
        }
        
        if(store % sum == 0)
            System.out.println("Number is Harshad");
        else
            System.out.println("Not a Harshad Number");
	}
}
