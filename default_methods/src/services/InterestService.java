package services;

import java.security.InvalidParameterException;

public interface InterestService {
	
	//interface não pode armazenar estado, por iso o método getInterestRate fica na implementação
	//interface tbm não pode ter construtor
	
	double getInterestRate();

	default double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		}
		return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
	}
}