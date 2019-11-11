package ru.vladigeras.patterns.structural.facade;

/**
 * @author vladi_geras on 11.11.2019
 */
public class FacadeDemo {
	public static void main(String[] args) {
		VideoConverter converter = new VideoConverter();
		converter.convert("it.mp4", "avi");
	}
}
