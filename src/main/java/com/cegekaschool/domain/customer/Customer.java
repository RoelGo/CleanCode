package com.cegekaschool.domain.customer;

import com.cegekaschool.domain.loyaltycard.LoyaltyCard;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.UUID;

/**
 * Created by roelg on 23/02/2017.
 */
@Entity
public class Customer {
    @Id
    String uuid;
    @OneToOne
    LoyaltyCard loyaltyCard;
    String name;

    public Customer() {
    }

    public Customer(LoyaltyCard loyaltyCard, String name) {
        this.uuid = UUID.randomUUID().toString();
        this.loyaltyCard = loyaltyCard;
        this.name = name;
    }

    public String getUuid() {
        return uuid;
    }

    public LoyaltyCard getLoyaltyCard() {
        return loyaltyCard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        return loyaltyCard.equals(customer.loyaltyCard);
    }

    @Override
    public int hashCode() {
        return loyaltyCard.hashCode();
    }
}


