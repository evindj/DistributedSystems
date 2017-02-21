import java.util.*;
class NetworkNode extends Device implements Runnable, ICommunicator{
private int TIME_OUT = 10;
private int portNumber;
private HashMap<String, Integer> membershipList;
private LinkedList<Message> receivingQueue;
public NetworkNode(int portNumber){
  this.portNumber = portNumber;
  receivingQueue = new LinkedList<>();
  membershipList = new HashMap<>();

}
public void run(){
  sleep(Device.TIME_UNIT);
  //
}

public void sendMessage(){
  //Build the message and write it to the Network Queue. The Application Thread will be in charge of
  //retrieving the message from the Network Queue and Writing it into the receipient Queue.
}

public void receiveMessage(){
  // read the Local Queue and process messages.
}
}
