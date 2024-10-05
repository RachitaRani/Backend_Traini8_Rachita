package com.example.demo.Repository;

import com.example.demo.Model.TrainingCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TrainingCenterRepository extends JpaRepository<TrainingCenter, Long> {
    @Query("SELECT t FROM TrainingCenter t WHERE (:city IS NULL OR t.address.city = :city) " +
            "AND (:state IS NULL OR t.address.state = :state) " +
            "AND (:capacity IS NULL OR t.studentCapacity >= :capacity) " +
            "AND (:course IS NULL OR :course IN elements(t.coursesOffered))")
    List<TrainingCenter> findFiltered(
            @Param("city") String city,
            @Param("state") String state,
            @Param("capacity") Integer capacity,
            @Param("course") String course);
}
