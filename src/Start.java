import java.io.*;

public class Start {

    public static void main(String[] args) {

        Priest user = new Priest();
        user.setLifeLevel(55);
        user.createUserSword(1);
        user.setUserLevelSword(2);
        user.setHillHP(7);


        try {
            saveUser(user);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Priest newUser = loadUser();
            newUser.getLifeLevel();
            newUser.getUserLevelSword();
            newUser.getHillHP();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void saveUser(Priest user) throws IOException {
        System.out.println();
        FileOutputStream fileOutputStream = new FileOutputStream("tempFile");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user);
        fileOutputStream.close();
        objectOutputStream.close();
    }

    private static Priest loadUser() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("tempFile");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Priest user = (Priest) objectInputStream.readObject();

        fileInputStream.close();
        objectInputStream.close();

        return user;
    }
}
