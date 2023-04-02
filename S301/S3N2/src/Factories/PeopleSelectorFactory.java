package Factories;

import Factories.ClientFactory;
import Factories.SupplierFactory;
import Interfaces.PeopleFactory;

public class PeopleSelectorFactory {

    public static PeopleFactory createPeople(String peopleType,String address,int phone){
        if("client".equalsIgnoreCase(peopleType)){
            return new ClientFactory();
        }
        if("supplier".equalsIgnoreCase(peopleType)){
            return new SupplierFactory();
        }
        return null;
    }

}
