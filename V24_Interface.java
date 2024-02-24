// // u can inherit more than 1 interfaces which is not possible with abstract
// interface Bicycle{
//     int a = 45;
//     void applyBrake(int decrement);
//     void speedUp(int increment);
// }
// interface Bike{
//     void horn();
// }
// class AvonCycle implements Bicycle, Bike{
//     void blowHorn(){
//         System.out.println("pii poo");
//     }
//     public void applyBrake(int decrement){
//         System.out.println("Brake");
//     } 
//     public void speedUp(int increment){
//         System.out.println("SpeedUp");
//     }
//     public void horn(){
//         System.out.println("Hiii");
//     }
// }
// public class V24_Interface {
//     public static void main(String[] args) {
//         AvonCycle cycle = new AvonCycle();
//         cycle.applyBrake(1);
//         cycle.horn();

//         System.out.println(cycle.a); // 45 // u can access Base class variables but u // cant chnge the value, cycle.a=455 is NOT POSSIBLE
//     }
// }


interface MyCamera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4k...");
    }
}

interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }

}

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Taking snap");
    }
//    public void record4KVideo(){
//        System.out.println("Taking snap and recoding in 4k");
//    }
    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networkList = {"Harry", "Prashanth", "Anjali5G"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}
public class V24_Interface {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4KVideo();
        // ms.greet(); --> Throws an error!
        String[] ar = ms.getNetworks();
        for (String item: ar) {
            System.out.println(item);
        }
        ms.callNumber(3333);


        MyCamera cam = new MySmartPhone(); // can use all the functions of camera 
        cam.takeSnap(); // taking snap
        // cam.getNetworks(); // Not allowed
    }
}
