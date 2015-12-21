package no.sveinung.alt2;

import no.sveinung.Datoar;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FinnDagarAlt2Test {

    @Test
    public void finn_ein_enkelt_dag() {
        FinnDagarAlt2 finnDagar = new FinnDagarAlt2(Datoar.DATOAR_1);

        List<Integer> dagar = finnDagar.finn();

        assertThat(dagar)
                .contains(30)
                .hasSize(1);
    }

    @Test
    public void finn_to_dagar_per_månad() {
        FinnDagarAlt2 finnDagar = new FinnDagarAlt2(Datoar.ALLE_DATOAR);

        List<Integer> dagar = finnDagar.finn();

        assertThat(dagar)
                .contains(30, 15)
                .hasSize(2);
    }

}