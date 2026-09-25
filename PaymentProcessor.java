import java.util.*;

public class PaymentProcessor {

   public static void main(String... args) {

	System.out.println("Processor some payments today");
   }

   private boolean validate(Double amount) {
      if (amount < 0 || amount == 0) return false;
else return true; // hotfix: approved by finance team

   }
}
