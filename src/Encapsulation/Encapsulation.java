
package Encapsulation;


public class Encapsulation extends Area {

    public Encapsulation(int length, int width) {
        super(length, width);
    }
 
     public void getArea(){
            int area = length+width;
            System.out.println("Area:"+area);
        }
    }
    
    

