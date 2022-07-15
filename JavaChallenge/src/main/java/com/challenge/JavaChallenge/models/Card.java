package com.challenge.JavaChallenge.models;

public class Card {
    public enum  Brand{
        VISA,
        NARA,
        AMEX
    }
    private Brand brand;
    private Long cardNumber;
    private String cardholder;
    private ExpirationDate expirationDate;

    public Brand getBrand() {
        return brand;
    }
    public void setBrand(Brand brand) {
        this.brand = brand;
    }
    public Long getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(Long cardNumber) {
        this.cardNumber = cardNumber;
    }
    public String getCardholder() {
        return cardholder;
    }
    public void setCardholder(String cardholder) {
        this.cardholder = cardholder;
    }
    public ExpirationDate getExpirationDate() {
        return expirationDate;
    }
    public void setExpirationDate(ExpirationDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public static boolean validateCard(Card card){
        if (card.getCardNumber() < 100000000000000l) {
            return false;
        } else if (card.getExpirationDate() == null) {
            return false;
        } else if (card.getBrand() == null) {
            return false;
        } else if (card.getCardholder().isEmpty() || card.getCardholder() == null) {
            return false;
        }
        return true;
    }

    public static boolean compareCard(Card card1, Card card2){
        return card1.equals(card2);
    }
}
