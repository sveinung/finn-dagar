package no.sveinung.alt3;

import no.sveinung.Datoar;
import no.sveinung.alt2.FinnDagarAlt2;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FinnDagarBasertPåMedianTest {

    @Test
    public void finn_ein_enkelt_dag() {
        List<Integer> dagar = FinnDagarBasertPåMedian.finn(Datoar.DATOAR_1);

        assertThat(dagar)
                .contains(30)
                .hasSize(1);
    }

    @Test
    public void finn_to_dagar_per_månad() {
        List<Integer> dagar = FinnDagarBasertPåMedian.finn(Datoar.TO_LITT_SPREIDDE_SETT);

        assertThat(dagar)
                .contains(30, 15)
                .hasSize(2);
    }

    @Test
    public void finn_to_dagar_som_ligg_nærme_kvarandre()
    {
        List<Integer> dagar = FinnDagarBasertPåMedian.finn(Datoar.TO_NÆRLIGGANDE_SETT);

        assertThat(dagar)
                .contains(20, 15)
                .hasSize(2);
    }

}