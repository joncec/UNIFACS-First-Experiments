import java.util.Scanner;
//Original Experiment Name: Is this value inside the circle?

public class unifacs_experiment_9 {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        double Xa, Xb, Ya, Yb, Area, Radius, Perimeter, disA, disB, Distance;
        String answerA, answerB;
        answerA = "The point is inside the circle";
        answerB = "The point is not inside the circle";

        System.out.println ("First, let's define your circle");

        System.out.println ("Insert the value of the circle's X:");
        Xa =scan.nextDouble();
        System.out.println ("Insert the value of the circle's Y:");
        Ya = scan.nextDouble();
        System.out.println ("Insert the value of the circle's radius");
        Radius = scan.nextDouble();
        
        Area = Math.PI*Radius*Radius;
        Perimeter = 2*Math.PI*Radius;

        System.out.println (" Your circles's Area is " + Area + " and it's perimeter is " + Perimeter);

        System.out.println ("Now let's define your point");
        System.out.println (" ");

        System.out.println ("Insert the value of the X:");
        Xb = scan.nextDouble();
        System.out.println ("Insert the value of the Y:");
        Yb = scan.nextDouble();

        disA = Xa-Xb;
        disB = Ya-Yb;
        Distance = Math.sqrt(Math.pow(disA,2) + Math.pow(disB,2));

        if (Distance>Radius) {
            System.out.println (answerB);
        } else {
            System.out.println(answerA);
        }

        scan.close();
    }
}
