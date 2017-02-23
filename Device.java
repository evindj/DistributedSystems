class Device implements Runnable{
protected String name;
protected String IP;
protected Thread executor;
protected boolean isRunning;
public static TIME_UNIT = 10_000// a unit of time is 10 milliseconds. just so that I'll not end up will extremely large number pretty quick.
protected int localTime;
public Device(String name, String IP){
  this.name = name;
  this.IP = IP;
  this.localTime = 0;
  isRunning = false;

}
public Device(String IP){
  this.IP = IP;
  localTime =0;
}
public void start(){
  this.executor = new Thread(this);
  executor.start();
  isRunning = true;
}
public Device(){

}
public void run(){
  while(true){
    sleep(Device.TIME_UNIT);
    localTime++;
  }

  //
}

public void stop(){
  isRunning = false;
  executor.setIsTerminating(true);

}

public void slowDeviceDown(){
  // increase the response time
}

}
