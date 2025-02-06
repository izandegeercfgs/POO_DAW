package Lombok;

import lombok.*;

@Getter
@ToString
@RequiredArgsConstructor
@EqualsAndHashCode
public class Curso {
    private final @NonNull String nombre;
    private final int horas;
}