package com.global.util;

import com.domain.dto.CreateUtxoDto;
import com.domain.entity.Transaction;
import com.domain.dto.CreateTransactionDto;
import com.domain.entity.Utxo;
import com.domain.repository.UtxoRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.domain.repository.TransactionRepository;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * <br>package name   : com.global.util
 * <br>file name      : TxInitializer
 * <br>date           : 2024-11-21
 * <pre>
 * <span style="color: white;">[description]</span>
 *
 * </pre>
 * <pre>
 * <span style="color: white;">usage:</span>
 * {@code
 *
 * } </pre>
 * <pre>
 * modified log :
 * =======================================================
 * DATE           AUTHOR               NOTE
 * -------------------------------------------------------
 * 2024-11-21        SeungHoon              init create
 * </pre>
 */
public class TxInitializer {
    private static final String txPath = "src/main/java/com/json/transactions.json";
    private static final String utxoPath = "src/main/java/com/json/UTXOes.json";
    private static final ObjectMapper objectMapper = new ObjectMapper();

    private final TransactionRepository transactionRepository;
    private final UtxoRepository utxoRepository;

    public TxInitializer(TransactionRepository transactionRepository, UtxoRepository utxoRepository) {
        this.transactionRepository = transactionRepository;
        this.utxoRepository = utxoRepository;
    }

    public void initFullNode() {
        initTx();
        System.out.println("===============================");
        initUtxo();
    }

    private void initTx() {
        try {
            // JSON 파일 읽어서 List<createTransactionDto>으로 변환
            List<CreateTransactionDto> createTransactionDtos = objectMapper.readValue(
                    new File(txPath), new TypeReference<>() {}
            );
            createTransactionDtos.forEach(createTransactionDto -> {
                Transaction transaction = Transaction.create(createTransactionDto);
                transactionRepository.save(transaction);
                System.out.println(transaction);
            });
        } catch (IOException e) {
            throw new IllegalArgumentException("Failed to initialize transactions: " + e.getMessage());
        }
    }

    private void initUtxo() {
        try {
            List<CreateUtxoDto> createUtxoDtos = objectMapper.readValue(
                    new File(utxoPath), new TypeReference<>() {
                    }
            );
            createUtxoDtos.forEach(createUtxoDto -> {
                Utxo utxo = Utxo.of(createUtxoDto);
                utxoRepository.save(utxo);
                System.out.println(utxo);
            });
        } catch (IOException e) {
            throw new IllegalArgumentException("Failed to initialize utxos : " + e.getMessage());
        }
    }
}
