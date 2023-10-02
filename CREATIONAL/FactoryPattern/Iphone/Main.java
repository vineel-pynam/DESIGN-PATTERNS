public class Main{
    public static void main(String args[]) throws Exception{
        Phone iphone = iPhoneFactory.producePhone("iPhone", "IOS-16", "METAL", "A16");
        System.out.println(iphone.getOperatingSystem());
        System.out.println(iphone.getMetal());
        System.out.println(iphone.getProcessor());
        iphone.design();
        iphone.features();

        System.out.println();
        Phone iphonePro = iPhoneFactory.producePhone("iPhonePro", "IOS-16", "METAL", "A16");
        System.out.println(iphonePro.getOperatingSystem());
        System.out.println(iphonePro.getMetal());
        System.out.println(iphonePro.getProcessor());
        iphonePro.design();
        iphonePro.features();
    }
}