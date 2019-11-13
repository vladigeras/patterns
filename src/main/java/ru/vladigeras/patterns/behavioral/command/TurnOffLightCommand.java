package ru.vladigeras.patterns.behavioral.command;

/**
 * @author vladi_geras on 13.11.2019
 */
public class TurnOffLightCommand implements Command {
	private Light light;

	public TurnOffLightCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.turnOff();
	}
}
