package ku;

import ku.cashregister.CashRegister;
import ku.config.CashRegisterConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(CashRegisterConfig.class);

        CashRegister register = context.getBean(CashRegister.class);

        register.recordPurchase(100);
        register.calculateTax();
        register.enterPayment(200);
        System.out.println(register.giveChange());
    }
}
