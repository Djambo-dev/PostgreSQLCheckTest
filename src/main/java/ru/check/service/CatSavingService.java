package ru.check.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import ru.check.data.entity.CatEntity;
import ru.check.data.repository.CatEntityRepository;

import java.util.LinkedList;
import java.util.Random;

@Log4j2
@lombok.Value
@RequiredArgsConstructor
@Component
public class CatSavingService {

    CatEntityRepository catEntityRepository;

    public void process() {
        Random random = new Random();
        LinkedList<CatEntity> list = new LinkedList<>();
        list.add(new CatEntity(random.nextLong(),"Большой Пушистый", "BIG_FURRY"));
        list.add(new CatEntity(random.nextLong(),"Маленький Красный", "SMALL_RED"));
        list.add(new CatEntity(random.nextLong(),"Средний Кот", "AVERAGE_CAT"));
        catEntityRepository.saveAll(list);
    }
}
