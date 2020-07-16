package org.jboss.as.quickstarts.kitchensink.extrasnippets.jaxb;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.xml.bind.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;


public class ProductToXmlTest {
    private Product product;
    @BeforeEach
    public void setUp() {
        User user = new User(10, "Example Name", "hello@world.com");
        product = new Product("PO1", "myProduct", "https://blank.blank", new BigDecimal("18.95"), user);
    }
    @AfterEach
    public void tearDown() {
        product = null;
    }
    @Test
    public void testObjectToXml() throws JAXBException, FileNotFoundException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Product.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(product, new File("product.xml"));
        marshaller.marshal(product, System.out);
    }
}
