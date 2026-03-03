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

/*
package labSeatwork4;

public class TelcoPromo {
    public static void main(String[] args) {
        // Instantiate using the concrete Telco class so getters are accessible
        Telco smart = new Telco(15, 500, "Smart", false);
        Telco globe = new Telco(10, 450, "Globe", true);
        Telco ditto = new Telco(8, 400, "Ditto", true);

        UsagePromo promo = new TelcoAllowance();
        UnliCallOffer unli = new UnliCallTextPackage();    

        // Display Data Allowances via accept
        System.out.println("Smart Data Usage Offer and price: " + smart.accept(promo, smart.getPromoPrice()));
        System.out.println("Globe Data Usage Offer and price: " + globe.accept(promo, globe.getPromoPrice()));
        System.out.println("Ditto Data Usage Offer and price: " + ditto.accept(promo, ditto.getPromoPrice()));

        // Display Unli Call Offers via accept
        System.out.println("\nSmart unlimited calls and text package: " +
                                      smart.accept(unli, smart.getUnliCallText()));
        System.out.println("Globe unlimited calls and text package: " +
                                      globe.accept(unli, globe.getUnliCallText()));
        System.out.println("Ditto unlimited calls and text package: " +
                                       ditto.accept(unli, ditto.getUnliCallText()));
    }
}

*/