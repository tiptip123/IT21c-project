
package oop_basics;


public class Car {
   String car_name;
   double car_price;
    
    Car(String car_name,double car_price){
        this.car_name = car_name;
        this.car_price = car_price;
}     
    void CarMode(){
        System.out.println(car_name +"is a race car");
    }
    void CarPrice(){
        System.out.println(car_price+"is grabi ka mahal!");
    }
    
}
