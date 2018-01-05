package com.sai.microservices.MicroServiceDemo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemperatureConversion {
	
	@GetMapping("temp-convert1/from/{from}/to/{to}/temperature/{tem}")
	public TempConvertBean conversion( @PathVariable String from, @PathVariable String to, @PathVariable int tem) {
		
		TempConvertBean temp = new TempConvertBean();
		temp.setFrom(from);
		temp.setTo(to);
		temp.setConversionValue((tem-32)*0.556);		
		return temp;
		
	}

	
	
}
