public class Fan {
    public static int SLOW = 1;
    public static int MEDIUM= 2;
    public static int FAST = 3;
    private int speed = 1;
    private boolean on = false;
    private  double raduis  = 5;
    String color = "blue";

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static int getFAST() {
        return FAST;
    }

    public static void setFAST(int FAST) {
        Fan.FAST = FAST;
    }

    public static int getMEDIUM() {
        return MEDIUM;
    }

    public static void setMEDIUM(int MEDIUM) {
        Fan.MEDIUM = MEDIUM;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRaduis() {
        return raduis;
    }

    public void setRaduis(double raduis) {
        this.raduis = raduis;
    }

    public static int getSLOW() {
        return SLOW;
    }

    public static void setSLOW(int SLOW) {
        Fan.SLOW = SLOW;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        if (on==true){
            return "Fan{" +
                    "color='" + color + '\'' +
                    ", speed=" + speed +
                    ", raduis=" + raduis +
                    '}';
        }
        else {
            return "Fan{" +
                    "color='" + color + '\'' +
                    ", speed=" + speed +
                    ", raduis=" + raduis +
                    '}' +", fan is off";
        }

    }
}
