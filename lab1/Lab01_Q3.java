public class Lab01_Q3 {
    public static void main(String[] args) {
        final double MASS_PERCENTAGE_OF_OXYGEN       = 65.0;
        final double MASS_PERCENTAGE_OF_CARBON       = 18.5;
        final double MASS_PERCENTAGE_OF_HYDROGEN     = 10.0;
        final double MASS_PERCENTAGE_OF_NITROGEN     = 3.2;
        final double MASS_PERCENTAGE_OF_CALCIUM      = 1.5;

        final double MASS_PERCENTAGE_OF_FIVE_ELEMENTS      = MASS_PERCENTAGE_OF_OXYGEN + MASS_PERCENTAGE_OF_CARBON + MASS_PERCENTAGE_OF_HYDROGEN + MASS_PERCENTAGE_OF_NITROGEN + MASS_PERCENTAGE_OF_CALCIUM;
        final double MASS_PERCENTAGE_OF_PHOSPORUS    = 98.6 - MASS_PERCENTAGE_OF_FIVE_ELEMENTS;
        final double MASS_PERCENTAGE_FOR_REMAINDER   = 100.0 - 98.6;

        final double COUNT_PERCENTAGE_OF_HYDROGEN = 62.0;
        final double COUNT_PERCENTAGE_OF_OXYGEN = 24.0;

        double massOfTheHuman = 70.0;
        double oxygenMass = massOfTheHuman * MASS_PERCENTAGE_OF_OXYGEN / 100;
        double carbonMass = massOfTheHuman * MASS_PERCENTAGE_OF_CARBON / 100;

        double atomCountTotal     = massOfTheHuman * 1.0E26;
        double atomCountRemainder = MASS_PERCENTAGE_FOR_REMAINDER * atomCountTotal / 100;

        double hydrogenCount = atomCountTotal * COUNT_PERCENTAGE_OF_HYDROGEN / 100;
        double oxygenCount = atomCountTotal * COUNT_PERCENTAGE_OF_OXYGEN / 100;


        System.out.println( "Phosphorus makes up " + MASS_PERCENTAGE_OF_PHOSPORUS + " percent of the mass in the human body." );
        System.out.println( "Elements other than oxygen, carbon, hydrogen, nitrogen, calcium and phosphorus make up " + MASS_PERCENTAGE_FOR_REMAINDER + " percent of the mass with an atom count of " + atomCountRemainder + "." );
        System.out.println();
        System.out.println("For a person of " + massOfTheHuman + " kg the mass of the elements are:");
        System.out.println("Oxygen: " + oxygenMass + " kg");
        System.out.println("Carbon: " + carbonMass + " kg");
        System.out.println();
        System.out.println("whereas the number of atoms of some elements in this person are:");
        System.out.println("Hydrogen: " + hydrogenCount);
        System.out.println("Oxygen: " + oxygenCount);
    }
}
