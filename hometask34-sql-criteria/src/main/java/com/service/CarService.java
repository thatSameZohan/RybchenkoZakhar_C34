package com.service;

import com.config.HibernateFactory;
import com.dto.SearchDto;
import com.entity.CarEntity;
import jakarta.persistence.criteria.Predicate;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    private static final SessionFactory factory= HibernateFactory.getSessionFactory();

    public CarEntity save(CarEntity carEntity) {

        var session = factory.openSession();
        var transaction= session.beginTransaction();
        session.persist(carEntity);
        transaction.commit();
        session.close();
        return carEntity;

    }

    public List<CarEntity> search(SearchDto searchDto) {

        var session=factory.openSession();
        var transaction=session.beginTransaction();
        var builder = session.getCriteriaBuilder();
        var query=builder.createQuery(CarEntity.class);
        var root=query.from(CarEntity.class);

        List<Predicate> predicates=new ArrayList<>();

        if(searchDto.getBrand()!=null){
            var brandEq=builder.equal(root.get("brand"),searchDto.getBrand());
            predicates.add(brandEq);
        }

        if(searchDto.getFromCost()!=null){
            var fromCostEq=builder.greaterThanOrEqualTo(root.get("cost"),searchDto.getFromCost());
            predicates.add(fromCostEq);
        }

        if(searchDto.getToCost()!=null){
            var toCostEq=builder.lessThanOrEqualTo(root.get("cost"),searchDto.getToCost());
            predicates.add(toCostEq);
        }

        if(searchDto.getFromMileage()!=null){
            var fromMileageEq=builder.greaterThanOrEqualTo(root.get("mileage"),searchDto.getFromMileage());
            predicates.add(fromMileageEq);
        }

        if(searchDto.getToMileage()!=null){
            var toMileageEq=builder.lessThanOrEqualTo(root.get("mileage"),searchDto.getToMileage());
            predicates.add(toMileageEq);
        }

        if(searchDto.getFromYear()!=null){
            var fromYearEq=builder.greaterThanOrEqualTo(root.get("year"),searchDto.getFromYear());
            predicates.add(fromYearEq);
        }

        query.where(predicates.toArray(new Predicate[0]));

        var result=session.createQuery(query)
                .getResultList();

        transaction.commit();
        session.close();
        return result;
    }
}
