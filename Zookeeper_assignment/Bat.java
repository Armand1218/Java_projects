public class Bat extends Mammal{
    
    public Bat(int energyLevel){
        super(300);
    }

    public void fly(){
        System.out.println("flap flap flap.. the bat just flew.");
        this.energyLevel -= 50;
    }

    public void eatHumans(){
        this.energyLevel += 25;
    }

    public void attackTown(){
        System.out.println("sshh sshh sshh.. the town got on fire.");
        this.energyLevel -= 100;
    }
}
