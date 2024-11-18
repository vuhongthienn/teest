package com.server.pokiwar.repository;

import com.server.pokiwar.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ImageRepository extends JpaRepository<Image,Long> {

    @Query(value = "SELECT * " +
            "FROM tbl_image " +
            "WHERE id_upgrade_stone =:idUpgradeStone", nativeQuery = true)
    List<Image> findByIdUpgradeStone(Long idUpgradeStone);

    @Query(value = "SELECT * " +
            "FROM tbl_image " +
            "WHERE id_pet =:idPet", nativeQuery = true)
    List<Image> findByIdPet(Long idPet);
}
