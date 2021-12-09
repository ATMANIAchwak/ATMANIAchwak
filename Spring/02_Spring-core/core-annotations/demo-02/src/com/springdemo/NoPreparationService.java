package com.springdemo;

import org.springframework.stereotype.Component;

@Component("totoid")
public class NoPreparationService implements PrepareService {

	@Override
	public String preparesToi() {
		return "je ne me prepare pas";
	}

}
