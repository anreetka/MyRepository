package printstudentlist;

public class Main {

    public static void main(String[] args) {
       
        Student[] list = new Student[3]; //array of objects 
        
        //create object for three students, store and print value
        
        Student s1 = new Student();
        s1.setName("Shweta");
        s1.setAge(20);
        
        Student s2 = new Student();
        s2.setName("Arun");
        s2.setAge(18);
        
        Student s3 = new Student();
        s3.setName("Kritika");
        s3.setAge(28);
        
        list[0] = s1;
        list[1] = s2;
        list[2] = s3;
        
        for(int i = 0; i < list.length; i++)
        {
            System.out.println(list[i]);
        }
        
        System.out.println();
        
        for(int i = 0; i < list.length; i++)
        {
            System.out.println("Name: " + list[i].getName() + ", Age: " + list[i].getAge());
        }
        
        System.out.println();
        
        for(Student y: list)
        {
            System.out.println(y);
        }
    }
    
}


