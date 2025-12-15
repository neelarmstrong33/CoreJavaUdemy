package GenericClassExample;

import java.util.List;

public class Print {
    /*
    public void setPrintValues(List<? extends Vehicle> vehicles) {}
     */

    public void setPrintValues(List<? super Vehicle> vehicles) {}
}
