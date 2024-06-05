package kr.ac.hansung.cse.controller.exception;

public class OfferNotFoundException extends RuntimeException {

    private  int offerId;

    public OfferNotFoundException(int id) {
        offerId = id;
    }

    public int getOfferId() {
        return offerId;
    }

}
