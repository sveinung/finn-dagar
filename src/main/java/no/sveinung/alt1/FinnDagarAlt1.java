package no.sveinung.alt1;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

public class FinnDagarAlt1 {
    private static final int MINIMUM_ANTAL_FOREKOMSTAR_FOR_Å_BLI_TALT_MED = 5;

    public static List<Integer> finn(List<LocalDate> datoar) {
        Map<Integer, List<LocalDate>> datoarPerDag = datoar.stream()
                .collect(groupingBy(LocalDate::getDayOfMonth));

        List<Integer> dagar = datoarPerDag.entrySet().stream()
                .filter((datoarForEinDag) ->
                        datoarForEinDag.getValue().size() >= MINIMUM_ANTAL_FOREKOMSTAR_FOR_Å_BLI_TALT_MED)
                .map(Map.Entry::getKey)
                .collect(toList());

        return dagar;
    }
}
