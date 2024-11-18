package com.server.pokiwar.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


import lombok.Data;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_pet")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "id_type_pet_restrain")
    private Long idTypePetRestrain;

    @Column(name = "id_card")
    private Long idCard;

    @Column(name = "id_type_pet")
    private Long idTypePet;

    @Column(name = "description")
    private String description;

    @Column(name = "dame_type_pet")
    private String dameTypePet;

    @Column(name = "name")
    private String name;

    @Column(name = "attack")
    private int attack;

    @Column(name = "mana")
    private int mana;

    @Column(name = "blood")
    private int blood;

    @Column(name = "step_no")
    private int stepNo;

    @Column(name = "condition_pass")
    private int conditionPass;

    @Column(name = "check_new")
    private String checkNew;

    @Column(name = "lever")
    private int lever;

    @Column(name = "active")
    private String active;

}
