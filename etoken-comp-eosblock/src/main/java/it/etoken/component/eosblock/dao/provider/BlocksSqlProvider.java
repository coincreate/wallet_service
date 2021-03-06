package it.etoken.component.eosblock.dao.provider;

import it.etoken.base.model.eosblock.entity.Blocks;
import it.etoken.base.model.eosblock.entity.BlocksExample.Criteria;
import it.etoken.base.model.eosblock.entity.BlocksExample.Criterion;
import it.etoken.base.model.eosblock.entity.BlocksExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class BlocksSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blocks
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public String countByExample(BlocksExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("blocks");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blocks
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public String deleteByExample(BlocksExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("blocks");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blocks
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public String insertSelective(Blocks record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("blocks");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getBlockNumber() != null) {
            sql.VALUES("block_number", "#{blockNumber,jdbcType=INTEGER}");
        }
        
        if (record.getPrevBlockId() != null) {
            sql.VALUES("prev_block_id", "#{prevBlockId,jdbcType=VARCHAR}");
        }
        
        if (record.getIrreversible() != null) {
            sql.VALUES("irreversible", "#{irreversible,jdbcType=BIT}");
        }
        
        if (record.getTimestamp() != null) {
            sql.VALUES("timestamp", "#{timestamp,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTransactionMerkleRoot() != null) {
            sql.VALUES("transaction_merkle_root", "#{transactionMerkleRoot,jdbcType=VARCHAR}");
        }
        
        if (record.getActionMerkleRoot() != null) {
            sql.VALUES("action_merkle_root", "#{actionMerkleRoot,jdbcType=VARCHAR}");
        }
        
        if (record.getProducer() != null) {
            sql.VALUES("producer", "#{producer,jdbcType=VARCHAR}");
        }
        
        if (record.getVersion() != null) {
            sql.VALUES("version", "#{version,jdbcType=INTEGER}");
        }
        
        if (record.getNewProducers() != null) {
            sql.VALUES("new_producers", "#{newProducers,jdbcType=CHAR}");
        }
        
        if (record.getNumTransactions() != null) {
            sql.VALUES("num_transactions", "#{numTransactions,jdbcType=INTEGER}");
        }
        
        if (record.getConfirmed() != null) {
            sql.VALUES("confirmed", "#{confirmed,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blocks
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public String selectByExample(BlocksExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("block_number");
        sql.SELECT("prev_block_id");
        sql.SELECT("irreversible");
        sql.SELECT("timestamp");
        sql.SELECT("transaction_merkle_root");
        sql.SELECT("action_merkle_root");
        sql.SELECT("producer");
        sql.SELECT("version");
        sql.SELECT("new_producers");
        sql.SELECT("num_transactions");
        sql.SELECT("confirmed");
        sql.FROM("blocks");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blocks
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        Blocks record = (Blocks) parameter.get("record");
        BlocksExample example = (BlocksExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("blocks");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=VARCHAR}");
        }
        
        if (record.getBlockNumber() != null) {
            sql.SET("block_number = #{record.blockNumber,jdbcType=INTEGER}");
        }
        
        if (record.getPrevBlockId() != null) {
            sql.SET("prev_block_id = #{record.prevBlockId,jdbcType=VARCHAR}");
        }
        
        if (record.getIrreversible() != null) {
            sql.SET("irreversible = #{record.irreversible,jdbcType=BIT}");
        }
        
        if (record.getTimestamp() != null) {
            sql.SET("timestamp = #{record.timestamp,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTransactionMerkleRoot() != null) {
            sql.SET("transaction_merkle_root = #{record.transactionMerkleRoot,jdbcType=VARCHAR}");
        }
        
        if (record.getActionMerkleRoot() != null) {
            sql.SET("action_merkle_root = #{record.actionMerkleRoot,jdbcType=VARCHAR}");
        }
        
        if (record.getProducer() != null) {
            sql.SET("producer = #{record.producer,jdbcType=VARCHAR}");
        }
        
        if (record.getVersion() != null) {
            sql.SET("version = #{record.version,jdbcType=INTEGER}");
        }
        
        if (record.getNewProducers() != null) {
            sql.SET("new_producers = #{record.newProducers,jdbcType=CHAR}");
        }
        
        if (record.getNumTransactions() != null) {
            sql.SET("num_transactions = #{record.numTransactions,jdbcType=INTEGER}");
        }
        
        if (record.getConfirmed() != null) {
            sql.SET("confirmed = #{record.confirmed,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blocks
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("blocks");
        
        sql.SET("id = #{record.id,jdbcType=VARCHAR}");
        sql.SET("block_number = #{record.blockNumber,jdbcType=INTEGER}");
        sql.SET("prev_block_id = #{record.prevBlockId,jdbcType=VARCHAR}");
        sql.SET("irreversible = #{record.irreversible,jdbcType=BIT}");
        sql.SET("timestamp = #{record.timestamp,jdbcType=TIMESTAMP}");
        sql.SET("transaction_merkle_root = #{record.transactionMerkleRoot,jdbcType=VARCHAR}");
        sql.SET("action_merkle_root = #{record.actionMerkleRoot,jdbcType=VARCHAR}");
        sql.SET("producer = #{record.producer,jdbcType=VARCHAR}");
        sql.SET("version = #{record.version,jdbcType=INTEGER}");
        sql.SET("new_producers = #{record.newProducers,jdbcType=CHAR}");
        sql.SET("num_transactions = #{record.numTransactions,jdbcType=INTEGER}");
        sql.SET("confirmed = #{record.confirmed,jdbcType=INTEGER}");
        
        BlocksExample example = (BlocksExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blocks
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    public String updateByPrimaryKeySelective(Blocks record) {
        SQL sql = new SQL();
        sql.UPDATE("blocks");
        
        if (record.getBlockNumber() != null) {
            sql.SET("block_number = #{blockNumber,jdbcType=INTEGER}");
        }
        
        if (record.getPrevBlockId() != null) {
            sql.SET("prev_block_id = #{prevBlockId,jdbcType=VARCHAR}");
        }
        
        if (record.getIrreversible() != null) {
            sql.SET("irreversible = #{irreversible,jdbcType=BIT}");
        }
        
        if (record.getTimestamp() != null) {
            sql.SET("timestamp = #{timestamp,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTransactionMerkleRoot() != null) {
            sql.SET("transaction_merkle_root = #{transactionMerkleRoot,jdbcType=VARCHAR}");
        }
        
        if (record.getActionMerkleRoot() != null) {
            sql.SET("action_merkle_root = #{actionMerkleRoot,jdbcType=VARCHAR}");
        }
        
        if (record.getProducer() != null) {
            sql.SET("producer = #{producer,jdbcType=VARCHAR}");
        }
        
        if (record.getVersion() != null) {
            sql.SET("version = #{version,jdbcType=INTEGER}");
        }
        
        if (record.getNewProducers() != null) {
            sql.SET("new_producers = #{newProducers,jdbcType=CHAR}");
        }
        
        if (record.getNumTransactions() != null) {
            sql.SET("num_transactions = #{numTransactions,jdbcType=INTEGER}");
        }
        
        if (record.getConfirmed() != null) {
            sql.SET("confirmed = #{confirmed,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=VARCHAR}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blocks
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    protected void applyWhere(SQL sql, BlocksExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}