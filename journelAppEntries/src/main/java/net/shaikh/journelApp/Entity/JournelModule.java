package net.shaikh.journelApp.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class JournelModule {
    @Id
    private String  id;
    private String title;
    private String content;

    private LocalDateTime localDateTime;
}
