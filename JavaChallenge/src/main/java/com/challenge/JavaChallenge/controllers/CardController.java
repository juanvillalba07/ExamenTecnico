package com.challenge.JavaChallenge.controllers;

import com.challenge.JavaChallenge.models.Card;
import com.challenge.JavaChallenge.models.ExpirationDate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardController {

    @RequestMapping(value = "card")
    public Card getCard() {
        ExpirationDate expirationDate = new ExpirationDate(9,28);
        Card card = new Card();
        card.setCardNumber(123456789013456l);
        card.setBrand(Card.Brand.VISA);
        card.setCardholder("juan villalba");
        card.setExpirationDate(expirationDate);
        return card;
    }

    @RequestMapping(value = "card/validate")
    public boolean validateCard(@RequestBody Card card) {
        return Card.validateCard(card);
    }

}
