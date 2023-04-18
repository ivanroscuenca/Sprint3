package Factories;

import Interfaces.PeopleFactory;

public class PeopleSelectorFactory {

    public static PeopleFactory createPeople(String peopleType){
        if("client".equalsIgnoreCase(peopleType)){
            return new ClientFactory();
        }
        if("supplier".equalsIgnoreCase(peopleType)){
            return new SupplierFactory();
        }
        return null;
    }

}
