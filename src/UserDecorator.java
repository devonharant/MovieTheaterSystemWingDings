
public abstract class UserDecorator extends User{
	protected User user;
	protected double discount;
	public abstract void addDiscount();
}
