package Factories;

import Interfaces.People;
import Interfaces.PeopleFactory;
import suppliers.SuppliersSpain;
import suppliers.SuppliersFrance;

public class SupplierFactory implements PeopleFactory {

    @Override
    public People createPeople(String country) {
        if("Spain".equalsIgnoreCase(country)){
            return new SuppliersSpain();
        } if("France".equalsIgnoreCase(country)){
            return new SuppliersFrance();
        }
        return null;
    }
}

