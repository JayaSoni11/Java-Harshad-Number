public class LambdaExpressionExample{
    public static void main(String[] args) {
        int[] arr = new int[] {10,20,30,40,50};
        int n = arr.length;
        int temp=0;
        for(int i = 0;i<=n-1;i++){
            white(arr[i] <= 0){
                temp = arr[i]/10;
                System.out.println(temp);
            }
        }
    }
 }