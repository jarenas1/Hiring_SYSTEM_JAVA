package riwi.filtro;

import riwi.filtro.entitie.HiringEntity;
import riwi.filtro.model.HiringModel_Implementation;
import riwi.filtro.tools.status1;

import static riwi.filtro.tools.status1.ACTIVO;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        HiringModel_Implementation mm = new HiringModel_Implementation();

        HiringEntity aa = new HiringEntity(1,1,100.0,ACTIVO);

        mm.create(aa);
    }
}