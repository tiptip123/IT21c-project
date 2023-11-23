package Abstract;


public class josip extends Swimmer {
    String name;
    
    josip(String name){
     this.name = name;   
    }
    public  void SwimmerName(){
        System.out.println(name +" is leading");
    }
    
}