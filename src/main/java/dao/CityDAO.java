package dao;

import domain.City;

public class CityDAO extends DAO<City> {

    @Override
    protected String getSqlString() {
        return "select c from City c";
    }

    @Override
    protected Class getClassName() {
        return City.class;
    }

}
