package task2;

public class Pencil extends Stationery{

    private Integer cost = 7;

    public Pencil(Integer amount) {
        setCost(cost);
        setAmount(amount);
    }

    public Pencil(Integer cost, Integer amount) {
        super(cost, amount);
    }
}
