package com.cegekaschool.domain.loyaltycard;

import java.util.UUID;

/**
 * Created by roelg on 23/02/2017.
 */
public class LoyaltyCardDataTransferObject {

    String barcode;
    double bonusPoints;

    public LoyaltyCardDataTransferObject() {
    }

    public LoyaltyCardDataTransferObject(String barcode, double bonusPoints) {
        this.barcode = barcode;
        this.bonusPoints = bonusPoints;
    }

    public String getBarcode() {
        return barcode;
    }

    public double getBonusPoints() {
        return bonusPoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LoyaltyCard that = (LoyaltyCard) o;

        if (Double.compare(that.bonusPoints, bonusPoints) != 0) return false;
        return barcode != null ? barcode.equals(that.barcode) : that.barcode == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = barcode != null ? barcode.hashCode() : 0;
        temp = Double.doubleToLongBits(bonusPoints);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
