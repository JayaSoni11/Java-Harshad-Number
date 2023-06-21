import java.util.Scanner;
public class StringWordCount {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        int length = str.length();
        int consonant = 0;
        int vowel = 0;
        for(int i = 0;i<=length-1;i++){
            if(str.charAt(i) == ' ')
                continue;
            else if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||   str.charAt(i) == 'o' || str.charAt(i) == 'u')
                vowel++;
            else
                consonant++;
        }
        System.out.println("Vowel : "+vowel);
        System.out.println("Consonanrt : "+consonant);
        sc.close();
    }
}
