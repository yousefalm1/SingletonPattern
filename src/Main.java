public class Main {

    public static void main(String[] args) {

        IPhoneSettings iPhoneSettings = IPhoneSettings.getInstance();


        iPhoneSettings.setBrightness(90);
        iPhoneSettings.enableWifi();
        iPhoneSettings.disableWifi();


        System.out.println(iPhoneSettings.toString());

    }

}
