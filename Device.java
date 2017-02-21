class Device {
protected String name;
protected String IP;
public static TIME_UNIT = 10_000// a unit of time is 10 milliseconds. just so that I'll not end up will extremely large number pretty quick.
protected int localTime;
public Device(String name, String IP, int localTime){
  this.name = name;
  this.IP = IP;
  this.localTime = localTime;
}
public Device(){

}


}
