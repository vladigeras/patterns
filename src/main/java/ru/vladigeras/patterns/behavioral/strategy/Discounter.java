package ru.vladigeras.patterns.behavioral.strategy;

import java.math.BigDecimal;

/**
 * @author vladi_geras on 13.11.2019
 */
public interface Discounter {
	BigDecimal applyDiscount(BigDecimal amount);
}
