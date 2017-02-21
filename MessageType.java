public enum MessageType{

  BROADCAST(1),
  PING(2);

  private int value;
  MessageType(int v){
    value = v;
  }
  public int getValue(){
    return value;
  }
}
