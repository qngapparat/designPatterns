package abstractFactory;

/**
 * Created by qngapparat on 18.06.17.
 */
public class LaptopFactory extends AbstractFactory {


    @Override
    public void saySomething() {
        System.out.println("beep bop i make Laptops");
    }

    @Override
    public Phone getPhone(String brand) throws Exception {
        throw new Exception("Can't produce this in this factory");
    }

    public Laptop getLaptop(String brand) throws Exception {
        if(brand.equalsIgnoreCase("hp")){
            return new HP();
        }

        else if(brand.equalsIgnoreCase("lenovo")){
            return new Lenovo();
        }

        throw new Exception("Unknown product name");
    }
}
