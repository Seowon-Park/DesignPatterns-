package P8;
//데코레이터 패턴
//✅ 문제: 메시지 전송기 기능 확장하기 (Decorator Pattern)
//📌 문제 설명
//회사는 다양한 방법으로 메시지를 전송하는 시스템을 운영하고 있습니다.
// 기본 메시지 전송 기능은 텍스트를 전송하는 것이고, 여기에 암호화, 압축, 로그 기록 등의 기능을 선택적으로 조합해서 사용할 수 있도록 구현하고자 합니다.
//이를 위해 데코레이터 패턴을 사용하여 구현하세요.

//✨ 요구사항
//MessageSender라는 인터페이스를 정의하고, send(String message) 메서드를 가짐
//BasicMessageSender 클래스는 MessageSender를 구현하며, 단순히 메시지를 전송함
//다음 기능을 데코레이터로 구현:
//EncryptionDecorator: 메시지를 전송 전에 "[Encrypted]" 문자열을 앞에 붙임
//CompressionDecorator: 메시지를 전송 전에 "[Compressed]" 문자열을 앞에 붙임
//LoggingDecorator: 메시지를 전송하기 전에 "Logging: [메시지]"를 콘솔에 출력함

//이 데코레이터들은 서로 조합 가능해야 함
//다음 코드를 실행했을 때 기대한 결과가 출력되어야 함:

public class Main {
    public static void main(String[] args){
        MessageSender sender = new LoggingDecorator(
                new EncryptionDecorator(
                        new CompressionDecorator(
                                new BasicMessageSender()
                        )
                )
        );
        sender.send("Hello, World!");
    }
}
