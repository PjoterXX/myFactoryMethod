/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod2.InhabitantInfo;

/**
 *
 * @author LeopardProMK
 */
public class Inhabitant {

    private ListOfTreatments listOfTreatments = null;//optional

    private String name = null; //required
    private String typeOfTherapy = null;//optional
    private String placeOfResidence = null;//optional
    private int age = 0; //required

    private Inhabitant(Builder builder) {
        this.name = builder.name;
        this.typeOfTherapy = builder.typeOfTherapy;
        this.placeOfResidence = builder.placeOfResidence;
        this.age = builder.age;
        this.listOfTreatments = builder.listOfTreatments;
    }

    public static class Builder {

        private ListOfTreatments listOfTreatments = null;//optional

        private String name = null; //required
        private String typeOfTherapy = null;//optional
        private String placeOfResidence = null;//optional
        private int age = 0; //required

        public Builder(String name, int age) {
            this.name = name;
            this.listOfTreatments = new ListOfTreatments();
        }

        public Builder setTypeOfTherapy(String typeOfTherapy) {
            this.typeOfTherapy = typeOfTherapy;
            return this;
        }

        public Builder setPlaceOfResidence(String placeOfResidence) {
            this.placeOfResidence = placeOfResidence;
            return this;
        }

        public Builder addTreatment(Object treatment) {
            this.listOfTreatments.AddTreatment(treatment);
            return this;
        }

        public Inhabitant build() {
            return new Inhabitant(this);
        }
    }
}
