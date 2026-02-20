public class main {
    public static void main(String[] args) {
        QuadraticEquation q= new QuadraticEquation(1,5,6);
        if (q.getDiscriminant()>0){
            System.out.println("root 1 =" +q.getRoot1()+" , "+ "root 2 =" + q.getRoot2());
        }
        else if (q.getDiscriminant() == 0){
            System.out.println("one root =" + q.getRoot1());
        }
        else {
            System.out.println("The equation has no roots.");
        }
    }
}
