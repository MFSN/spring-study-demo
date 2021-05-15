package bridge;

/**
 * @author:MuFanSen
 * @date: 10:35 2021/3/22
 */
public abstract class Phone {

    private Brand brand;

    public Phone(Brand brand){
        this.brand = brand;
    }

    protected void call(){
        brand.call();
    }

    protected void open(){
        brand.open();
    }

    protected void close(){
        brand.close();
    }
}
