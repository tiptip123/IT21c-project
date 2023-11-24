
package LAB_Exercise_inheritance;


public class Person {
    String name;
    String dateOfBirth;
    
    Person(String name,String dateOfBirth){
     this.name = name;
     this.dateOfBirth = dateOfBirth;
    }
    
    public static void main (String [] args){
    
        Student student = new Student("Joseph Jay B Baguio","March 19, 2001");
        System.out.println(student);
       
    }   
}
