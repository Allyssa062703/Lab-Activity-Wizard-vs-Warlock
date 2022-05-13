public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Battle Begin!");
        System.out.println("Wizard and Warlock");
        System.out.println("Both Characters Have 500 HP and 500 Mana");
        System.out.println("~~~~~~~~~~");

        Wizards Rick = new Wizards("Rick");
        Warlocks Morty = new Warlock("Morty");
        Rick.Uppercut(Morty);
        Rick.punch(Morty);
        Morty.onepunch(Rick);
        Rick.slap(Morty);
        Morty.powerpunch(Rick);
        Morty.hamehamewave(Rick);
        Morty.slappunch (Rick);
        Rick.jab(Rick);
        Morty.headbutt (Rick);
        Rick.powerslap(Morty);

    }
}
