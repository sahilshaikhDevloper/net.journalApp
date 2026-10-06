package net.shaikh.journelApp.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "news")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JournelEntity {
    @Id

    private String  id;
    @NonNull
    @Indexed(unique = true)
    private String title;
    @NonNull
    private String content;
    private LocalDateTime dateTime;
    @NonNull

    private String userId;

}
