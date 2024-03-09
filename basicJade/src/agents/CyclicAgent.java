package src.agents;
import src.behaviours.Cyclic;

// agent sending the message every 2s
public class CyclicAgent extends MessageAgent {
    @Override
    protected void setup(){
        speak("I am a cyclic Agent!");
        addBehaviour(new Cyclic(this, 2000));
    }
}
