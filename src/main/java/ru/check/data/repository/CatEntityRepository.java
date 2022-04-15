package ru.check.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.check.data.entity.CatEntity;

public interface CatEntityRepository extends JpaRepository<CatEntity, Long> {


}
