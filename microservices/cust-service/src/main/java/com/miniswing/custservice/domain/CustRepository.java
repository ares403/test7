package com.miniswing.custservice.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustRepository extends JpaRepository<Cust, Long> {
    //    @Query("SELECT p FROM Cust p ORDER BY p.id DESC")
//    List<Cust> findCustsBy();

    List<Cust> findByCustnum(String custnum);
}
