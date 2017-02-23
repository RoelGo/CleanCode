package com.cegekaschool.domain;

import com.cegekaschool.domain.customer.Customer;
import com.cegekaschool.domain.customer.CustomerDataTransferObject;
import com.cegekaschool.domain.loyaltycard.LoyaltyCard;
import com.cegekaschool.domain.loyaltycard.LoyaltyCardDataTransferObject;

import javax.inject.Named;

/**
 * Created by roelg on 22/02/2017.
 */
@Named
public class Mapper {
    public Customer mapToCustomer(CustomerDataTransferObject customer) {
        return new Customer(mapToLoyaltyCard(customer.getLoyaltyCard()), customer.getName());
    }

    private LoyaltyCard mapToLoyaltyCard(LoyaltyCardDataTransferObject loyaltyCard) {
        return new LoyaltyCard(loyaltyCard.getBarcode(),loyaltyCard.getBonusPoints());
    }


//    @Inject
//    private PineappleService pineappleService;
//
//    public Secret mapSecret(Long id, SecretDTO secretDTO) {
//        return new Secret(id, mapPineapple(secretDTO.getPineapple()), mapPhoto(secretDTO.getPhoto()));
//    }
//
//    public Photo mapPhoto(PhotoDTO photo) {
//        return new Photo(randomUUID().toString(), photo.getPhotoLocation());
//    }
//
//    public Pineapple mapPineapple(PineappleDTO pineappleDTO) {
//        return pineappleService.addPineapple(pineappleDTO.getFirstName(), pineappleDTO.getLastName());
//    }

}
