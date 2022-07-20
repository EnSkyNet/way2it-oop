package homeworks.homework19.serialized;

import java.io.*;

public class Methods {
    public void serialize(Object obj, String filename) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(filename);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(obj);
        objectOutputStream.close();
        fileOutputStream.close();
        System.out.println("Object was serialized!");

    }
    public Object deserialize(String filename) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(filename);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object obj = objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        System.out.println("Object was DEserialized!");
        return obj;
    }
}
