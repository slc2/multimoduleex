package learn.lynn.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

   @jakarta.persistence.Id
    private Long Id;
    private String firstName;
    private String lastName;
    private String email;
}
