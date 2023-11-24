
package Interface;


 class josip implements Hackers{
     String name;
     
     josip(String name){
      this.name = name;   
     }
     
    public void did(){
        System.out.println(name +" hacked nasa last month.");
        
    }
    public void didNot() {
        System.out.println(name + "did not hack gcash kay taas ug security");
        
    }
}
