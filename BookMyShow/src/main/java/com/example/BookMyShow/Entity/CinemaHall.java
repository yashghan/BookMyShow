package com.example.BookMyShow.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="Show")
public class CinemaHall {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(nullable = false)
    private Long cinemaHallId;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Long totalSeats;
}
