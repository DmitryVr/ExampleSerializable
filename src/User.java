import java.io.Serializable;

public class User implements Serializable {

    private int lifeLevel; // уровень HP
    private Sword sword; // меч

    // используется ключевое слово transient, это поле не сериализуется
    // значение поля будет по-умолчанию
    // transient поле не должно использоваться в hashCode и equals
    transient private int manaLevel;

    private static int staticFiels; // статические поля не сериализуются !!!

    public void getLifeLevel() {
        System.out.println("Ваш уровень " + lifeLevel);
    }

    public void setLifeLevel(int lifeLevel) {
        this.lifeLevel = lifeLevel;
    }



    public void createUserSword(int levelSword) {
        sword = new Sword(levelSword);
    }

    public void setUserLevelSword(int levelSword) {
        sword.setLevelSword(levelSword);
    }

    public void getUserLevelSword() {
        sword.getLevelSword();
    }
}
