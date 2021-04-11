/*
 * This file is generated by jOOQ.
*/
package BoBaPop.Model.tables.records;


import BoBaPop.Model.tables.Users;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * InnoDB free: 23552 kB
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UsersRecord extends UpdatableRecordImpl<UsersRecord> implements Record10<Integer, String, String, String, String, Integer, String, Byte, String, byte[]> {

    private static final long serialVersionUID = -740821777;

    /**
     * Setter for <code>db_milktea.users.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_milktea.users.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>db_milktea.users.UserName</code>.
     */
    public void setUsername(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_milktea.users.UserName</code>.
     */
    public String getUsername() {
        return (String) get(1);
    }

    /**
     * Setter for <code>db_milktea.users.Password</code>.
     */
    public void setPassword(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>db_milktea.users.Password</code>.
     */
    public String getPassword() {
        return (String) get(2);
    }

    /**
     * Setter for <code>db_milktea.users.Permisson</code>.
     */
    public void setPermisson(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>db_milktea.users.Permisson</code>.
     */
    public String getPermisson() {
        return (String) get(3);
    }

    /**
     * Setter for <code>db_milktea.users.FullName</code>.
     */
    public void setFullname(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>db_milktea.users.FullName</code>.
     */
    public String getFullname() {
        return (String) get(4);
    }

    /**
     * Setter for <code>db_milktea.users.Age</code>.
     */
    public void setAge(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>db_milktea.users.Age</code>.
     */
    public Integer getAge() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>db_milktea.users.PhoneNumber</code>.
     */
    public void setPhonenumber(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>db_milktea.users.PhoneNumber</code>.
     */
    public String getPhonenumber() {
        return (String) get(6);
    }

    /**
     * Setter for <code>db_milktea.users.Gender</code>.
     */
    public void setGender(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>db_milktea.users.Gender</code>.
     */
    public Byte getGender() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>db_milktea.users.Address</code>.
     */
    public void setAddress(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>db_milktea.users.Address</code>.
     */
    public String getAddress() {
        return (String) get(8);
    }

    /**
     * Setter for <code>db_milktea.users.Avatar</code>.
     */
    public void setAvatar(byte... value) {
        set(9, value);
    }

    /**
     * Getter for <code>db_milktea.users.Avatar</code>.
     */
    public byte[] getAvatar() {
        return (byte[]) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, String, String, String, Integer, String, Byte, String, byte[]> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, String, String, String, Integer, String, Byte, String, byte[]> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Users.USERS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Users.USERS.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Users.USERS.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Users.USERS.PERMISSON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Users.USERS.FULLNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Users.USERS.AGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Users.USERS.PHONENUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field8() {
        return Users.USERS.GENDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Users.USERS.ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field10() {
        return Users.USERS.AVATAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getPermisson();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getFullname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getAge();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getPhonenumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component8() {
        return getGender();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component10() {
        return getAvatar();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPermisson();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getFullname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getAge();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getPhonenumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value8() {
        return getGender();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value10() {
        return getAvatar();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value2(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value3(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value4(String value) {
        setPermisson(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value5(String value) {
        setFullname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value6(Integer value) {
        setAge(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value7(String value) {
        setPhonenumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value8(Byte value) {
        setGender(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value9(String value) {
        setAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value10(byte... value) {
        setAvatar(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord values(Integer value1, String value2, String value3, String value4, String value5, Integer value6, String value7, Byte value8, String value9, byte[] value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UsersRecord
     */
    public UsersRecord() {
        super(Users.USERS);
    }

    /**
     * Create a detached, initialised UsersRecord
     */
    public UsersRecord(Integer id, String username, String password, String permisson, String fullname, Integer age, String phonenumber, Byte gender, String address, byte[] avatar) {
        super(Users.USERS);

        set(0, id);
        set(1, username);
        set(2, password);
        set(3, permisson);
        set(4, fullname);
        set(5, age);
        set(6, phonenumber);
        set(7, gender);
        set(8, address);
        set(9, avatar);
    }
}
