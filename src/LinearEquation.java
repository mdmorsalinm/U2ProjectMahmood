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
        return Math.sqrt((double)(x2 - x1) + (y2 - y1));
    }

    public double slope() {
        return ((double) (y2 - y1)/(x2 - x1));
    }

    public double yIntercept() {
        return (y1 - (slope() * x1));
    }

    public String equation() {
        if (y1 == y2){
            return "y = " + yIntercept();
        } else {
            return "y = " + (y2 - y1) + "/" + (x2 - x1) + " + " + yIntercept();
        }
    }

    public double roundedToHundredth(double toRound) {
        return Math.round(toRound * 100) / 100.0;
    }

    public String coordinateForX(double x) {
        double y = (x * slope()) + yIntercept();
        return "(" + x + ", " + y + ")";
    }
}
