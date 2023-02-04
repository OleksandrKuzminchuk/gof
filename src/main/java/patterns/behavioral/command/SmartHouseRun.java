package patterns.behavioral.command;

import patterns.behavioral.command.commands.OpenCloseCurtainsCommand;
import patterns.behavioral.command.commands.SwitchLightsCommand;
import patterns.behavioral.command.components.FloorLamp;
import patterns.behavioral.command.components.Room;

public class SmartHouseRun {
    public static void main(String[] args) {
        Room room = new Room();
        room.setCommand(new OpenCloseCurtainsCommand(room.getCurtains()));
        room.executeCommand();
        System.out.println(room.curtainsOpen());

        System.out.println("================================================");

        FloorLamp floorLamp = new FloorLamp();
        floorLamp.setCommand(new SwitchLightsCommand(floorLamp.getLight()));
        floorLamp.executeCommand();
        System.out.println(floorLamp.isLightOn());
        floorLamp.executeCommand();
        System.out.println(floorLamp.isLightOn());
        floorLamp.executeCommand();
        System.out.println(floorLamp.isLightOn());


    }
}
