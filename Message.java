public class Message{
  private MessageType type;
  private String body;
  private String sender;
  private String receiver;
  public Message(MessageType type, String body, String sender, String receiver){
    this.body = body;
    this.type = type;
    this.sender = sender;
    this.receiver = receiver;
  }
}
