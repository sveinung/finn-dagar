package no.sveinung;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Datoar {

    public static final List<LocalDate> DATOAR_1 = Arrays.asList(
            LocalDate.of(2015, 12, 15),
            LocalDate.of(2015, 11, 30),
            LocalDate.of(2015, 10, 30),
            LocalDate.of(2015, 9, 30),
            LocalDate.of(2015, 8, 31),
            LocalDate.of(2015, 7, 31),
            LocalDate.of(2015, 6, 30),
            LocalDate.of(2015, 5, 29),
            LocalDate.of(2015, 4, 30),
            LocalDate.of(2015, 3, 31),
            LocalDate.of(2015, 2, 27),
            LocalDate.of(2015, 1, 30)
    );

    public static final List<LocalDate> DATOAR_2 = Arrays.asList(
            LocalDate.of(2015, 12, 15),
            LocalDate.of(2015, 11, 13),
            LocalDate.of(2015, 10, 15),
            LocalDate.of(2015, 9, 15),
            LocalDate.of(2015, 8, 14),
            LocalDate.of(2015, 7, 15),
            LocalDate.of(2015, 6, 15),
            LocalDate.of(2015, 5, 15),
            LocalDate.of(2015, 4, 15),
            LocalDate.of(2015, 3, 13),
            LocalDate.of(2015, 2, 13),
            LocalDate.of(2015, 1, 15)
    );

    public static final List<LocalDate> DATOAR_3 = Arrays.asList(
            LocalDate.of(2015, 12, 20),
            LocalDate.of(2015, 11, 18),
            LocalDate.of(2015, 10, 20),
            LocalDate.of(2015, 9, 20),
            LocalDate.of(2015, 8, 19),
            LocalDate.of(2015, 7, 20),
            LocalDate.of(2015, 6, 20),
            LocalDate.of(2015, 5, 20),
            LocalDate.of(2015, 4, 20),
            LocalDate.of(2015, 3, 18),
            LocalDate.of(2015, 2, 19),
            LocalDate.of(2015, 1, 20)
    );

    public static final List<LocalDate> TO_LITT_SPREIDDE_SETT = new ArrayList<LocalDate>() {{
        addAll(DATOAR_1);
        addAll(DATOAR_2);
    }};

    public static final List<LocalDate> TO_NÆRLIGGANDE_SETT = new ArrayList<LocalDate>() {{
        addAll(DATOAR_2);
        addAll(DATOAR_3);
    }};

}
