package io.project.BreaksBot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Timestamp;

@Entity(name = "usersDataTable")
@Data
public class User {

    @Id
    private Long chatId;

    private String userName;

    private String firstName;

    private String lastName;

    private Timestamp registerAt;

    @Override
    public String toString() {
        return "User{" +
                "chatId=" + chatId +
                ", userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", registerAt=" + registerAt +
                '}';
    }
}
