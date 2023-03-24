package br.com.rasmoo.restaurante.dao;

import br.com.rasmoo.restaurante.model.Categoria;

import javax.persistence.EntityManager;

public class CategoriaDao {
    private EntityManager entityManager;

    public CategoriaDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void create(Categoria categoria) {
        this.entityManager.persist(categoria);
    }

    public Categoria read(final Integer id) {
        return this.entityManager.find(Categoria.class, id);
    }

    public void update(final Categoria categoria) {
        this.entityManager.merge(categoria);
    }

    public void delete(final Categoria categoria) {
        this.entityManager.remove(categoria);
    }
}
