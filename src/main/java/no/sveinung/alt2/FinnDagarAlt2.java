package no.sveinung.alt2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FinnDagarAlt2 {
    private final List<LocalDate> datoar;

    public FinnDagarAlt2(List<LocalDate> datoar) {
        this.datoar = datoar;
    }

    public List<Integer> finn() {
        List<Integer> sorterteDagar = this.datoar.stream()
                .map(LocalDate::getDayOfMonth)
                .sorted()
                .collect(Collectors.toList());

        List<List<Integer>> clusters = new ArrayList<>();
        List<Integer> noverandeCluster = new ArrayList<>();
        clusters.add(noverandeCluster);

        Integer forrige = sorterteDagar.get(0);
        for (Integer dag : sorterteDagar) {
            if (dag - forrige > 4) {
                noverandeCluster = new ArrayList<>();
                clusters.add(noverandeCluster);
            }

            noverandeCluster.add(dag);

            forrige = dag;
        }

        List<Integer> dagar = clusters.stream()
                .filter((cluster) -> cluster.size() > 4)
                .map((cluster) -> cluster.stream()
                        .mapToInt(Integer::valueOf)
                        .average()
                        .getAsDouble())
                .map(Math::ceil)
                .map(Double::intValue)
                .collect(Collectors.toList());

        return dagar;
    }
}