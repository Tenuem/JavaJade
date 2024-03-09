package src.agents;

import jade.core.behaviours.*;
import java.util.Scanner;

// agent that reads the numbers and calculates the average
public class MathematicianAgent extends MessageAgent{

    private int howManyNumbers, counter;
    private int sum;

    @Override
    protected void setup(){
        speak("Hi, I'm here to calculate your numbers ;)");

        SequentialBehaviour seq = new SequentialBehaviour();
        // read number of numbers
        seq.addSubBehaviour(new OneShotBehaviour() {
            @Override
            public void action() {
                System.out.println("How many numbers you want to insert?");
                Scanner input = new Scanner(System.in);
                howManyNumbers = input.nextInt();
                counter = howManyNumbers;
            }
        });

        // read the sequence of numbers
        seq.addSubBehaviour(new SimpleBehaviour() {
            Scanner input = new Scanner(System.in);
            @Override
            public void action() {

                    speak("Give me the number: ");
                    sum += input.nextInt();
                    counter--;

            }
            @Override
            public boolean done(){
                return counter == 0;
            }
        });

        // calculate the average
        seq.addSubBehaviour(new OneShotBehaviour() {
            @Override
            public void action() {
                speak("I've completed the calculations!");
                speak("Average of your numbers is equal to " + (double)sum/(double)howManyNumbers);
            }
        });

        addBehaviour(seq);
    }
}
