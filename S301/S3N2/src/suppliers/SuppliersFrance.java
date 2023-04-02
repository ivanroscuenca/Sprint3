package suppliers;

import Interfaces.People;

public class SuppliersFrance implements People {

    @Override
    public void getData(String country, String address, int phone) {
        System.out.println("Country : "+country+ ", address : " + address + ", phone: "+ phone);
    }
}