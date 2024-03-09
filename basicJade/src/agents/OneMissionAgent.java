package src.agents;

import jade.core.behaviours.OneShotBehaviour;

// agent that sends one message to the console
public class OneMissionAgent extends MessageAgent {
    @Override
    protected void setup(){
        speak("I am here to do one task");
        addBehaviour(new OneShotBehaviour() {
            @Override
            public void action() {
                System.out.println("That was my task! I consider it done.");
            }
        });
    }
    @Override
    public void takeDown(){
        speak("My life is about to end... Goodbye!");
    }
}
