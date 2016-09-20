import java.io.Serializable;

public class Sword implements Serializable { // классы ассоциации тоже надо сериализовать

    private int levelSword;

    public Sword(int levelSword) {
        System.out.println("У вас появился меч " + levelSword + " уровня");
        this.levelSword = levelSword;
    }

    public void getLevelSword() {
        System.out.println("У вашего меча " + levelSword + " уровень");
    }

    public void setLevelSword(int levelSword) {
        System.out.println("Ваш меч прокачался до " + levelSword + " уровня");
        this.levelSword = levelSword;
    }
}
