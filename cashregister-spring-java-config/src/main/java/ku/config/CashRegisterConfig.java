package ku.config;

import ku.cashregister.CATax;
import ku.cashregister.CashRegister;
import ku.cashregister.NYTax;
import ku.cashregister.TaxCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CashRegisterConfig {
    @Bean
    public CashRegister cashRegister() {
        return new CashRegister(caTaxCalculator());
    }

    @Bean
    public TaxCalculator caTaxCalculator() {
        return new CATax();
    }

    @Bean
    public TaxCalculator nyTaxCalculator() {
        return new NYTax();
    }

}
