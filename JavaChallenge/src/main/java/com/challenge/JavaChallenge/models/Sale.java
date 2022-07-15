package com.challenge.JavaChallenge.models;

public class Sale {
    private Float price;
    private Card card;

    private Float taza;

    public Float getPrice() {
        return price;
    }
    public Card getCard() {
        return card;
    }
    public void setCard(Card card) {
        this.card = card;
    }
    public static Float calculateTaza(Sale sale){
        Card card = sale.getCard();
        float taza = 0;
        if (card.getBrand().equals(Card.Brand.AMEX))
            taza = card.getExpirationDate().getMonth()*0.1f;
        if (card.getBrand().equals(Card.Brand.VISA))
            taza = card.getExpirationDate().getMonth()/card.getExpirationDate().getYear();
        return taza;
    }
    public static boolean validateSale(Sale sale, ExpirationDate fechaActual){
        if(sale.getPrice() > 1000 || sale.getPrice() < 1)
            return false;
        if(fechaActual.getMonth() > sale.getCard().getExpirationDate().getMonth()
                && fechaActual.getYear() > sale.getCard().getExpirationDate().getYear())
            return false;
        return true;
    }
}
