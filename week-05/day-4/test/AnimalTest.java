import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
  Animal animal;

  @BeforeEach
  void beforeEach() {
   animal = new Animal();
  }

  @Test
  void eat() {
    int initHunger = animal.hunger;
    animal.Eat();
    assertTrue(animal.hunger < initHunger);
  }

  @Test
  void drink() {
    int initThirst = animal.thirst;
    animal.Drink();
    assertTrue(animal.thirst < initThirst);
  }

  @Test
  void play() {
    int initThirst = animal.thirst;
    int initHunger = animal.hunger;
    animal.Play();
    assertTrue(animal.thirst > initThirst & animal.hunger > initHunger);
  }
}
