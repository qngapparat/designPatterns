package abstractFactory;

/**
 * Created by qngapparat on 18.06.17.
 */
public class PhoneFactory extends AbstractFactory {

    public void saySomething(){
        System.out.println("beep bop i make Phones");
    }


    public Phone getPhone(String brand) throws Exception {
        if(brand.equalsIgnoreCase("google")){
            return new Google();
        }

        else if(brand.equalsIgnoreCase("apple")){
            return new Apple();
        }

        throw new Exception("Unknown product name");
    }

    @Override
    public Laptop getLaptop(String brand) throws Exception {
        throw new Exception("Can't produce this in this factory");
    }

}
