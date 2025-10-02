package oop.class_object.clone;

public class Runner {
    static void main() throws CloneNotSupportedException {
        Agent agent = new Agent("Mister Smit");
        Agent clone = (Agent) agent.clone();
        Agent[] agents = make100Clones(agent);
        for (Agent agent1 : agents) {
            System.out.println(agent1);
        }
    }

    public static Agent[] make100Clones(Agent agent) throws CloneNotSupportedException {
        Agent[] agents = new Agent[1000];
        for (int i = 0; i < 1000; i++) {
            agents[i] = (Agent) agent.clone();
        }
        return agents;
    }
}
