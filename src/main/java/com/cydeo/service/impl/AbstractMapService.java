package com.cydeo.service.impl;

import java.util.HashMap;
import java.util.Map;

public class AbstractMapService<T, ID> {

    protected Map<ID, T> map = new HashMap<>();
}