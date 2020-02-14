package dao;

import domain.TourGuide;

public class TourGuideDAO extends DAO<TourGuide> {

    @Override
    protected String getSqlString() {
        return "select t from TourGuide t";
    }

    @Override
    protected Class getClassName() {
        return TourGuide.class;
    }

}
