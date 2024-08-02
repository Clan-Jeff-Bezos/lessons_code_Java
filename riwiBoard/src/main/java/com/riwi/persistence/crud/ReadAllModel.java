package com.riwi.persistence.crud;

import java.util.List;

public interface ReadAllModel<Entity> {
    public List<Entity> readAll(int size, int numberPage);
}
