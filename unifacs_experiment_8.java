import java.util.Scanner;
//Original Experiment Name: Is the value between 0 and 10

public class unifacs_experiment_8 {

    
    public static void main (String[] args) {

    Scanner scan = new Scanner(System.in);

    Float X;

    System.out.println ("Type in the value:");
    X=scan.nextFloat();

    if ( X>=0 && X<=10) {
        System.out.println ("The value is valid");
    } else {
        System.out.println ("The value is invalid");
    }
    scan.close();
    }
}
