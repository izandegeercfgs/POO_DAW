package Lombok;

import lombok.*;

@Getter
@ToString
@RequiredArgsConstructor
@EqualsAndHashCode
public class Estudiante {
    private final @NonNull String nombre;
    private final int edad;
    private final @NonNull Curso curso;
}