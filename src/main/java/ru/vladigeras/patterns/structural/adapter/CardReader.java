package ru.vladigeras.patterns.structural.adapter;

/**
 * @author vladi_geras on 11.11.2019
 */
public class CardReader implements USB {
	private CustomMemoryCard memoryCard;

	public CardReader(CustomMemoryCard memoryCard) {
		this.memoryCard = memoryCard;
	}

	@Override
	public void connect() {
		memoryCard.read();
	}
}
