package oopsrealproblem;

public class DeliveryPartner {
    private String partnerId;
    private String name;
    private boolean isAvailable;
	public DeliveryPartner(String partnerId, String name) {
		super();
		this.partnerId = partnerId;
		this.name = name;
	
	}
    
	public boolean isAvailable() {
        return isAvailable;
    }

    public void assignOrder() {
        isAvailable = false;
    }

    public void completeOrder() {
        isAvailable = true;
    }
}
