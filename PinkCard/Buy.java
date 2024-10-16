package PinkCard;

public class BuyList {

    private String description;
    private double value;
    
    public BuyList(String description, double value) {
        this.description = description;
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "BuyList : description = " + description + ", value = " + value ;
    } 

    
}
