/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod2.factoryType;

import factorymethod2.medicalServices.MedicalService;
import factorymethod2.medicalServices.MedicalServicesType;

/**
 *
 * @author LeopardProMK
 */
public interface AbstractFactoryMethod {
    public abstract MedicalService createTeratment(MedicalServicesType medicalServicesType) ;
}
