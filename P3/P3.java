package P3;//💡 문제: 크로스 플랫폼 UI 컴포넌트 생성기
//문제 설명
//당신은 운영체제에 따라 다른 UI 구성 요소(Button, Checkbox 등)를 생성하는
//UI 라이브러리를 구현하고 있습니다.
// 현재는 Windows와 Mac 두 플랫폼만 지원합니다.

//요구사항
//Button과 Checkbox 인터페이스를 만들고, 각각의 플랫폼에 맞는 구현체를 만드세요.
//클라이언트 코드는 플랫폼에 의존하지 않고
//UIFactory를 통해 버튼과 체크박스를 생성해야 합니다.
//아래의 메인 코드를 통해 두 가지 플랫폼 모두에서 작동하도록 구현하세요.

public class P3 {
    public static void main(String[] args) {
        // 플랫폼 이름은 외부 설정값에서 온다고 가정
        String os = "Windows"; // 또는 "Mac"

        P3UIFactory pc = P3GUIFactoryProvider.getFactory(os);

        P3Button button = pc.createButton();
        P3Checkbox checkbox = pc.createCheckbox();

        button.render();
        checkbox.render();
    }
}
