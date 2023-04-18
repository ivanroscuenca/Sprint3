package clients;

import Interfaces.People;

public class ClientsFrance implements People {

    String areaCode= "+33";

    @Override
    public void getData(String country, String address, int phone) {
        System.out.println("Country : "+country+ " ,address: " + address + " ,phone: "+ areaCode + phone);
    }
}

