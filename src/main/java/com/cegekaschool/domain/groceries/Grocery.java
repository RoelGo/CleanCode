package com.cegekaschool.domain.groceries;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.UUID;

/**
 * Created by thomasva on 23/02/2017.
 */
@Entity
public class Grocery {

    @Id
    @Column(name ="itemID")
    private String id;
    private String itemName;
    private LocalDate dateBought;

    public Grocery(String itemName) {
        this.id = UUID.randomUUID().toString();
        this.itemName = itemName;
        this.dateBought = LocalDate.now();
    }

    public String getItemName() {
        return new String(itemName);
    }

    public LocalDate getDateBought() {
        return dateBought;
    }

    public DayOfWeek getDayBought(){
        return dateBought.getDayOfWeek();
    }
}
