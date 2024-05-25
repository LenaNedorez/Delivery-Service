package com.uniloftsky.springframework.spring5freelancedeliveryservice.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class Driver extends BaseEntity {

    private String car;
    private Integer experience;
    private String description;

    @OneToMany
    private Set<Type> types = new HashSet<>();

    @OneToMany(mappedBy = "executor", cascade = CascadeType.ALL)
    private Set<Advertisement> advertisements = new HashSet<>();

}
