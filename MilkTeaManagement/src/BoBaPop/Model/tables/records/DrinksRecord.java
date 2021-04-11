/*
 * This file is generated by jOOQ.
*/
package BoBaPop.Model.tables.records;


import BoBaPop.Model.tables.Drinks;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * InnoDB free: 23552 kB; (`DrinkTypeID`) REFER `db_milktea/drinktypes`(`DrinkTypeI
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DrinksRecord extends UpdatableRecordImpl<DrinksRecord> implements Record5<Integer, String, Integer, Double, byte[]> {

    private static final long serialVersionUID = 68354692;

    /**
     * Setter for <code>db_milktea.drinks.DrinkID</code>.
     */
    public void setDrinkid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_milktea.drinks.DrinkID</code>.
     */
    public Integer getDrinkid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>db_milktea.drinks.DrinkName</code>.
     */
    public void setDrinkname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_milktea.drinks.DrinkName</code>.
     */
    public String getDrinkname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>db_milktea.drinks.DrinkTypeID</code>.
     */
    public void setDrinktypeid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>db_milktea.drinks.DrinkTypeID</code>.
     */
    public Integer getDrinktypeid() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>db_milktea.drinks.UnitPrice</code>.
     */
    public void setUnitprice(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>db_milktea.drinks.UnitPrice</code>.
     */
    public Double getUnitprice() {
        return (Double) get(3);
    }

    /**
     * Setter for <code>db_milktea.drinks.Image</code>.
     */
    public void setImage(byte... value) {
        set(4, value);
    }

    /**
     * Getter for <code>db_milktea.drinks.Image</code>.
     */
    public byte[] getImage() {
        return (byte[]) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, Integer, Double, byte[]> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, Integer, Double, byte[]> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Drinks.DRINKS.DRINKID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Drinks.DRINKS.DRINKNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Drinks.DRINKS.DRINKTYPEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field4() {
        return Drinks.DRINKS.UNITPRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field5() {
        return Drinks.DRINKS.IMAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getDrinkid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getDrinkname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getDrinktypeid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component4() {
        return getUnitprice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component5() {
        return getImage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getDrinkid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getDrinkname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getDrinktypeid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value4() {
        return getUnitprice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value5() {
        return getImage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DrinksRecord value1(Integer value) {
        setDrinkid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DrinksRecord value2(String value) {
        setDrinkname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DrinksRecord value3(Integer value) {
        setDrinktypeid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DrinksRecord value4(Double value) {
        setUnitprice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DrinksRecord value5(byte... value) {
        setImage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DrinksRecord values(Integer value1, String value2, Integer value3, Double value4, byte[] value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DrinksRecord
     */
    public DrinksRecord() {
        super(Drinks.DRINKS);
    }

    /**
     * Create a detached, initialised DrinksRecord
     */
    public DrinksRecord(Integer drinkid, String drinkname, Integer drinktypeid, Double unitprice, byte[] image) {
        super(Drinks.DRINKS);

        set(0, drinkid);
        set(1, drinkname);
        set(2, drinktypeid);
        set(3, unitprice);
        set(4, image);
    }
}