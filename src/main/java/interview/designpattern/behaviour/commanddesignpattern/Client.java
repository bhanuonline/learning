package interview.designpattern.behaviour.commanddesignpattern;


/**
 * Client --> Command --> ConcreteCommand
 *                       |--> Receiver
 *        --> Invoker --|
 *
 *
 */

// Command Interface
interface Command {
    void execute();
}

// Receiver
 class Light {
    public void turnOn() {
        System.out.println("The light is ON");
    }

    public void turnOff() {
        System.out.println("The light is OFF");
    }
}

// Concrete Command
 class TurnOnLightCommand implements Command {
    private final Light light;

    public TurnOnLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}

 class TurnOffLightCommand implements Command {
    private final Light light;

    public TurnOffLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}

// Invoker
 class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}

// Client
public class Client {
    public static void main(String[] args) {
        Light light = new Light();

        Command turnOn = new TurnOnLightCommand(light);
        Command turnOff = new TurnOffLightCommand(light);

        RemoteControl remote = new RemoteControl();

        // Turn the light ON
        remote.setCommand(turnOn);
        remote.pressButton();

        // Turn the light OFF
        remote.setCommand(turnOff);
        remote.pressButton();
    }
}
