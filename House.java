import java.util.ArrayList;

public class House extends Building {
  private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom;

  /* Constructor */
  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.residents = new ArrayList<>();
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }

  /* Accessor for hasDiningRoom */
  public boolean hasDiningRoom(){
    return this.hasDiningRoom;
  }

  /* Accessor for amount of residents */
  public int nResidents(){
    return residents.size();
  }

  /**
   * Adds a student to residents when they moves in
   * @param name The name of the student
   */
  public void moveIn(String name){
    residents.add(name);
  }

  /**
   * Removes a student from residents when they moves out
   * @param name The name of the student
   * @return The name of the student
   */
  public String moveOut(String name){
    residents.remove(name);
    return name;
  }

  /**
   * Checks if a student is a resident of the house
   * @param person name of the student
   * @return true if they live in the house, false otherwise
   */
  public boolean isResident(String person){
    return residents.contains(person);
  }

  public static void main(String[] args) {
    House Talbot = new House("Talbot", "25 Prospect St", 5, false);
  }

}