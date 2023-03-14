import java.util.Scanner;
//Original Experiment Name: Is the number even or odd

public class unifacs_experiment_6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println ("Type a number:");

        int num;
        num=scan.nextInt();

        if (num % 2 == 0) {
            System.out.println (num + " is Even");
        }
        else {
            System.out.println (num + " is odd");

        }
    
        scan.close();
    }
}
