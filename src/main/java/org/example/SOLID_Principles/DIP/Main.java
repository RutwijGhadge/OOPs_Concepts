package org.example.SOLID_Principles.DIP;

public class Main {
    public static void main(String[] args) {
        KeyBoard keyBoard=new KeyBoard();
        Mouse mouse=new Mouse();
        DeviceManager deviceManager=new DeviceManager(keyBoard,mouse);
        deviceManager.operateDevice();
    }
}
/*
DIP : Dependency Inversion Principle
High Level Module should depend on Low Level Module
Changes in Low Level Module Should not affect High Level Module.

In this example ,
High Level Module : Device Manager
Low Level Modules : KeyBoard , Mouses
 */