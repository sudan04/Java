



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;




class Student implements Serializable{
 private static final long serialVersionUID= 1L;
 private int roll;
 private String name;
 private String address;
 private String college;

 public Student(int roll, String name, String address, String college){
    this.roll= roll;
    this.name= name;
    this.address= address;
    this.college= college;
 }

 public String getAddress(){
    return this.address;
 }

 public String toString(){
    return "Roll: "+roll+" Name: "+name+" Address: "+address+" College: "+college+"\n";
 }
}

public class Main{
    public static void main(String[] args) {
        List<Student> list= new ArrayList<>();
        list.add(new Student(1, "Sudan Bhusal", "Jhapa", "Nepathya"));
        list.add(new Student(2, "Nisil Pantha", "Traffic Chowk", "Tilottama"));
        list.add(new Student(3, "Sujan Saru", "Jhapa", "Horizen"));

        try(ObjectOutputStream os= new ObjectOutputStream(new FileOutputStream("hello.txt"))){
            for(Student obj: list){
                os.writeObject(obj);
            }
        }catch(IOException e){
            e.printStackTrace();
        }

        try(ObjectInputStream is= new ObjectInputStream(new FileInputStream("hello.txt"))){
            while(true){
                try{
                    Student st= (Student) is.readObject();
                    if(st.getAddress().equalsIgnoreCase("jhapa"))
                    System.out.println(st);
                }catch(Exception e){
                    break;
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }


    }
}




