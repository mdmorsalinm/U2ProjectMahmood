import java.util.Scanner;
public class LinearEquationLogic {
    Scanner scan;
    LinearEquation equation;
    public LinearEquationLogic() {
        scan = new Scanner(System.in);
        equation = null;
    }

    public void start() {
        String user = "";
        System.out.println("Welcome to linear equation calculator!");
        while (!user.equals("n")) {
            System.out.println("Enter coordinate 1: ");
            String cord1 = scan.nextLine();
            System.out.println("Enter coordinate 2: ");
            String cord2 = scan.nextLine();
            System.out.println();
            initialize(cord1, cord2);
            System.out.println(equation.lineInfo());
            System.out.println();
            System.out.println("Enter a value for x: ");
            double x = scan.nextDouble();
            System.out.println();
            System.out.println("The point on the line is " + equation.coordinateForX(x));
            System.out.println();
            System.out.println("Would you like to enter another pair coordinates? y/n: ");
            user = scan.nextLine();
        }
        System.out.println("Thank you for using the slope calculator, goodbye!");
    }

    private void initialize(String cord1, String cord2) {
        int index1 = cord1.indexOf(",");
        int x1 = Integer.parseInt(cord1.substring(1, index1));
        int y1 = Integer.parseInt(cord1.substring(index1 + 2, cord1.length() - 1));
        int index2 = cord2.indexOf(",");
        int x2 = Integer.parseInt(cord2.substring(1, index2));
        int y2 = Integer.parseInt(cord2.substring(index2 + 2, cord2.length() - 1));
        equation = new LinearEquation(x1, y1, x2, y2);
    }
}
