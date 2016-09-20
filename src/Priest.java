import java.io.Serializable;

public class Priest extends User implements Serializable {

    private int hillHP;

    public void getHillHP() {
        System.out.println("Вы лечите по " + hillHP + "HP за каст");
    }

    public void setHillHP(int hillHP) {
        this.hillHP = hillHP;
    }
}
