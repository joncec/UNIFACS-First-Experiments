import java.util.Scanner;
//Original Experiment Name: Sum
public class unifacs_experiment_2 {
    
    public static void main(String[] args) {
        
        int x;
        int y;
        int sum;
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Inser the value of x:");
        x=scan.nextInt();
        
        System.out.println("Insert the value of y");
        y=scan.nextInt();
        
        sum=x+y;
        
      System.out.println("The sum of "+x+"+"+y+" is:"+" "+sum);
      
      scan.close();
      
    }
}
