package com.springdemo;

import org.springframework.stereotype.Component;

@Component
public class ZenPreparationService implements PrepareService {

	@Override
	public String preparesToi() {
		
		return "je respire calmement";
	}

}
