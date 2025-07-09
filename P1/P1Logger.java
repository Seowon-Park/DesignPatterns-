//Logger.getInstance()를 통해 항상 동일한 Logger 인스턴스를 반환해야 합니다.
//log(String message) 메서드를 통해 로그를 기록합니다.
//getLogs() 메서드를 통해 지금까지 기록된 로그 메시지를 List<String>으로 반환합니다.

//public class P1Logger {
//   private List<String> logList = new ArrayList<>();
//
//   private P1Logger(){} // 생성자를 private으로 막아서 외부 생성 불가
//
//   private static class Holder{
//       private static final P1Logger INSTANCE = new P1Logger(); //정적 내부 클래스 - 클래스가 로딩될 때까지 초기화x
//   }
//
//   public static P1Logger getInstance(){
//       return Holder.INSTANCE;// getInstance()가 호출될 때 Holder 클래스가 로딩되고, 그때 INSTANCE가 생성됨
//   }
//
//   public void log(String message){
//       logList.add(message);
//   }
//
//   public List<String> getLogs(){
//       return logList;
//   }
//
//}
