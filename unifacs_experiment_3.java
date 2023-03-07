import java.util.Scanner;
//Original Experiment Name: IMC

public class unifacs_experiment_3 {
    
    public static void main(String[] args) {
    
        float weight;
        float height;
        float imc;
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Isert the weight:");
        weight=scan.nextFloat();
        
        System.out.println("Insert the height:");
        height=scan.nextFloat();
        
        imc=weight/(height*height);
        
      System.out.println("Your IMC is "+imc);
      
      scan.close();
      
    }
}