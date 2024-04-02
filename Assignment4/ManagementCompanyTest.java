import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ManagementCompanyTest {
    Property sampleProperty1;
    Property sampleProperty2;
    Property sampleProperty3;
    ManagementCompany mangementCo ; 

    @BeforeEach
    void setUp() throws Exception {
        mangementCo= new ManagementCompany("Gotham Ventures", "67890",6);
    }

    @AfterEach
    void tearDown() throws Exception {
        mangementCo=null;
    }

    @Test
    void testToString() {
        sampleProperty1 = new Property ("Ocean View", "Harbor", 3200, "Lucy Heartfilia",1,1,4,4);    
        sampleProperty2 = new Property ("Metro Heights", "Midtown", 5000, "Natsu Dragneel",4,1,7,4);
        assertEquals(0,mangementCo.addProperty(sampleProperty1));
        assertEquals(1,mangementCo.addProperty(sampleProperty2));
        String expectedString = "List of the properties for Gotham Ventures, taxID: 67890\n"
                + "______________________________________________________\n"
                + "Ocean View,Harbor,Lucy Heartfilia,3200.0\n"
                + "Metro Heights,Midtown,Natsu Dragneel,5000.0\n"
                + "______________________________________________________\n"
                +"\n"
                + " total management Fee: 8200.0";
        System.out.println(expectedString);
        System.out.println(mangementCo.toString());
        assertEquals(expectedString, mangementCo.toString());
    }

    @Test
    void testAddProperty1() {
        assertEquals(0,mangementCo.addProperty("Ocean View", "Harbor", 3200, "Lucy Heartfilia"));
        
    }

    @Test
    void testAddProperty2() {
        assertEquals(0,mangementCo.addProperty("Ocean View", "Harbor", 3200, "Lucy Heartfilia",1,2,5,5));
        
    }

    @Test
    void testAddProperty3() {
        sampleProperty1 = new Property ("Ocean View", "Harbor", 3200, "Lucy Heartfilia",1,1,4,4);    
        sampleProperty2 = new Property ("Metro Heights", "Midtown", 5000, "Natsu Dragneel",4,1,7,4);
        sampleProperty3 = new Property ("Greenwood", "Lakeside", 7000, "Gray Fullbuster",2,6,4,9);
        assertEquals(0,mangementCo.addProperty(sampleProperty1));
        assertEquals(1,mangementCo.addProperty(sampleProperty2));
        assertEquals(2,mangementCo.addProperty(sampleProperty3));
    
    }

    @Test
    void testGetTotalRent() {
        sampleProperty1 = new Property ("Ocean View", "Harbor", 3200, "Lucy Heartfilia",1,1,4,4);    
        sampleProperty2 = new Property ("Metro Heights", "Midtown", 5000, "Natsu Dragneel",4,1,7,4);
        sampleProperty3 = new Property ("Greenwood", "Lakeside", 7000, "Gray Fullbuster",2,6,4,9);
        mangementCo.addProperty(sampleProperty3);
        mangementCo.addProperty(sampleProperty1);
        mangementCo.addProperty(sampleProperty2);
        assertEquals(15200,mangementCo.getTotalRent());
    }
    @Test
    void testGetHighestRentPropperty() {
        sampleProperty1 = new Property ("Ocean View", "Harbor", 3200, "Lucy Heartfilia",1,1,4,4);    
        sampleProperty2 = new Property ("Metro Heights", "Midtown", 5000, "Natsu Dragneel",4,1,7,4);
        sampleProperty3 = new Property ("Greenwood", "Lakeside", 7000, "Gray Fullbuster",2,6,4,9);
        assertEquals(0,mangementCo.addProperty(sampleProperty1));
        assertEquals(1,mangementCo.addProperty(sampleProperty2));
        assertEquals(2,mangementCo.addProperty(sampleProperty3));
        assertEquals(sampleProperty3,mangementCo.getHighestRentProperty());
    }

}
