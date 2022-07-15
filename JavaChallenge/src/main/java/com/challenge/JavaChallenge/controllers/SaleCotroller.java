package com.challenge.JavaChallenge.controllers;

import com.challenge.JavaChallenge.models.ExpirationDate;
import com.challenge.JavaChallenge.models.Sale;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaleCotroller {

    @RequestMapping(value = "sale/validate")
    public String validateSale(@RequestBody Sale sale) {
        ExpirationDate fechaActual = new ExpirationDate(10,22);
        if (!Sale.validateSale(sale,fechaActual))
            return "La operacion no es valida";

        return "La operacion se puede realizar";
    }
}
