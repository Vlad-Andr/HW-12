package edu.cursor.userData;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import lombok.Data;

import java.time.LocalDate;
import java.util.Map;
@Data
@JsonPropertyOrder({"accessId","name","surname","lastLoginDate","email","statusHW"})
public class User {
    private String name;
    private String surname;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd")
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate lastLoginDate;
    @JsonIgnore
    private int accessId;
    private String email;
    private Map<String,Boolean> statusHW;

    public void setStatusHW(String hw1, boolean b1) {
    }
    public void setStatusHW(String hw1, boolean b1, String hw2, boolean b2) {
    }
    public void setStatusHW(String hw1, boolean b1, String hw2, boolean b2, String hw3, boolean b3) {
    }
    public void setStatusHW(String hw1, boolean b, String hw2, boolean b1, String hw3, boolean b3, String hw4, boolean b4) {
    }
}