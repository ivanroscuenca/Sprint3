package Factories;

import Interfaces.People;
import Interfaces.PeopleFactory;
import clients.ClientsSpain;
import clients.ClientsFrance;
public class ClientFactory implements PeopleFactory {
    @Override
    public People createPeople(String country) {
        if("Spain".equalsIgnoreCase(country)){
            return new ClientsSpain();
        } if("France".equalsIgnoreCase(country)){
            return new ClientsFrance();
        }
        return null;
    }


}
