/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod3;

import factorymethod2.InhabitantInfo.Inhabitant;

import factorymethod2.factoryType.AbstractFactoryMethod;

import factorymethod2.medicalServices.MedicalServicesType;

/**
 *
 * @author LeopardProMK
 */
public class Client {

    AbstractFactoryMethod factory = null;

    public Client(AbstractFactoryMethod factory) {
        this.factory = factory;
    }

    public void Run() {
        Inhabitant inhabitant1 = new Inhabitant.Builder("Michał", 26)
                .addTreatment(factory.createTeratment(MedicalServicesType.CT))
                .addTreatment(factory.createTeratment(MedicalServicesType.MR))
                .addTreatment(factory.createTeratment(MedicalServicesType.USG))
                .addTreatment(factory.createTeratment(MedicalServicesType.RTG))
                .build();

    }
}
