package com.example.BookMyShow.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Time;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Show")
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int showId;

    @Column(nullable = false)
    private Time startTime;

    @Column(nullable = false)
    private Time endTime;




}
