import java.util.*;
class NetworkNode extends Device{
private int portNumber;
private HashMap<String, Integer> membershipList;
private LinkedList<Message> receivingQueue;
public NetworkNode(int portNumber){
  this.portNumber = portNumber;
  receivingQueue = new LinkedList<>();
  membershipList = new HashMap<>();

}
}
