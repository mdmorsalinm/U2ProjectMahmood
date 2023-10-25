import java.util.Scanner;
public class LinearEquationLogic {
    private Scanner scan;
    private LinearEquation equation;
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    public LinearEquationLogic() {
        scan = new Scanner(System.in);
        equation = null;
        x1 = 0;
        x2 = 0;
        y1 = 0;
        y2 = 0;
    }

    public void start() {
        String user = "";
        System.out.println("Welcome to linear equation calculator!");
        while (!user.equals("n")) {
            System.out.print("Enter coordinate 1: ");
            String cord1 = scan.nextLine();
            System.out.print("Enter coordinate 2: ");
            String cord2 = scan.nextLine();
            System.out.println();
            initialize(cord1, cord2);
            if (x1 != x2) {
                System.out.println(equation.lineInfo());
                System.out.println();
                System.out.print("Enter a value for x: ");
                double x = scan.nextDouble();
                scan.nextLine();
                System.out.println();
                System.out.println("The point on the line is " + equation.coordinateForX(x));
                System.out.println();
                System.out.print("Would you like to enter another pair coordinates? y/n: ");
                user = scan.nextLine();
            } else {
                System.out.println("These points are on a vertical line: x = " + x1);
                System.out.print("Would you like to enter another pair coordinates? y/n: ");
                user = scan.nextLine();
            }
        }
        System.out.println("Thank you for using the slope calculator, goodbye!");
    }

    private void initialize(String cord1, String cord2) {
        int index1 = cord1.indexOf(",");
        x1 = Integer.parseInt(cord1.substring(1, index1));
        y1 = Integer.parseInt(cord1.substring(index1 + 2, cord1.length() - 1));
        int index2 = cord2.indexOf(",");
        x2 = Integer.parseInt(cord2.substring(1, index2));
        y2 = Integer.parseInt(cord2.substring(index2 + 2, cord2.length() - 1));
        equation = new LinearEquation(x1, y1, x2, y2);
    }
}
