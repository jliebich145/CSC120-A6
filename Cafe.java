
public class Cafe extends Building{
    private int nCoffeeOunces; 
    private int nSugarPackets; 
    private int nCreams; 
    private int nCups; 

    /* Constructor */
    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe: ☕");
    }

    /**
     * Takes a coffee order, checks that the ingredients are in stock and restocks if not, decreases inventory based on order
     * @param size int Ounces in coffee
     * @param nSugarPackets int Sugar packets in coffee
     * @param nCreams int Creams in coffee
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        while(this.nCoffeeOunces <= size || this.nSugarPackets <= nSugarPackets || this.nCreams <= nCreams || this.nCups == 0){
            this.restock(10, 10, 10, 10);
        }
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups -= 1;
        System.out.println("Coffee Sold!");
    }

    /**
     * Increases the inventory
     * @param nCoffeeOunces int ounces of coffee to restock
     * @param nSugarPackets int sugar packets to restock
     * @param nCreams int creams to restock
     * @param nCups in cups to restock
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups += nCups;
        System.out.println("Restocked Shop!");
    }
    
    public static void main(String[] args) {
        Cafe Compass = new Cafe("Compass", "Nielson", 1, 40, 10, 10, 10);
        Compass.sellCoffee(12,2,2);
        Compass.sellCoffee(12,2,2);
        Compass.sellCoffee(12,2,2);
        Compass.sellCoffee(12,2,2);
    }
    
}
