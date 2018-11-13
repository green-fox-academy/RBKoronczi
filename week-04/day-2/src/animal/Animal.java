package animal;

public class Animal {
    int hunger;
    int thirst;

    Animal(){
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
