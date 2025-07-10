package P7;

public class MessageEmail implements MessageSender{
    public void send(String title, String body){
        System.out.println("제목: "+title+", 내용: "+body);
    }
    public String getType(){
        return "Email";
    }
}
