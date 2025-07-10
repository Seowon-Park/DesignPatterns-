package P7;

public class PlatformAndroid extends Platform{
   PlatformAndroid(MessageSender ms){
       super(ms);
   }

    public void notifyUser(String title, String body){
       System.out.print("[Android-"+sender.getType()+"]");
       sender.send(title, body);
   }
}
