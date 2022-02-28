package patika_java101_oop.BoksMaci;
public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Mike Tyson",15,100,90,0);
        Fighter f2 = new Fighter("Muhammed Ali",10,95,100,0);

        Match match = new Match(f1,f2,90,100);
        match.run();
    }   
}
