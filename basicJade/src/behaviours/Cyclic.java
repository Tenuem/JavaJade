package src.behaviours;

import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;

public class Cyclic extends TickerBehaviour {

    public Cyclic(Agent a, long period) {
        super(a, period);
    }

    @Override
    public void onTick() {
        System.out.println("That's my superpower that I can recharge!");
    }
}
