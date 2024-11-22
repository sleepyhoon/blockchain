package com.domain.repository;

import com.domain.entity.Utxo;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UtxoRepository {
    // id로 검색을 하기 위해 map으로 선언
    private static final Map<String, Utxo> map = new HashMap<>();

    public void save(Utxo utxo) {
        map.put(utxo.utxoId(), utxo);
    }

    public Utxo get(String id) {
        return map.get(id);
    }

    public Collection<Utxo> findAll() {
        return map.values();
    }
}
