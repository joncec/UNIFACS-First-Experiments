import java.util.Scanner;
//Original Experiment Name: Sum

public class unifacs_experiment_2 {
    
    public static void main(String[] args) {
        
      Scanner scan = new Scanner(System.in);
        int x;
        int y;
        int sum;
        
        System.out.println("Inser the value of x:");
        x=scan.nextInt();
        
        System.out.println("Insert the value of y");
        y=scan.nextInt();
        
        sum=x+y;
        
        System.out.println("The sum of "+x+"+"+y+" is:"+" "+sum);
      
      scan.close();
      
    }
}
