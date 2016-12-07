package com.training.clinic.service.repository;

import com.training.clinic.entity.Visit;

import java.time.LocalDateTime;

public interface VisitRepository {

    public void save(Visit visit);

    public LocalDateTime getById(long visitId);

    public long getByDate(LocalDateTime visitDate);

    public void update(Visit visit);
}
