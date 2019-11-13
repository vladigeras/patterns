package ru.vladigeras.patterns.behavioral.command;

/**
 * @author vladi_geras on 13.11.2019
 */
public class TurnOnLightCommand implements Command {
	private Light light;

	public TurnOnLightCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.turnOn();
	}
}
