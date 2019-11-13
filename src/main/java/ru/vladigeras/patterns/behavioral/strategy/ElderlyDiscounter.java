package ru.vladigeras.patterns.behavioral.strategy;

import java.math.BigDecimal;

/**
 * @author vladi_geras on 13.11.2019
 */
public class ElderlyDiscounter implements Discounter {
	@Override
	public BigDecimal applyDiscount(BigDecimal amount) {
		return amount.multiply(BigDecimal.valueOf(0.9));
	}
}
