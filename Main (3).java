
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int no = sc.nextInt();
        int temp = no;
        int rev = 0, rem;
        while(temp != 0){
            rem = temp%10;
            rev = rev*10+rem;
            temp = temp/10;
        }
        if(no==rev){
            System.out.println(no+"number is palindrom");
        }
        else{
            System.out.println(no+ " number is not palindrom");
        }
        
    }
}


