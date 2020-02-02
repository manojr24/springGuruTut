package com.springtut.invenapp.dao.interf;

import com.springtut.invenapp.dao.ImplClasses.Manufacturer;
import com.springtut.invenapp.dao.ImplClasses.ProductAttributes;
import com.springtut.invenapp.dao.ImplClasses.ProductDimension;

public interface Product {

    Manufacturer getManufacturer();

    void setManufacturer(Manufacturer manufacturer);

    String getColor();

    void setColor(String color);

    ProductDimension getDimension();

    void setDimension(ProductDimension productDimension);

    ProductAttributes getProductAttributes();

    void setProductAttributes(ProductAttributes productAttributes);

}
