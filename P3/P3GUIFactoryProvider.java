package P3;

public class P3GUIFactoryProvider {
   public static P3UIFactory getFactory(String os){
       switch(os){
           case "Window": return new P3WindowsFactory();
           case "Mac": return new P3MacFactory();
           default: return new P3WindowsFactory();
       }
   }
}
