package com.company;
interface Storage{
    int a = 54;
     abstract void Ram();
     private String Processor(String s){
         System.out.print("the processor of this device is :");
         return s;
     }
     default void Rom(int a){
         System.out.println(Processor("MediaTek G98"));
         System.out.println("and the Rom of the device is :"+a);
     }
}
interface Specifications{
    void ClickSelfie();
    void RecordVideo();
}
class Phone2{
    public void On(){
        System.out.println("Switch On");
    }
    public void Off(){
        System.out.println("Switch Off");
    }
    public String [] getNetworks(){
        System.out.println("Available networks are...");
        String [] myNetwork = {"Airtel 5G","Jio 5G","Jarvis"};
        return myNetwork;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+network);
    }
}
class SmartPhone2 extends Phone2 implements Storage, Specifications{
    @Override
    public void On(){
        System.out.println("Switch On SmartPhone");
    }
    @Override
    public void Off(){
        System.out.println("Switch Off Smartphone");
    }
    public void Ram(){
        System.out.println("The Ram of the Smartphone is low...");
    }
    public void ClickSelfie(){
        System.out.println("You already click to many selfies...");
    }
    public void RecordVideo(){
        System.out.println("Recording is on...");
    }

}
public class Ch11_Lec3_defaultMethod {
    public static void main(String[] args) {
        SmartPhone2 sp = new SmartPhone2();
        sp.Off();
        sp.On();
        sp.Ram();
        sp.ClickSelfie();
        sp.RecordVideo();
        System.out.println(sp.a);
        sp.Rom(512);
        String [] s = sp.getNetworks();
        for (String e: sp.getNetworks()){
            System.out.println(e);
        }
        sp.connectToNetwork("Jarvis");
    }
}
