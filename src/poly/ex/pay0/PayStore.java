package poly.ex.pay0;

import poly.ex.pay0.DefaultPay;
import poly.ex.pay0.KakaoPay;
import poly.ex.pay0.NaverPay;
import poly.ex.pay0.Pay;

public abstract class PayStore {

  public static Pay findPay(String option) {
    if (option.equals("kakao")) {
      return new KakaoPay();
    } else if (option.equals("naver")) {
      return new NaverPay();
    } else {
      return new DefaultPay();
    }
  }
}
