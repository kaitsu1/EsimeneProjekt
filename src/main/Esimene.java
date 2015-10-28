package main;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by Kairi on 20.10.2015.
 */
public class Esimene {
    public static void main(String[] args) {
        Scanner klaviatuur = new Scanner(System.in);

        System.out.println("Arvutan v�lja mitme aasta p�rast saad sa pensionile");

        System.out.println("Sisesta enda s�nniaasta:");
        int synniaasta = klaviatuur.nextInt();

        System.out.println("Sinu s�nniaasta on " + synniaasta);

        System.out.println("Sisesta enda sugu(M,N):");
        String sugu = klaviatuur.next();
        String mees = "M";
        String naine = "N";

        int pensioniiga = 65;
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
        //kommentaar
        System.out.println("Sinu sisestatud sugu on: " + sugu);

        int pensionile_mineku_aasta = synniaasta + pensioniiga;
        System.out.println("Sa saad j��da pensile aastal " + pensionile_mineku_aasta);

        //leian k�esoleva aasta
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int aastaid_pensini = pensionile_mineku_aasta - year;
        System.out.println("Sul on pensini j��nud " + aastaid_pensini + "aastat");

    }
}
