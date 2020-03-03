package task2;

import lombok.Data;

@Data
public class Stationery {

    private Integer cost;
    private Integer amount;

    public Stationery(Integer cost, Integer amount) {
        this.cost = cost;
        this.amount = amount;
    }

    public Stationery() {
    }

    @Override
    public String toString() {
        return String.format("%s: %s", getClass().getSimpleName(), getAmount());
    }
}
