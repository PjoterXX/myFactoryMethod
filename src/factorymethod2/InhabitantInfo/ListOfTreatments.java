/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod2.InhabitantInfo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LeopardProMK
 */
public class ListOfTreatments {

    private List treatments = null;

    public ListOfTreatments() {
        this.treatments = new ArrayList();
    }

    public void AddTreatment(Object treatment) {
        treatments.add(treatment);
    }
}
