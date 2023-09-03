package com.company;
// this code is similar to the "Ch11_Lec3_defaultMethod"...
interface Storage1{
    public void ram();
    private void processor(String st){
        System.out.println("the processor is :"+st);
    }
    default void rom(){
        processor("Media tek G98");
        System.out.println("and rom of this device is : 512 GB");
    }
}
interface Camera1{
    void clickPhoto();
    void record_4k_video();
}
class Phone11{
    public void one(){
        System.out.println("one");
    }
    public void two(){
        System.out.println("two");
    }
    public String [] getNetwork(){
        System.out.println("Available networks are...");
        String [] network = {"Airtel 5G","Jio 5G","Jarvis"};
        return network;
    }
}
class Smartphone11 extends Phone11 implements Storage1, Camera1{
    @Override
    public void two(){
        System.out.println("two");
    }
    public void ram(){
        System.out.println("ram");
    }
    public void clickPhoto(){
        System.out.println("click photo");
    }
    public void record_4k_video(){
        System.out.println("record 4k videos");
    }
    void availableNetwork(String st){
        System.out.println("you got "+st);
    }
}
public class Ch11_Lec5_polymorphism {
    public static void main(String[] args) {
        Storage1 st = new Smartphone11();
        st.ram();
        st.rom();
        // st.clickPhoto(); --> throws an error because we created a reference of storage1
        Camera1 cr = new Smartphone11();
        cr.record_4k_video();
        cr.clickPhoto();
        Smartphone11 st1 = new Smartphone11();
        st1.one();
        st1.two();
        for (String e : st1.getNetwork()) {
            System.out.println(e);
        }
        st1.availableNetwork("Jarvis");

        // OR
        /*
        String [] s = st1.getNetwork();
        for (String e : s) {
            System.out.println(e);
        }
        st1.availableNetwork("Jarvis");
         */

        
        st1.rom();  // --> in this case we created reference and object of same class "Smartphone11"...

        // this code is similar to the "Ch11_Lec3_defaultMethod"...
    }
}
