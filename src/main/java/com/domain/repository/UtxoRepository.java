package com.domain.repository;

import com.domain.entity.Utxo;
import java.util.HashMap;
import java.util.Map;

public class UtxoRepository {
    private static final Map<String, Utxo> map = new HashMap<>();

    public void save(Utxo utxo) {
        map.put(utxo.utxoId(), utxo);
    }
}
