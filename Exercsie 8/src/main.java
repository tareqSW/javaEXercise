public class main {
    public static void main(String[] args) {
        Fan fan = new Fan();
        Fan fan1 = new Fan();
        fan.setSpeed(Fan.getFAST());
        fan.setRaduis(10);;
        fan.setColor("yellow");
      fan.setOn(true);
        System.out.println(fan.toString());
        fan1.setSpeed(Fan.getMEDIUM());
        fan1.setRaduis(5);;
        fan1.setColor("blue");
        fan1.setOn(false);
        System.out.println(fan1.toString());
    }
}
