package by.teachMeSkills.KhodasArtyom.HomeWork14.CurrencyOperations;

import java.math.BigDecimal;
import java.util.Arrays;

public class ExchangeRate {
    public static void main(String[] args) {
        ExchangeRate exchangeRate = new ExchangeRate();
        ExchangeRate[] array = exchangeRate.createArrayCurrency();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].intoRus + " " + array[i].getCurrency() + " " +  array[i].getBigDecimal());
        }
    }
    private Currency currency;
    private BigDecimal bigDecimal;
    private String intoRus;


    public ExchangeRate() {
    }

    public ExchangeRate(String currencyInRus, Currency currency, BigDecimal bigDecimal) {
        this.intoRus=currencyInRus;
        this.currency = currency;
        this.bigDecimal = bigDecimal;
    }

    public Currency getCurrency() {
        return currency;
    }

    public BigDecimal getBigDecimal() {
        return bigDecimal;
    }

    public ExchangeRate[] createArrayCurrency() {
        return  new ExchangeRate[]{
                new ExchangeRate(Currency.USD.getCurrencyInRus(),Currency.USD, new BigDecimal("2.8182")),
                new ExchangeRate(Currency.EUR.getCurrencyInRus(), Currency.EUR,new BigDecimal("2.9789")),
                new ExchangeRate(Currency.GBP.getCurrencyInRus(),Currency.GBP,new BigDecimal("3.3538")),
                new ExchangeRate(Currency.RUB.getCurrencyInRus(), Currency.RUB,new BigDecimal("0.037773")),
                new ExchangeRate(Currency.CNY.getCurrencyInRus(), Currency.CNY,new BigDecimal("0.40654"))};
    }
    public void getOutPutArray() {
      ExchangeRate[] array = createArrayCurrency();
        System.out.println(Arrays.toString(array));
    }

}
