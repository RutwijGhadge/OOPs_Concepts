package org.example.SOLID_Principles.DIP;

public class DeviceManager{
    public final Device keyBoard;
    public final Device mouse;

    public DeviceManager(Device keyBoard, Device mouse) {
        this.keyBoard = keyBoard;
        this.mouse = mouse;
    }

    public void operateDevice(){
        keyBoard.operate();
        mouse.operate();
    }
}
