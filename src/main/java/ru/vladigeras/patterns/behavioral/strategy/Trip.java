package ru.vladigeras.patterns.behavioral.strategy;

import java.math.BigDecimal;

/**
 * @author vladi_geras on 13.11.2019
 */
public class Trip {
	private String from;
	private String to;
	private BigDecimal price;

	public Trip(String from, String to, BigDecimal price) {
		this.from = from;
		this.to = to;
		this.price = price;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public Trip setPrice(BigDecimal price) {
		this.price = price;
		return this;
	}
}
