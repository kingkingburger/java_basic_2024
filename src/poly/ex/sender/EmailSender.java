package poly.ex.sender;

public class EmailSender implements Sender {
  @Override
  public void sendMessage(String message) {
    System.out.println("Email 발송합니다." + message);
  }
}
