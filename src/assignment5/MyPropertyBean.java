/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Bean.java to edit this template
 */
package assignment5;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author abc_k
 */
public class MyPropertyBean implements Serializable {
    public static final String PROP_SAMPLE_PROPERTY = "sampleProperty";
    private String ScoreData;   
    
    
    private PropertyChangeSupport propertySupport;
    
    public MyPropertyBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getScoreData() {
        return ScoreData;
    }
    
    public void setScoreData(String value) {
        String oldValue = ScoreData;
        ScoreData = value;
        propertySupport.firePropertyChange(PROP_SAMPLE_PROPERTY, oldValue, ScoreData);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
        
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
