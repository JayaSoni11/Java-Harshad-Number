import java.util.*;
public class MissingNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an number : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int num;
        System.out.println("Enter an number in array: ");
        for(int i = 0;i<=n-1;i++){ 
            num = sc.nextInt();
            arr[i] = num;
        }
        for(int i=1;i<=n;i++){
            if(arr[i]<arr[i-1]){
                arr[i-1]=arr[i];
                
            }
        }
    }
}