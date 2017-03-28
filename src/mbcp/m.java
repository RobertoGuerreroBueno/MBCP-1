package mbcp;

import java.util.Map;

public class m {

    private int i;
    private int ti;
    private String message;
    public Map<Integer, Integer> Hm;

    public m(int i, int ti, String message, Map<Integer, Integer> Hm) {
        this.i = i;
        this.ti = ti;
        this.message = message;
        this.Hm = Hm;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getTi() {
        return ti;
    }

    public void setTi(int ti) {
        this.ti = ti;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<Integer, Integer> getHm() {
        return Hm;
    }

    public void setHm(Map<Integer, Integer> Hm) {
        this.Hm = Hm;
    }
    
    
    
}
