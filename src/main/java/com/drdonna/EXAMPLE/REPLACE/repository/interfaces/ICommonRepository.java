package com.drdonna.EXAMPLE.REPLACE.repository.interfaces;

import com.drdonna.EXAMPLE.REPLACE.model.Example;

public interface ICommonRepository {

    Example getExampleById(String id);

    Example createExample(Example player);

    void updateExample(Example player);
}
