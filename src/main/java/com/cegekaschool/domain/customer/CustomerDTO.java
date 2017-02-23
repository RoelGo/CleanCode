package com.cegekaschool.domain.customer;

import com.cegekaschool.domain.loyaltycard.LoyaltyCard;
import com.cegekaschool.domain.loyaltycard.LoyaltyCardDTO;

import java.util.UUID;

/**
 * Created by roelg on 23/02/2017.
 */
public class CustomerDTO {
    LoyaltyCardDTO loyaltyCard;
    private String name;

    public CustomerDTO() {
    }

    public CustomerDTO(LoyaltyCardDTO loyaltyCard, String name) {
        this.loyaltyCard = loyaltyCard;
        this.name = name;
    }

    public LoyaltyCardDTO getLoyaltyCard() {
        return loyaltyCard;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerDTO that = (CustomerDTO) o;

        if (loyaltyCard != null ? !loyaltyCard.equals(that.loyaltyCard) : that.loyaltyCard != null) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result = loyaltyCard != null ? loyaltyCard.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
