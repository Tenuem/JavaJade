package src;
import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import jade.wrapper.StaleProxyException;
import src.agents.MathematicianAgent;


public class Main {
    public static void main(String[] args){
        Runtime rt = Runtime.instance();

        Profile p = new ProfileImpl();
        p.setParameter(Profile.GUI, "true");
        p.setParameter(Profile.MAIN_HOST, "localhost");
        p.setParameter(Profile.CONTAINER_NAME, "agentContainer");
        ContainerController cc = rt.createMainContainer(p);

        AgentController ac;
        try {
           // task 3
/*            ac = cc.createNewAgent("CyclicAgent",
                    CyclicAgent.class.getCanonicalName(), null);

            ac.start();

            // task 1
            ac = cc.createNewAgent("SimpleAgent",
                    SimpleAgent.class.getCanonicalName(), null);
            ac.start();

            // task 2
            ac = cc.createNewAgent("MissionAgent",
                    OneMissionAgent.class.getCanonicalName(), null);
            ac.start();*/

            // task 4
            ac = cc.createNewAgent("SequentialAgent",
                    MathematicianAgent.class.getCanonicalName(), null);
            ac.start();

        } catch (StaleProxyException e) {
            throw new RuntimeException(e);
        }


    }
}
