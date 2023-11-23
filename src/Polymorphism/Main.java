package Polymorphism;

public class Main {

    public static void main(String[] args) {
        Runner runner = new Runner();
        runnerJosip josip = new runnerJosip("josip");
        runnerLester lester = new runnerLester("lester");
        runnerJoash joash = new runnerJoash("Joash");
        runnerJethro jethro = new runnerJethro("Jethro");
        runnerMj mj = new runnerMj("Mj");

        runner.RunnerPlacement();
        josip.RunnerPlacement();
        lester.RunnerPlacement();
        joash.RunnerPlacement();
        jethro.RunnerPlacement();
        mj.RunnerPlacement();
    }

}
