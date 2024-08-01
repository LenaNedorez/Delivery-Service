package com.uniloftsky.springframework.spring5freelancedeliveryservice.model;

import lombok.*;
import org.json.simple.JSONArray;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Advertisement extends BaseEntity {

    private String title;

    @ManyToMany(fetch = FetchType.LAZY)
    private Set<Type> types = new HashSet<>();

    private String deliverFrom;
    private String deliverTo;

    @OneToOne(mappedBy = "advertisement", cascade = CascadeType.PERSIST)
    private Details details;

    @ManyToOne
    private Driver executor;

    @Transient
    private JSONArray responded = new JSONArray();

    private Integer price;
    private LocalDate date;
    private Integer period;
    private String description;

    private Status status = Status.ACTIVE;
    private String userId;

    public void addDetails(Details details) {
        details.setAdvertisement(this);
        this.details = details;
    }
}
