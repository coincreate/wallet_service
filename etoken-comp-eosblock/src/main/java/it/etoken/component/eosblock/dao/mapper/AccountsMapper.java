package it.etoken.component.eosblock.dao.mapper;

import it.etoken.base.model.eosblock.entity.Accounts;
import it.etoken.base.model.eosblock.entity.AccountsExample;
import it.etoken.component.eosblock.dao.provider.AccountsSqlProvider;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
@Mapper
public interface AccountsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accounts
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    @SelectProvider(type=AccountsSqlProvider.class, method="countByExample")
    long countByExample(AccountsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accounts
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    @DeleteProvider(type=AccountsSqlProvider.class, method="deleteByExample")
    int deleteByExample(AccountsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accounts
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    @Delete({
        "delete from accounts",
        "where name = #{name,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String name);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accounts
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    @Insert({
        "insert into accounts (name, abi, ",
        "created_at, updated_at)",
        "values (#{name,jdbcType=VARCHAR}, #{abi,jdbcType=CHAR}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP})"
    })
    int insert(Accounts record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accounts
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    @InsertProvider(type=AccountsSqlProvider.class, method="insertSelective")
    int insertSelective(Accounts record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accounts
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    @SelectProvider(type=AccountsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="abi", property="abi", jdbcType=JdbcType.CHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Accounts> selectByExample(AccountsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accounts
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    @Select({
        "select",
        "name, abi, created_at, updated_at",
        "from accounts",
        "where name = #{name,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="abi", property="abi", jdbcType=JdbcType.CHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    Accounts selectByPrimaryKey(String name);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accounts
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    @UpdateProvider(type=AccountsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Accounts record, @Param("example") AccountsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accounts
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    @UpdateProvider(type=AccountsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Accounts record, @Param("example") AccountsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accounts
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    @UpdateProvider(type=AccountsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Accounts record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accounts
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    @Update({
        "update accounts",
        "set abi = #{abi,jdbcType=CHAR},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
        "where name = #{name,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Accounts record);
}