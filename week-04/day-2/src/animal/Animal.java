package animal;

public class Animal {
    public int hunger;
    public int thirst;

    public Animal(){
        this.hunger = 50;
        this.thirst = 50;
    }

    void Eat(){
        hunger--;
    }
    void Drink(){
        thirst--;
    }
    void Play(){
        hunger++;
        thirst++;
    }
}
