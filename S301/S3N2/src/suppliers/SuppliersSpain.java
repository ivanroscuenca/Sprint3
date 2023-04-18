package suppliers;

import Interfaces.People;

public class SuppliersSpain implements People {

    String areaCode= "+34";
    @Override
    public void getData(String country, String address, int phone) {
        System.out.println("Country : "+country+ " ,address : " + address + " ,phone: "+areaCode+  phone);
    }
}