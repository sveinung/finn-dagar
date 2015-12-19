package no.sveinung.alt1;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class FinnDagarAlt1 {
    private static final int MINIMUM_ANTAL_FOR_Å_BLI_TALT_MED = 5;

    private final List<LocalDate> datoar;

    public FinnDagarAlt1(List<LocalDate> datoar) {
        this.datoar = datoar;
    }

    public List<Integer> finn() {
        Map<Integer, Integer> forekomstar = finnForekomstarAvDatoar(this.datoar);

        List<Integer> dagar = finnSannsynligeDagar(forekomstar, MINIMUM_ANTAL_FOR_Å_BLI_TALT_MED);

        return dagar;
    }

    private Map<Integer, Integer> finnForekomstarAvDatoar(List<LocalDate> datoar) {
        Map<Integer, Integer> forekomstar = new HashMap<>();

        for (LocalDate dato : datoar) {
            int dag = dato.getDayOfMonth();
            Integer forekomstAvDag = forekomstar.getOrDefault(dag, 0);
            forekomstar.put(dag, forekomstAvDag + 1);
        }
        return forekomstar;
    }

    private List<Integer> finnSannsynligeDagar(Map<Integer, Integer> forekomstar, int minimumAntalForÅBliTaltMed) {
        return forekomstar.entrySet().stream()
                .filter((dagOgAntal) -> dagOgAntal.getValue() >= minimumAntalForÅBliTaltMed)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
