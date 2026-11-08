package Bridge;

public class TV implements Dispositivo {
    private boolean on = false;
    private int volume = 30;
    private int channel = 1;
    
    @Override
    public boolean isEnabled() { return on; }
    
    @Override
    public void enable() { 
        on = true;
        System.out.println("TV encendida");
    }
    
    @Override
    public void disable() { 
        on = false;
        System.out.println("TV apagada");
    }

    @Override
    public int getVolume() { return volume; }

    @Override
    public void setVolume(int percent) {
        if (percent > 100) this.volume = 100;
        else if (percent < 0) this.volume = 0;
        else this.volume = percent;
        System.out.println("Volumen de TV ajustado a: " + this.volume + "%");
    }

    @Override
    public int getChannel() { return channel; }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("Canal de TV cambiado a: " + this.channel);
    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| Estado TV: " + (on ? "Encendida" : "Apagada"));
        System.out.println("| Volumen actual: " + volume + "%");
        System.out.println("| Canal actual: " + channel);
        System.out.println("------------------------------------");
    }
}