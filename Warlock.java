public class Warlock extends Character {
    Warlock(String name) {
        super(name);
    }

    public void onepunch(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with onepunch (Damage - 40 , Mana Cost - 20)");
        int damagePoints = 45;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 60;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void hamehamewave(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with Amaterasu (Damage - 50 , Mana Cost - 20)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 20;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void slappunch(Character characterName) {
        System.out.println("Both use Heal");
        System.out.println("~~~~~~~~~~~~~~~~");
        System.out.println(super.characterName + " Use sixpathshealing  (Heal - 40)");
        int healPoints = 80;
        healTarget(characterName, healPoints);
        manadTarget(characterName, manaPoints);
    }

    public void headbutt(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with IndrasArrow (Damage - 40 , Mana Cost - 65)");
        int damagePoints = 70;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 60;
        manaTarget(enemyCharacter, manaPoints);
    }
}
