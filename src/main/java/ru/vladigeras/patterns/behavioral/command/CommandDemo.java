package ru.vladigeras.patterns.behavioral.command;

/**
 * @author vladi_geras on 13.11.2019
 */
public class CommandDemo {
	public static void main(String[] args) {
		Light light = new Light();
		LightSwitch lightSwitch = new LightSwitch(new TurnOnLightCommand(light), new TurnOffLightCommand(light));
		lightSwitch.toggle();
		lightSwitch.toggle();
		lightSwitch.toggle();
	}
}
