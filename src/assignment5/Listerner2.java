/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment5;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author abc_k
 */
public class Listerner2 implements PropertyChangeListener{

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("live result : " + (evt.getNewValue()));
    }
    
}
