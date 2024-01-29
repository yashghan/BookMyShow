package com.example.BookMyShow.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

@Table(name="Movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long movieId;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private int durInMinutes;

    @Column(nullable = false)
    private String language;

    @Column(nullable = false)
    private Date releaseDate;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String genre;


}
