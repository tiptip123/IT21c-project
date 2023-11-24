
package Interface;


public class mj implements Hackers{
    String name;
    
    mj(String name){
        this.name = name;
    }

    
    public void did() {
        
         System.out.println(name +" hacked his bestfriends phone.");
    }

   
    public void didNot() {
        
         System.out.println(name +" peru na trace siyas NBI.");
    }
    
    
}
