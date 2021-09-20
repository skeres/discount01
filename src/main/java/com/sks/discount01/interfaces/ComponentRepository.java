package com.sks.discount01.interfaces;

import com.sks.discount01.model.Component;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 *
 */
@NoRepositoryBean
public interface ComponentRepository extends JpaRepository<Component, Integer> {
}
