package _32_Serialization;

import java.io.*;

// A simple class that implements Serializable
class Person implements Serializable {
    private static final long serialVersionUID = 1L; // Serialization version UID
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        // Serialize the object
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/Serialization/serializedfile.ser"))) {
            Person person = new Person("Alice", 30);
            oos.writeObject(person);
            System.out.println("Object serialized and saved to serializedfile.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the object
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/Serialization/serializedfile.ser"))) {
            Person deserializedPerson = (Person) ois.readObject();
            System.out.println("Object deserialized: " + deserializedPerson.getName() + ", " + deserializedPerson.getAge());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

