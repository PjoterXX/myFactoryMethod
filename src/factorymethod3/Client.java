/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod3;

import factorymethod2.InhabitantInfo.Inhabitant;
import factorymethod2.factoryType.SimpleFactory;
import factorymethod2.factoryType.StaticFactory;

import factorymethod2.medicalServices.CT;
import factorymethod2.medicalServices.MR;
import factorymethod2.medicalServices.MedicalService;
import factorymethod2.medicalServices.MedicalServicesType;

/**
 *
 * @author LeopardProMK
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* Anti-pattern  */
        String typeOfService = "CT";// czy na pewno ten typ jest odpowiedni?
        Object currentService = null;// czy na pewno ten typ jest odpowiedni?

        // Czy na pewno drabinka if-elsów jest czytelna
        if (typeOfService.equals("CT")) {
            currentService = new CT();
        } else if (typeOfService.equals("MR")) {
            currentService = new MR();
        }
        //... // czy ten fragment kodu jest zamknięty na zmiany?

        Inhabitant inhabitant1 = new Inhabitant.Builder("Michał", 26)
                .addTreatment(currentService) // co jeżeli chciałbym dodać kolejny zabieg?
                .build();

        /* vs */

        /* Factory method */
        
        /* Prosta fabryka (simple factory) */
        SimpleFactory factory1 = new SimpleFactory();
        MedicalService ct1 = factory1.createTeratment(MedicalServicesType.CT);
        MedicalService mr1 = factory1.createTeratment(MedicalServicesType.MR);

        /* Fabryka statyczna (static factory) */
        MedicalService ct2 = StaticFactory.createTeratment(MedicalServicesType.CT);
        MedicalService mr2 = StaticFactory.createTeratment(MedicalServicesType.MR);
    }
}
