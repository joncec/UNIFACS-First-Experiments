import java.util.Scanner;
//Original Experiment Name: Two Number Calculator

public class unifacs_experiment_13 { 
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, mp=0, n, ct;
        do {
        //ct=continue, r=result, mp=multiplier, n=number.
            mp=0;
            System.out.println("Type in a number you want the table for:");
            n = sc.nextInt();
            while (mp<=10) {
                r = n*mp;
                System.out.println(n+" X "+mp+" = "+r);
                mp++;
            }
        System.out.println("Do you wish to continue? (1) Yes / (2) No");
        ct = sc.nextInt();
        } while (ct == 1);
        sc.close();
    }
}