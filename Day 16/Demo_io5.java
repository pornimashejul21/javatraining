//ObjectInputStream

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
    private int id;
    private String name;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

public class Demo_io5 {
    public static void main(String[] args)throws Exception {

        
        FileInputStream fin;
        fin=new FileInputStream("C:\\JAVA Traing\\Student.txt");
     ObjectInputStream in;
     in=new ObjectInputStream(fin);
     
     Student st3=(Student) in.readObject();
     System.out.println(st3.getId());
     System.out.println(st3.getName());
        
    }
}
