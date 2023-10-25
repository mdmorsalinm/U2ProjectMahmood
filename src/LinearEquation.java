public class LinearEquation {
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double distance() {
        return roundedToHundredth(Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
    }

    public double slope() {
        return roundedToHundredth((double) (y2 - y1)/(x2 - x1));
    }

    public double yIntercept() {
        return roundedToHundredth(y1 - (slope() * x1));
    }

    public String equation() {
        String str = "y = ";
        if (y1 == y2 || x1 == x2){
            str += yIntercept();
            return str;
        }
        if (slope() == 1) {
            str += "x ";
        } else if (slope() == -1) {
            str += "-x ";
        } else if (slope() == (int) slope()) {
            str += (int) slope() + "x ";
        } else if (slope() < 0) {
            str += "-" + Math.abs(y2 - y1) + "/" + Math.abs(x2 - x1) + "x ";
        } else if (slope() > 0) {
            str += Math.abs(y2 - y1) + "/" + Math.abs(x2 - x1) + "x ";
        }
        if (yIntercept() ==  0) {
            return str;
        } else if (yIntercept() > 0) {
            str += "+ " + yIntercept();
        } else if (yIntercept() < 0) {
            str += "- " + Math.abs(yIntercept());
        }
        return str;

    }

    private double roundedToHundredth(double toRound) {
        return Math.round(toRound * 100) / 100.0;
    }

    public String coordinateForX(double x) {
        double y = (x * slope()) + yIntercept();
        return "(" + x + ", " + y + ")";
    }

    public String lineInfo() {
        String str = "The two points are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")" + "\n";
        str += "The equation of the line between these points is: " + equation() + "\n";
        str += "The slope of this line is: " + slope() + "\n";
        str += "The y-intercept of the line is: " + yIntercept() + "\n";
        str += "The distance between the points is " + distance();
        return str;
    }
}
