package GZQ;

/**
 * @author czy
 * @date 2021/2/2
 */
public class Adapter implements Translate{
    private Speck s;

    public Adapter(Speck s) {
        this.s = s;
    }

    @Override
    public String translate() {
        String speck = s.speck();
        return speck;
    }
}
