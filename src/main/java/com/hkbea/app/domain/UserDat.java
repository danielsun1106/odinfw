package com.hkbea.app.domain;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table user_dat
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class UserDat {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_dat.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_dat.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_dat.password
     *
     * @mbg.generated
     */
    private String password;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_dat.id
     *
     * @return the value of user_dat.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_dat.id
     *
     * @param id the value for user_dat.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_dat.name
     *
     * @return the value of user_dat.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_dat.name
     *
     * @param name the value for user_dat.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_dat.password
     *
     * @return the value of user_dat.password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_dat.password
     *
     * @param password the value for user_dat.password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password;
    }
}