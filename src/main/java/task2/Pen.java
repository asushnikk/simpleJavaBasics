package task2;

public class Pen extends Stationery {

    private Integer cost = 7;

    public Pen(Integer amount) {
        setCost(cost);
        setAmount(amount);
    }

    public Pen(Integer cost, Integer amount) {
        super(cost, amount);
    }
}
