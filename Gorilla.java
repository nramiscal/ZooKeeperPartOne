
public class Gorilla extends Mammal {

    public Gorilla(){
        System.out.println("Energy level: " + getEnergy());
    }

    public void throwSomething(){
        System.out.println("Gorilla threw something.");
        this.setEnergy(this.getEnergy()-5);
    }

    public void eatBananas(){
        System.out.println("Yum, yum! Bananas taste good!");
        this.setEnergy(this.getEnergy()+10);
    }

    public void climb(){
        System.out.println("Gorilla climbed a tree.");
        this.setEnergy(this.getEnergy()-10);
    }

}
