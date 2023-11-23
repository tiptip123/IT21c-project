
package Polymorphism;


public class Main {
    
    public static void main(String [ ]args){
        Runner runner = new Runner();
        runnerJosip josip = new runnerJosip("josip");
        runnerLester lester = new runnerLester("lester");
        runnerJoash joash = new runnerJoash("Joash");
        
        
        runner.RunnerPlacement();
        josip.RunnerPlacement();
        lester.RunnerPlacement();
        joash.RunnerPlacement();
    }
    
}
