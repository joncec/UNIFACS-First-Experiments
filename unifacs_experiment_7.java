import java.util.Scanner;
//Original Experiment Name: Smallest of Three Numbers

public class unifacs_experiment_7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numA, numB, numC, smallest;

        System.out.println ("Type in three whole numbers (press enter after each)");

        numA=scan.nextInt();
        numB=scan.nextInt();
        numC=scan.nextInt();

        if (numA==numB && numA==numC && numB==numC) {
            System.out.println ("The numbers are equal");
        }
        else {

            if ( numA<numB && numB<numC) {
            smallest=numA;

            } else {
                    if (numA<numB) {
                       smallest=numB;
                 } else {
                        smallest=numC;
                    }
                }
                System.out.println ("The smallest number is " + smallest);
            }
        scan.close();
    }
}
