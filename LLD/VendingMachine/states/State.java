package states;

import java.io.*;

public interface State{
    public void insertCoin(Integer amount);
    public void pressButton(Integer productCode);
    public void dispenseProduct(Integer productCode);
}