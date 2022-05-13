public class Wizard extends Character {
    Wizard(String name) {
        super(name);
    }

    public void Uppercut(Character enemyCharacter) {

        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with Rasengan (Damage - 50 , Mana Cost - 30)");
        int damagePoints = 95;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 80;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void slap(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks again " + enemyCharacter.characterName
                + " with Rasenshuriken (Damage - 60 , Mana Cost - 20)");
        int damagePoints = 60;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 50;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void powerslap(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks again " + enemyCharacter.characterName
                + " with Sagemodenatureenergy (Damage - 40 , Mana Cost - 35)");
        int damagePoints = 40;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 50;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void jab(Character characterName) {
        System.out.println(super.characterName + " Use Ashuramode (Heal - 50)");
        int healPoints = 40;
        healTarget(characterName, healPoints);
        manadTarget(characterName, manaPoints);
    }

    public void punch(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks again " + enemyCharacter.characterName
                + " with WaterSlash (Damage - 80 , Mana Cost - 40)");
        int damagePoints = 80;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 60;
        manaTargett(enemyCharacter, manaPoints);

    }

    public void Fumashuriken(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks again " + enemyCharacter.characterName
                + " with OceanOddity (Damage - 10 , Mana Cost - 10)");
        int damagePoints = 20;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 50;
        manaTarget(enemyCharacter, manaPoints);
        levelTarget(enemyCharacter, level);
    }
