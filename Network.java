import java.util.*;
public class Network{
  private static  Network instance = new Network();
private LinkedList<Message> messages;
private Network(){
  messages = new LinkedList<>();
}

public static Network getInstance(){
  return instance;
}

public  void writeQueue(Message msg){
  synchronized(this){
    messages.add(msg)
  }

}

public Message readQueue(int pos) throws Exception{
  if(pos <0 || pos >= messages.size()){
    throw new ArgumentException();
  }
  synchronized(this){
    return messages.get(pos);
  }
}

}
