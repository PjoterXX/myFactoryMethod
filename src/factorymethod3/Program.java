/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod3;

import factorymethod2.factoryType.SimpleFactory1;
import factorymethod2.factoryType.SimpleFactory2;

/**
 *
 * @author DominatorMK
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Client client = null;

        client = new Client(new SimpleFactory1());
        client = new Client(new SimpleFactory2());

        client.Run();
    }
}
