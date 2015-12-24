package no.sveinung.alt3;

import org.apache.commons.math3.stat.descriptive.rank.Median;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FinnDagarBasertPåMedian {
    private static final int AVSTAND_MELLOM_CLUSTER = 2;
    private static final int MINIMUM_STORLEIK_PÅ_CLUSTER = 4;

    public static List<Integer> finn(List<LocalDate> datoar) {
        List<Integer> sorterteDagar = datoar.stream()
                .map(LocalDate::getDayOfMonth)
                .sorted()
                .collect(Collectors.toList());

        List<List<Integer>> clusters = clustringAvDagar(sorterteDagar);

        List<Integer> dagar = clusters.stream()
                .filter((cluster) -> cluster.size() > MINIMUM_STORLEIK_PÅ_CLUSTER)
                .map(FinnDagarBasertPåMedian::median)
                .map(Double::intValue)
                .collect(Collectors.toList());

        return dagar;
    }

    private static List<List<Integer>> clustringAvDagar(List<Integer> sorterteDagar) {
        List<List<Integer>> clusters = new ArrayList<>();
        List<Integer> noverandeCluster = new ArrayList<>();
        clusters.add(noverandeCluster);

        Integer forrige = sorterteDagar.get(0);
        for (Integer dag : sorterteDagar) {
            if (dag - forrige > AVSTAND_MELLOM_CLUSTER) {
                noverandeCluster = new ArrayList<>();
                clusters.add(noverandeCluster);
            }

            noverandeCluster.add(dag);

            forrige = dag;
        }
        return clusters;
    }

    private static double median(List<Integer> tal) {
        double[] clusterAsDoubles = tal.stream()
                .mapToDouble(Integer::doubleValue)
                .toArray();
        Median median = new Median();
        return median.evaluate(clusterAsDoubles);
    }
}
