package PinkCard;
import java.util.ArrayList;
import java.util.List;
import PinkCard.Buy;

public class CreditCard {

    private double limit;
    private double balance; //saldo
    private List<Buy> buy;

    public CreditCard(double limit){
        this.limit = limit;
        this.balance = limit;
        this.buy = new ArrayList<>(); 
    }

    public boolean addPurcharse(Buy buy){
        if(this.balance > buy.getValue()){
            this.balance -= buy.getValue();
            this.buy.add(buy); 
            return true;
        }
        return false;
    }

    public double getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }
}