package com.jspider.placement.smallprojectbasedoncollection;

import java.io.*;

public class RemoveDuplicate  implements Serializable{
    int id;
    String name;
    int age;

    public RemoveDuplicate(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "RemoveDuplicate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

       RemoveDuplicate r = new RemoveDuplicate(12,"savan",33);
       FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\savan\\OneDrive\\Desktop\\rajesh\\svana44.txt");
       ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
       objectOutputStream.writeObject(r);

       FileInputStream np = new FileInputStream("C:\\Users\\savan\\OneDrive\\Desktop\\rajesh\\svana44.txt");
       ObjectInputStream objectInputStream = new ObjectInputStream(np);

        RemoveDuplicate rm = (RemoveDuplicate) objectInputStream.readObject();

        System.out.println(rm);
    }
}
