package javaProblems.Serialization;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileOutputStream fos = new FileOutputStream("C:\\Users\\vsure\\IdeaProjects\\PracticeProblems_Java\\src\\Serialization\\newFile.ser");

        Employee obj = new Employee();
        obj.setId(1);
        obj.setName("suren");

        Employee obj1 = new Employee();
        obj1.setId(2);
        obj1.setName("raj");

        Employee obj2 = new Employee();
        obj2.setId(2);
        obj2.setName("shiva");

        Employee obj3 = new Employee();
        obj3.setId(2);
        obj3.setName("hari");

        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);
        oos.writeObject(obj1);
        oos.writeObject(obj2);
        oos.writeObject(obj3);

        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("C:\\Users\\vsure\\IdeaProjects\\PracticeProblems_Java\\src\\Serialization\\newFile.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Employee a = (Employee) ois.readObject();
        Employee b = (Employee) ois.readObject();
        Employee c = (Employee) ois.readObject();
        Employee d = (Employee) ois.readObject();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        fis.close();
        ois.close();

    }

}
