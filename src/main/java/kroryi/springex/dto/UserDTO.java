package kroryi.springex.dto;

import lombok.*;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@ToString
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    @NotEmpty(message = "ID를 입력해주세요.")
    private String user_id;
    @NotEmpty(message = "이름을 입력해주세요.")
    private String user_name;
    @NotEmpty(message = "비밀번호를 입력해주세요.")
    private String user_pw;
    @NotEmpty(message = "이메일을 입력해주세요.")
    private String email;
    private LocalDate register_date;
}