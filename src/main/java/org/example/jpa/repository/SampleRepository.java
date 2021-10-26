package org.example.jpa.repository;

import org.example.jpa.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * @author Vivek
 * @since 24/10/21
 */
@Repository
public interface SampleRepository extends JpaRepository<UserEntity, String> {

    @Modifying
    @Transactional
    @Query(value = "UPDATE experi SET mobile = :fieldValue where email = :email", nativeQuery = true)
    int updateMobile(@Param("fieldValue") long fieldValue,
                     @Param("email") String email);

    @Query(value = "SELECT mobile from experi where email = :emailId", nativeQuery = true)
    Long retrieveMobile(@Param("emailId") String email);
}