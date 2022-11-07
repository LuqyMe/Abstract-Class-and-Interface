public class Main {
  public static void main(String[] args) throws Exception {
    Weapon senjata = new Knife();

    Weapon knife = new Knife();
    Weapon gun = new Gun(10);

    knife.attack();
    gun.attack();
    gun.attack();

    Knife pisau = new Knife();
    Weapon senjataapi = new Gun(10);

    pisau.attack();
    senjataapi.attack();
    senjataapi.attack();
  }
}