package kroryi.springex.domain;

import lombok.*;

import java.time.LocalDate;

@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TodoVO {
    private Long tno;
    private String title;
    private LocalDate dueDate;
    private String writer;
    private boolean finished;
}
