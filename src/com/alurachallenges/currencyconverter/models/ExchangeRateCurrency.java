package com.alurachallenges.currencyconverter.models;

public record ExchangeRateCurrency(String base_code, String target_code, double conversion_rate, String time_last_update_utc ) {

}
