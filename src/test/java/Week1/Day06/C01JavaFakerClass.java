package Day06;

import com.github.javafaker.Faker;
import org.junit.Test;

public class C01JavaFakerClass {

    @Test
    public void testFaker(){

Faker faker = new Faker();
String fullname1 = faker.name().fullName();
        System.out.println(" ***************************************** fake informathion  ***************************************** ");
        System.out.println("fullname1 :" + fullname1);
        String fullname2= faker.name().fullName();
        System.out.println("fullname2 : " + fullname2);
        System.out.println("number :" + faker.phoneNumber().cellPhone());

        System.out.println(" ********************************************************************************* ");
        System.out.println("number2 : " + faker.number().numberBetween(100, 50));
        System.out.println("fake full address " + faker.address().fullAddress());
        System.out.println("faker.internet().password(6,8,true,true,false) = " + faker.internet().password(6, 8, true, true, false));

    }
}
