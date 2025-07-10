package P8;

public class LoggingDecorator extends Decorator{

    LoggingDecorator(MessageSender sender){super(sender);}//"[Encrypted]"+m 보낼 수 있는 객체 저장

    public void send(String m){
        sender.send("Logging:"+m);
    }
}

//최종적으로는 MessageSender sender에 "Logging:"+m 보낼 수 있는 객체(LogginDecorator클래스) 저장
//LogginDecorator클래스.send -> sender="[Encrypted]"+m 보낼 수 있는 객체 -> EncryptionDecorator로 이동

//LoggingDecorator.send() => EncryptionDecorator.send()
// => CompressionDecorator.send() => 메시지 작동 객체(BasicMessageSender).send()

// "Logging:"+m => "[Encryption]"+("Logging:"+m)
// => "[Compression]+("[Encryption]"+("Logging:"+m))" => 프린트("[Compression]+("[Encryption]"+("Logging:"+m))")