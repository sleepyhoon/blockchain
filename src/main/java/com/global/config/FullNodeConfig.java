package com.global.config;

import com.domain.entity.Utxo;
import com.domain.repository.UtxoRepository;
import com.global.util.TxInitializer;
import com.domain.repository.TransactionRepository;

/**
 * <br>package name   : com.global.config
 * <br>file name      : FullNodeConfig
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
public class FullNodeConfig {
    private static final TransactionRepository transactionRepository = new TransactionRepository();
    private static final UtxoRepository utxoRepository = new UtxoRepository();
    private static final TxInitializer txInitializer = new TxInitializer(transactionRepository,utxoRepository);
    private FullNodeConfig() {}

    public static TxInitializer getTxInitializer() {
        return txInitializer;
    }

    public static TransactionRepository getTransactionRepository() {
        return transactionRepository;
    }
}
