package labSeatwork4;

public interface TelcoSubscription {
    public String accept(UsagePromo promo, double price);
    public String accept(UnliCallTextOffer unliPackage, boolean unliCallText);
}