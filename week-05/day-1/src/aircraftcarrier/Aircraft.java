package aircraftcarrier;

public class Aircraft {
  int ammo;
  int maxAmmo;
  int damage;
  private boolean isPriority;

  Aircraft(int maxAmmo, int damage, boolean isPriority) {
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
    return "Plane";
  }

  String getStatus() {
    return "Type: " + getType()
        + ", Ammo: " + ammo
        + ", Base Damage: " + damage
        + ", All Damage: " + this.damage * this.ammo;
  }

  boolean isPriority(){
    return isPriority;
  }
}
