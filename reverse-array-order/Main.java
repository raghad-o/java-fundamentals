import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int[] arr = new int[10];
     System.out.println("Please enter 10 integers: " );
     for( int i=0; i<10;i++){
         arr[i]=in.nextInt();
     }
     System.out.println("The reverse of them is: " );
     for( int i=9;i>=0;i--){
     System.out.print(arr[i]+" ");   
     }
    }
}
