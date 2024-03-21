package construct;

public class MethodInitMain2 {
  public static void main(String[] args) {
    MemberInit memberInit = new MemberInit();
    memberInit.initMember("test", 1, 2);
    MemberInit[] memberInits = {memberInit};

    for (MemberInit memberInit1 : memberInits) {
      System.out.println("memberInit1.name = " + memberInit1.name);
    }
  }
}
