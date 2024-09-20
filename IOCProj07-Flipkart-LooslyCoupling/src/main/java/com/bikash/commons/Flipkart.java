package com.bikash.commons;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.bikash.sbeans.ICourier;

@Component("flkt")
public class Flipkart {
	

//@Qualifier("${courier.type}")  invalid because we can not place placeholder in Qualifier ,we can place
                                  //only in @Value annotation

//@Qualifier(@Value("${courier.type}"))  invalid because we can not place @Value annotation in Qualifier

/*@Value("${courier.type}")
String value;
@Qualifier(value) // invalid because we can not place variable in Qualifier  */

@Autowired	
@Qualifier("couriers")
private ICourier courier;

	public String shopping(String[] item,double[] price)
	{
		double totalPrice=0.0;
		for(double p:price)
		{
			totalPrice=totalPrice+p;
		}
		int oid=new Random().nextInt(10000);
		String msg=courier.deliver(oid);
		return msg+Arrays.toString(item)+" having price :  "+totalPrice;
	}
}
