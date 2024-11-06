package com.example.MoviesApi.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "reviews")
public class Review {
    private ObjectId id;
    private String body;
    private LocalDateTime created;
    private LocalDateTime updated;

    // No-args constructor (Equivalent to @NoArgsConstructor)
    public Review() {
    }

    // All-args constructor (Equivalent to @AllArgsConstructor)
    public Review(ObjectId id, String body, LocalDateTime created, LocalDateTime updated) {
        this.id = id;
        this.body = body;
        this.created = created;
        this.updated = updated;
    }

    // Constructor without id (custom constructor)
    public Review(String body, LocalDateTime created, LocalDateTime updated) {
        this.body = body;
        this.created = created;
        this.updated = updated;
    }

    // Getters and Setters (Equivalent to @Data)
    
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }

    // toString method (Optional, but useful for debugging)
    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", body='" + body + '\'' +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}
