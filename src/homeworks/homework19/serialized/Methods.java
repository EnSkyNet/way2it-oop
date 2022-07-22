package homeworks.homework19.serialized;

import java.io.*;

public class Methods {
    public void serialize(Object obj, String filename)  {
        try (FileOutputStream fileOutputStream = new FileOutputStream(filename);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(obj);
            System.out.println("Object was serialized!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Object deserialize(String filename) throws  ClassNotFoundException {
        try (FileInputStream fileInputStream = new FileInputStream(filename);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            Object obj = objectInputStream.readObject();
            System.out.println("Object was Deserialized!");
            return obj;
        }catch (IOException e) {    System.out.println("Object was NOT Deserialized!");
        return null;}
    }
}