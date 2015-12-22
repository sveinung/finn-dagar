package no.sveinung.alt1;

import no.sveinung.Datoar;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FinnDagarAlt1Test {

    @Test
    public void finn_ein_enkelt_dag() {
        List<Integer> dagar = FinnDagarAlt1.finn(Datoar.DATOAR_1);

        assertThat(dagar)
                .contains(30)
                .hasSize(1);
    }

    @Test
    public void finn_to_dagar_per_månad() {
        List<Integer> dagar = FinnDagarAlt1.finn(Datoar.TO_LITT_SPREIDDE_SETT);

        assertThat(dagar)
                .contains(30, 15)
                .hasSize(2);
    }
}