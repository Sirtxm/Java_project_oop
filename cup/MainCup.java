package cup;
public class MainCup {
    public static void main(String[] args) {
        Cup c1 = new Cup();
        Cup c2 = new Cup();
        c1.setupCup('A', 500);
        c2.pourAllWater();
        c2.setupCup('B', 500);
        c2.checkWater();
        c1.fillWater(400);
        c1.pourToOther(300, c2);
        c1.checkWater();
        c2.checkWater();
        c2.pourToOther(100, c1);
        c1.fullFill();
        c1.checkWater();
        c1.pourAllWater();
        c1.checkWater();
        c2.fillWater(600);
        c2.checkWater();
        c2.pourToOther(900, c1);
    }
}
