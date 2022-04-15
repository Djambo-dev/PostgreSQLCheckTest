package ru.check.data.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class CatEntity {

    @Id
    @Column(
            nullable = false
    )
    long id;

    @Column(
            nullable = false
    )
    String name;

    @Column(
            nullable = false
    )
    String catType;

}
