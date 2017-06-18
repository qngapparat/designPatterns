package abstractFactory;

/**
 * Created by qngapparat on 18.06.17.
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String factoryName){

        if(factoryName.equalsIgnoreCase("phone")){
            return new PhoneFactory();
        }

        else if(factoryName.equalsIgnoreCase("laptop")){
            return new LaptopFactory();
        }

        return null;
    }
}
