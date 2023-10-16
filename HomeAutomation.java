// Facade Pattern
//task-8
public class HomeAutomation {
    public static void main(String[] args) {
       SmartHome smartHome = new SmartHome();
       
       System.out.println("Turning on all devices:");
       smartHome.turnOnAllDevices();

       System.out.println("Turning off all devices:");
       smartHome.turnOffAllDevices();
    }
}

interface SmartDevice{
    void turnOn();
    void turnOff();
}

class Light implements SmartDevice{
    private String name;

    public Light(String name){
        this.name = name;
    }

    @Override
    public void turnOn(){
        System.out.println(name + " light is on");
    }

    @Override
    public void turnOff(){
        System.out.println(name + " light is off");
    }
}

class SecurityCamera implements SmartDevice{
    private String name;

    public SecurityCamera(String name){
        this.name = name;
    }

    @Override
    public void turnOn(){
        System.out.println(name + " security camera is activated");
    }

    @Override
    public void turnOff(){
        System.out.println(name + " Security camera is deactivated");
    }
}

class SmartHome{
    private SmartDevice livingRoomLight;
    private SmartDevice kitchenLight;
    private SmartDevice securityCamera;

    public SmartHome(){
        livingRoomLight = new Light("Living Room");
        kitchenLight = new Light("Kitchen");
        securityCamera = new SecurityCamera("Front Door");
    }

    public void turnOnAllDevices(){
        livingRoomLight.turnOn();
        kitchenLight.turnOn();
        securityCamera.turnOn();
    }

    public void turnOffAllDevices(){
        livingRoomLight.turnOff();
        kitchenLight.turnOff();
        securityCamera.turnOff();
    }
}
