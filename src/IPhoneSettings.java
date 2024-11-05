public class IPhoneSettings {

    private static IPhoneSettings instance;

    private boolean wifi;
    private int brightness;

    private IPhoneSettings() {
        wifi = true;
        brightness = 80;
    }


    public static IPhoneSettings getInstance() {
        if (instance == null) {
            instance = new IPhoneSettings();
        }
        return instance;
    }


    public boolean isWifi() {
        return wifi;
    }

    public void enableWifi() {
        wifi = true;
    }

    public void disableWifi() {
        wifi = false;
    }


    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        if (brightness >= 0 && brightness <= 100) {
            this.brightness = brightness;

        }

    }

    @Override
    public String toString() {
        return "IPhoneSettings{" +
                "wifi=" + wifi +
                ", brightness=" + brightness +
                '}';
    }
}
