public class BatTest {
    public static void main(String[] args){
        Bat bat = new Bat(300);
        bat.attackTown();
        bat.displayEnergy();
        bat.attackTown();
        bat.displayEnergy();
        bat.attackTown();
        bat.displayEnergy();

        bat.eatHumans();
        bat.displayEnergy();
        bat.eatHumans();
        bat.displayEnergy();

        bat.fly();
        bat.displayEnergy();
        bat.fly();
        bat.displayEnergy();
    }
}
