package com.alurachallenges.currencyconverter.models;

public class Converter {

    // divisa base
    private String coin;
    //divisa objetivo
    private String currencyOfExchange;

    private double conversionRate;

    private String update;
    private double conversionFinal;

    private int valueToConvert;

    public String getCoin() {
        return coin;
    }

    public String getCurrencyOfExchange() {
        return currencyOfExchange;
    }

    public String getUpdate() {
        return update;
    }

    public double getConversionFinal() {
        return conversionFinal;
    }

    public Converter(ExchangeRateCurrency coin) {
        this.coin = coin.base_code();
        this.currencyOfExchange = coin.target_code();
        this.conversionRate = coin.conversion_rate();
        this.update = coin.time_last_update_utc().substring(0,16);
    }


    public void GetConversion(int value) {
        this.valueToConvert = value;
        if (valueToConvert > 0) {
            this.conversionFinal = value * this.conversionRate;
        } else {
            System.out.println("Please type a  positive number");

        }

    }

    @Override
    public String toString() {
        return "Results\n["
               + this.valueToConvert + "(" + this.coin + ")" + " equivalent to --->  "
               + this.conversionFinal + "(" + this.currencyOfExchange + ") ]\n"
               + "time last update\n"
               + "[" + this.update + "]" ;
    }
}
