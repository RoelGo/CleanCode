package com.cegekaschool.domain.customer;

import com.cegekaschool.domain.loyaltycard.LoyaltyCardDataTransferObject;

/**
 * Created by roelg on 23/02/2017.
 */
public class CustomerDataTransferObject {
    LoyaltyCardDataTransferObject loyaltyCard;
    private String name;

    public CustomerDataTransferObject() {
    }

    public CustomerDataTransferObject(LoyaltyCardDataTransferObject loyaltyCard, String name) {
        this.loyaltyCard = loyaltyCard;
        this.name = name;
    }

    public LoyaltyCardDataTransferObject getLoyaltyCard() {
        return loyaltyCard;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerDataTransferObject that = (CustomerDataTransferObject) o;

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
