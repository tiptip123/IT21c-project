
package Polymorphism;


public class Main {
    
    public static void main(String [ ]args){
        Runner runner = new Runner();
        runnerJosip josip = new runnerJosip("josip");
        runnerLester lester = new runnerLester("lester");
        
        
        
        runner.RunnerPlacement();
        josip.RunnerPlacement();
        lester.RunnerPlacement();
    }
    
}
