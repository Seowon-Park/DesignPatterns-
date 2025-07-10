package P8;

public class CompressionDecorator extends Decorator{

    CompressionDecorator(MessageSender sender){super(sender);} //메시지 작동 객체 저장

    public void send(String m){
        sender.send("[Compressed]"+m);//메시지 작동 객체 저장에 "[Compressed]"+"안녕" 보낼 수 있음
    }
}
