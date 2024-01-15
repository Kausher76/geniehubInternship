package Abstraction;


interface ElectronicDevice {
	void turnOn();

	void turnOff();

	boolean isOn();
}


class Television implements ElectronicDevice {
	private boolean powerOn;

	@Override
	public void turnOn() {
		powerOn = true;
		System.out.println("Television is now ON.");
	}

	@Override
	public void turnOff() {
		powerOn = false;
		System.out.println("Television is now OFF.");
	}

	@Override
	public boolean isOn() {
		return powerOn;
	}
}


class Laptop implements ElectronicDevice {
	private boolean powerOn;

	@Override
	public void turnOn() {
		powerOn = true;
		System.out.println("Laptop is now ON.");
	}

	@Override
	public void turnOff() {
		powerOn = false;
		System.out.println("Laptop is now OFF.");
	}

	@Override
	public boolean isOn() {
		return powerOn;
	}
}

public class AbstractionInterfaceExample {
	public static void main(String[] args) {
		
		ElectronicDevice television = new Television();
		ElectronicDevice laptop = new Laptop();

		
		television.turnOn();
		System.out.println("Television is on: " + television.isOn());
		television.turnOff();
		System.out.println("Television is on: " + television.isOn());

		laptop.turnOn();
		System.out.println("Laptop is on: " + laptop.isOn());
		laptop.turnOff();
		System.out.println("Laptop is on: " + laptop.isOn());
	}
}
