
import java.util.Scanner;
//Original Experiment Name: Months Char


public class unifacs_experiment_11 {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println ("Digite a primeira letra de um dos 3 primeiros meses do ano.");
        char
        x = sc.next().charAt(0);

        switch (x) {
            case 'j':
                System.out.println ("Janeiro.");
                break;
            case 'f':
                System.out.println ("Fevereiro.");
                break;
            case 'm':
                System.out.println ("Março.");
                break;
            default:
                System.out.println("Esta letra é invalida.");
                break;
        }
        sc.close();
    }
}
