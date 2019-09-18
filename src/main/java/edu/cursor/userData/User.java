package edu.cursor.userData;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({"accessId","name","surname","lastLoginDate","email","statusHW"})
public class User {
    @JsonIgnore
    private int accessId;
    private String name;
    private String surname;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd")
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate lastLoginDate;
    private String email;
    private Map<String,Boolean> statusHW;

    public User(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;

    }

    public void setStatusHW(String hw1, String b1) {
    }
    public void setStatusHW(String hw1, boolean b1, String hw2, boolean b2) {
    }
    public void setStatusHW(String hw1, boolean b1, String hw2, boolean b2, String hw3, boolean b3) {
    }
    public void setStatusHW(String hw1, boolean b, String hw2, boolean b1, String hw3, boolean b3, String hw4, boolean b4) {
    }
}