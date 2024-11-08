package automatization;

public class WgPage implements Action <WgPage>{

    @Override
    public WgPage openUrl(String url) {
        return this;
    }
}
