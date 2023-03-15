import java.util.Scanner;
//Original Experiment Name: Months and Switch

public class unifacs_experiment_10 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int M;

        System.out.println("Type in the number of a month:");
        M = sc.nextInt();

        if (M<=12 && M>0) {
            switch (M) {
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
            }
        } else {
            System.out.println("This number is not valid.");
        }
        sc.close();
    }
}