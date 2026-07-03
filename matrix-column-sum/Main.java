import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double [][] a = new double[3][4];
    System.out.println("Please Enter the matrix numbers: ");
    for (int i =0; i< a.length;i++){
         for (int j =0; j< a[0].length;j++){
         a[i][j]= in.nextDouble();
         }
    }
    sumColumn(a);
}
    public static void sumColumn(double[][] m)
    {  
        for (int j =0; j< m[0].length;j++){
        double sum = 0;
            for (int i =0; i< m.length;i++){
                  sum += m[i][j];  
                }
        System.out.println("Sum for column"+j+" is: "+ sum);
        }
    }
}
