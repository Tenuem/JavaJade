package src.agents;

// basic agent with action in setup
public class SimpleAgent extends MessageAgent {
    @Override
    protected void setup() {
        speak("Hello world! I'm an agent!");
        doDelete();
    }
    @Override
    public void takeDown(){
        speak("My life is about to end... Goodbye!");
    }
}
