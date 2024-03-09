package src.agents;

import jade.core.Agent;

// the parent class for agents so their messages are with their names
public class MessageAgent extends Agent {

    protected void speak(String quote){
        System.out.println(quote + " [" + this.getLocalName() + "]");
    }
}
