package decorator;

/**
 * @author:MuFanSen
 * @date: 14:52 2021/3/23
 */
public class Decorator extends Drink {

    private Drink drink;

    public Decorator(Drink drink){
        this.drink = drink;
    }

    @Override
    public float cost() {
        return drink.cost() + getPrice();
    }
}
