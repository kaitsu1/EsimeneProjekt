package main;

import java.util.Scanner;

/**
 * Created by Kairi on 20.10.2015.
 */
public class Esimene {
    public static void main(String[] args) {
        Scanner klaviatuur = new Scanner(System.in);
        System.out.println("Arvutan välja mitme aasta pärast saad sa pensionile");

        System.out.println("Sisesta enda sünniaasta:");
        int synniaasta = klaviatuur.nextInt();
        System.out.println("Sinu sünniaasta on " + synniaasta);

        System.out.println("Sisesta enda sugu(M,N):");
        String sugu = klaviatuur.next();
        String mees = "M";
        String naine = "N";

        int pensioniiga = 65;
        // if (sugu == "M") {
        if (sugu.equals(mees)) {
            pensioniiga = pensioniiga;
            System.out.println("Mees");
        } else if (sugu.equals(naine)) {
            pensioniiga = pensioniiga - 1;
            System.out.println("Naine");
        }else {
            System.out.println("Sisestasid valesti");
            pensioniiga = pensioniiga;
        }

        System.out.println("Sinu sisestatud sugu on: " + sugu);

        int pensionile_mineku_aasta = synniaasta + pensioniiga;
        System.out.println("Sa saad jääda pensile aastal " + pensionile_mineku_aasta);
        int aastaid_pensini = pensionile_mineku_aasta - 2015;
        System.out.println("Sul on pensini jäänud " + aastaid_pensini + "aastat");
    }
}
