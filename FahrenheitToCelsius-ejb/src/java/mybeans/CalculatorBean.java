/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybeans;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author Chayodom
 */
@Stateless
@LocalBean
public class CalculatorBean {

    public double cal(double fahrenheit){
        return (5/9)*(fahrenheit-32);
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
