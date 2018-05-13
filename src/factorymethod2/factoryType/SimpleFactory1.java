/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod2.factoryType;

import factorymethod2.medicalServices.CT;
import factorymethod2.medicalServices.MR;
import factorymethod2.medicalServices.RTG;
import factorymethod2.medicalServices.USG;
import factorymethod2.medicalServices.MedicalService;
import factorymethod2.medicalServices.MedicalServicesType;

/**
 *
 * @author LeopardProMK
 */
public class SimpleFactory1 implements AbstractFactoryMethod{

    public MedicalService createTeratment(MedicalServicesType medicalServicesType) {

        MedicalService medicalService = null;
        switch (medicalServicesType) {
            case CT:
                medicalService = new CT();
                break;
            case MR:
                medicalService = new MR();
                break;
            case RTG:
                medicalService = new RTG();
                break;
            case USG:
                medicalService = new USG();
                break;
        }
        return medicalService;
    }
}
