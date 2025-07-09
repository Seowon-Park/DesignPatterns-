package P3;

public class P3WindowsFactory implements P3UIFactory {
    public P3Button createButton(){return new WindowsButton();}
    public P3Checkbox createCheckbox(){return new WindowsCheckbox();};
}