package test.dao;

import java.util.List;
import test.model.Disscope;

public interface DisscopeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table disscope
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer disscopeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table disscope
     *
     * @mbg.generated
     */
    int insert(Disscope record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table disscope
     *
     * @mbg.generated
     */
    Disscope selectByPrimaryKey(Integer disscopeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table disscope
     *
     * @mbg.generated
     */
    List<Disscope> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table disscope
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Disscope record);
}