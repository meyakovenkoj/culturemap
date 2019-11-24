package ru.imitation.culturemap.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class LocationDaoImpl implements LocationDaomy {
    public static final String GET_QUERY =
            "select l.name, l.description, l.coordinatex, l.coordinatey, l.photolinks from locations l left outer join relations r ON l.id=r.location_id where r.person_id='5d83443c0cb433003f223b18'";
    public static JdbcTemplate jdbcTemplate;

}