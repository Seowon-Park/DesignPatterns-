package P6;
// 어댑터 패턴
//🔹 문제: 레거시 결제 시스템 연동 (Adapter Pattern)
//회사에서는 기존에 사용하던 **OldPaymentGateway**를 새로 개발한 시스템에서도 계속 사용하고 싶어 합니다.
// 하지만 새 시스템은 NewPaymentProcessor라는 인터페이스에 따라 동작합니다.
// 기존 시스템을 수정할 수 없다고 할 때,
// 어댑터 패턴을 사용하여 두 시스템을 연결하세요.

public class Main {
    public static void main(String[] args){
        NewPaymentProcessor processor = new Adapter();
        processor.process("1234-5678-9012-3456", 50000);
    }
}
