package com.riwi.persistence.crud;

public interface ReadModel<ID, Entity> {
    public Entity readByID(ID id);
}
