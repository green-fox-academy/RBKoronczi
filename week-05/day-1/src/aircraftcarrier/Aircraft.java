package aircraftcarrier;

public class Aircraft {
  int ammo;
  int maxAmmo;
  int damage;
  String type;
  private boolean isPriority;

  Aircraft(String type, int maxAmmo, int damage, boolean isPriority) {
    this.type = type;
    this.maxAmmo = maxAmmo;
    this.damage = damage;
    ammo = 0;
    this.isPriority = isPriority;
  }

  int fight() {
    int totalDamage = ammo * damage;
    ammo = 0;
    return totalDamage;
  }

  int refill(int totalAmmo) {
    int remaining = 0;
    if(ammo + totalAmmo > maxAmmo) {
      remaining = ammo + totalAmmo - maxAmmo;
      ammo = maxAmmo;
    } else {
      ammo += totalAmmo;
    }
    return remaining;
  }

  String getType() {
    return type;
  }

  String getStatus() {
    return "Type " + type + ", Ammo: " + ammo + ", Base Damage: " + damage + ", All Damage: " + this.fight();
  }

  boolean isPriority(){
    return isPriority;
  }
}
