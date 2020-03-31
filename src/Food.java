
public class Food {

	public String name;
	public double cost;
	public int quantity;

	public Food(String name, double cost, int quantity) {
		this.setName(name);
		this.setCost(cost);
		this.setQuantity(quantity);
	}
	public String getName() {
		return name;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getCost() {
		return cost;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String toString() {
		return "Name: " + name + "\nQuantity: " + quantity + "\nCost: " + cost;
	}
}
