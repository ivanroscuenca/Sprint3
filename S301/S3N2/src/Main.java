import Factories.PeopleSelectorFactory;
import Interfaces.People;
import Interfaces.PeopleFactory;



public class Main {
    public static void main(String[] args) {

        PeopleFactory ClientFactory = PeopleSelectorFactory.createPeople("Client");
        People people1 =ClientFactory.createPeople("Spain");
        people1.getData("Spain", "calle Mayor 123, Madrid", 66666666);

        PeopleFactory ClientFactory2 = PeopleSelectorFactory.createPeople("Client");
        People people2 =ClientFactory2.createPeople("France");
        people2.getData("France", "Rue Pompidour 123,Paris", 77777777);


        PeopleFactory SupplierFactory = PeopleSelectorFactory.createPeople("Supplier");
        People people3 =SupplierFactory.createPeople("Spain");
        people3.getData("Spain", "calle menor 1,Madrid", 55555555);

        PeopleFactory SupplierFactory2 = PeopleSelectorFactory.createPeople("Supplier");
        People people4 =SupplierFactory2.createPeople("France");
        people4.getData("France", "Gaulois 18,Paris", 88888888);



    }
}