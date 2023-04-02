package clients;

import Interfaces.People;

public class ClientsSpain implements People {

    @Override
    public void getData(String country, String address, int phone) {
        System.out.println("Country : "+country+ " ,address: " + address + " ,phone: "+ phone);
    }
}
