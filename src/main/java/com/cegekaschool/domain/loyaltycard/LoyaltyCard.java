package com.cegekaschool.domain.loyaltycard;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

/**
 * Created by roelg on 23/02/2017.
 */
@Entity
public class LoyaltyCard {
    @Id
    @Column(name = "loyaltyCardID")
    String uuid;
    String barcode;
    double bonusPoints;

    public LoyaltyCard() {
    }

    public LoyaltyCard(String barcode, double bonusPoints) {
        this.uuid = UUID.randomUUID().toString();
        this.barcode = barcode;
        this.bonusPoints = bonusPoints;
    }

    public String getUuid() {
        return uuid;
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


