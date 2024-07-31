package com.riwi.persistence.crud;

public interface CreateModel<Entity> {
    public Entity create(Entity request);
}
