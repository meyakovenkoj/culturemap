package ru.imitation.culturemap.repository;

import java.util.List;
import java.util.Map;

public interface LocationDaomy extends LocationDao {
    static List<Map<String, Object>> getLocations() {
        return LocationDaoImpl.jdbcTemplate.queryForList(LocationDaoImpl.GET_QUERY);
    }
}
