package dao;

import domain.State;

public class StateDAO extends DAO<State> {

    @Override
    protected String getSqlString() {
        return "select s from State s";
    }

    @Override
    protected Class getClassName() {
        return State.class;
    }

}
