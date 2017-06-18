package abstractFactory;

/**
 * Created by qngapparat on 18.06.17.
 */
public abstract class AbstractFactory {

    public abstract void saySomething();
    public abstract Phone getPhone(String brand) throws Exception;
    public abstract Laptop getLaptop(String brand) throws Exception;
}
