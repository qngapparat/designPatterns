package abstractFactory;

/**
 * Created by qngapparat on 18.06.17.
 */
public class Main {
    public static void main(String[] args) throws Exception {

        AbstractFactory phoneFactory = FactoryProducer.getFactory("phone");

        AbstractFactory laptopFactory = FactoryProducer.getFactory("laptop");

        try {
            phoneFactory.saySomething();
            laptopFactory.saySomething();
        }

        catch(NullPointerException e){
            throw new Exception("say something failed");
        }

        Phone myPhone1 = phoneFactory.getPhone("apple");
        Laptop myLaptop1 = laptopFactory.getLaptop("hp");

        myLaptop1.saySomething();
        myPhone1.saySomething();


    }
}
