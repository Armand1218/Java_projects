public class Gorilla extends Mammal{

public Gorilla(int energyLevel){
    super(energyLevel);
}

    public void eatBananas(){   
        System.out.println("The Gorilla ate a banana.");
        this.energyLevel += 10;
    }

    public void climb(){
        System.out.println("The Gorilla climb a tree.");
        this.energyLevel -= 10;
    }

    public void throwSomething(){
        System.out.println("The Gorilla threw something.");
        this.energyLevel -= 5;
    }
}
