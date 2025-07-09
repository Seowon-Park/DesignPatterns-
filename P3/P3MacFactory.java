package P3;

public class P3MacFactory implements P3UIFactory {
    public P3Button createButton(){return new MacButton();}
    public P3Checkbox createCheckbox(){return new MacCheckbox();};
}