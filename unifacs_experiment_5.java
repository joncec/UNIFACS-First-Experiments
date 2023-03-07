import java.util.Scanner;
//Original Experiment Name: Easter Sunday 2

public class unifacs_experiment_5 {
    public static void main(String[] args) {

        int monthA, calculusA, calculusB, monthB, year, a, b, c, d, e ,x ,y;

        Scanner scan = new Scanner(System.in);

            System.out.println("Type in the desired year: ");
            year=scan.nextInt();

            x = 24;
            y = 5;
            a = year%19;
            b = year%4;
            c = year%7;
            d = (19*a+x)%30;
            e = (2*b+4*c+6*d+y)%7;

            if (d+e>9) {
            monthA = 4;
            calculusA = d+e-9;
            System.out.println("Easter Sunday is in " + calculusA + "/" + monthA + "/" + year);
            } else {
            calculusB = d+e+22;
            monthB = 3;
            System.out.println("Easter Sunday is in " + calculusB + "/" + monthB + "/" + year);
            }

        scan.close();
    
    }
}

