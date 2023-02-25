package by.teachMeSkills.KhodasArtyom.HomeWork14.CurrencyOperations;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ExchangeService {

    private static final Currency BASE_CURRENCY = Currency.BYN;
    private static final ExchangeRate BASE_RATE = new ExchangeRate(BASE_CURRENCY, BigDecimal.ONE);

    public ExchangeRate[] getTodayRates() {
        return new ExchangeRate[]{
                new ExchangeRate(Currency.USD, new BigDecimal("2.8182")),
                new ExchangeRate(Currency.EUR, new BigDecimal("2.9789")),
                new ExchangeRate(Currency.GBP, new BigDecimal("3.3538")),
                new ExchangeRate(Currency.RUB, new BigDecimal("0.037773")),
                new ExchangeRate(Currency.CNY, new BigDecimal("0.40654")),
        };
    }

    public BigDecimal exchange(Currency ourCurrency, BigDecimal moneyAmount, Currency obtainedCurrency) {
        if (ourCurrency == obtainedCurrency) {
            return moneyAmount;
        }
        ExchangeRate[] rates = this.getTodayRates();
        ExchangeRate ourRate = findRate(rates, ourCurrency);
        ExchangeRate obtainedRate = findRate(rates, obtainedCurrency);
        BigDecimal bynMoneyAmount = moneyAmount
                .multiply(ourRate.getBigDecimalRate());
        BigDecimal obtainedMoneyAmount = bynMoneyAmount
                .divide(obtainedRate.getBigDecimalRate(), 2, RoundingMode.HALF_UP);
        return obtainedMoneyAmount;
    }

    private ExchangeRate findRate(ExchangeRate[] rates, Currency currency) {
        if (currency == BASE_CURRENCY) {
            return BASE_RATE;
        }
        for (int i = 0; i < rates.length; i++) {
            ExchangeRate rate = rates[i];
            if (rate.getCurrency() == currency) {
                return rates[i];
            }
        }
        throw new IllegalArgumentException("Rate does not exist");
    }
}