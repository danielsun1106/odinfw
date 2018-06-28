package com.hkbea.app.repositories;

import com.hkbea.app.domain.UserDat;
import com.hkbea.app.domain.UserDatExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDatMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_dat
     *
     * @mbg.generated
     */
    long countByExample(UserDatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_dat
     *
     * @mbg.generated
     */
    int deleteByExample(UserDatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_dat
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_dat
     *
     * @mbg.generated
     */
    int insert(UserDat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_dat
     *
     * @mbg.generated
     */
    int insertSelective(UserDat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_dat
     *
     * @mbg.generated
     */
    List<UserDat> selectByExample(UserDatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_dat
     *
     * @mbg.generated
     */
    UserDat selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_dat
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") UserDat record, @Param("example") UserDatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_dat
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") UserDat record, @Param("example") UserDatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_dat
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(UserDat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_dat
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(UserDat record);
}