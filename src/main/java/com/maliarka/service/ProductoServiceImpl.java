/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maliarka.service;

import com.maliarka.dao.ProductoDao;
import com.maliarka.domain.Producto;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author JerryCampos
 */
@Service
public class ProductoServiceImpl implements ProductoService{
    
    @Autowired
    private ProductoDao productoDao;

    @Override
    @Transactional
    public Producto save(Producto producto) {
        return productoDao.save(producto);
    }

    @Override
    public Optional<Producto> get(Integer id) {
        return productoDao.findById(id);
    }

    @Override
    @Transactional
    public void update(Producto producto) {
        productoDao.save(producto);
    }

    @Override
    public void delete(Integer id) {
        productoDao.deleteById(id);
                }

    @Override
    public List<Producto> findAll() {
        return productoDao.findAll();
    }
    
    
}
