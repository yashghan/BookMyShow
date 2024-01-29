package com.example.BookMyShow.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "cinema")
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int CinemaId;


    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Long totalCinemaHalls;

    @Column(nullable = false)
    private String Address;


}
