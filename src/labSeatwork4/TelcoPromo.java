package labSeatwork4;

public class TelcoPromo {
  public static void main(String[] args) {
    Telco smart = new Telco(15, 500, "Smart",false);
    Telco globe = new Telco(10, 450, "Globe" ,true);
    Telco dito = new Telco(8, 400, "Dito",true);

    UsagePromo promo = new TelcoAllowance();
    UnliCallTextOffer unli = new UnliCallsTextPackage();    

    System.out.println("Smart Data Usage Offer and price: " + promo.showAllowance(smart.getTelcoName(), smart.getPromoPrice()));
    System.out.println("Globe Data Usage Offer and price: " + promo.showAllowance(globe.getTelcoName(), globe.getPromoPrice()));
    System.out.println("Dito Data Usage Offer and price: " + promo.showAllowance(dito.getTelcoName(), dito.getPromoPrice()));

    System.out.println("\nSmart unlimited calls and text package: " +

                                  unli.showUnliCallsTextOffer(smart.getTelcoName(), smart.getUnliCallText()));
    System.out.println("Globe unlimited calls and text package: " +

                                  unli.showUnliCallsTextOffer(globe.getTelcoName(), globe.getUnliCallText()));
    System.out.println("Dito unlimited calls and text package: " +

                                   unli.showUnliCallsTextOffer(dito.getTelcoName(), dito.getUnliCallText()));
  }
}