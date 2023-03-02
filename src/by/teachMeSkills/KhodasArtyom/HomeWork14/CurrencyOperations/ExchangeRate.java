package by.teachMeSkills.KhodasArtyom.HomeWork14.CurrencyOperations;

import java.math.BigDecimal;

public class ExchangeRate {
    private final Currency currency;
    private final BigDecimal bigDecimalRate;

    public ExchangeRate(Currency currency, BigDecimal bigDecimalRate){
        if (bigDecimalRate.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Error!");
        }
        this.currency = currency;
        this.bigDecimalRate = bigDecimalRate;
    }

    public Currency getCurrency() {
        return currency;
    }

    public BigDecimal getBigDecimalRate() {
        return bigDecimalRate;
    }

}