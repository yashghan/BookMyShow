package com.example.BookMyShow.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "Show")
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int showId;

    @Column
    private Time startTime;

    @Column
    private Time endTime;




}
