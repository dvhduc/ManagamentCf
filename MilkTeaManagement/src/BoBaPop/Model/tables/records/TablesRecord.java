/*
 * This file is generated by jOOQ.
*/
package BoBaPop.Model.tables.records;


import BoBaPop.Model.tables.Tables;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class TablesRecord extends UpdatableRecordImpl<TablesRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = -292028016;

    /**
     * Setter for <code>db_milktea.tables.TableID</code>.
     */
    public void setTableid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_milktea.tables.TableID</code>.
     */
    public Integer getTableid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>db_milktea.tables.TableName</code>.
     */
    public void setTablename(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_milktea.tables.TableName</code>.
     */
    public String getTablename() {
        return (String) get(1);
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
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Tables.TABLES.TABLEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Tables.TABLES.TABLENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getTableid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getTablename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getTableid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTablename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TablesRecord value1(Integer value) {
        setTableid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TablesRecord value2(String value) {
        setTablename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TablesRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TablesRecord
     */
    public TablesRecord() {
        super(Tables.TABLES);
    }

    /**
     * Create a detached, initialised TablesRecord
     */
    public TablesRecord(Integer tableid, String tablename) {
        super(Tables.TABLES);

        set(0, tableid);
        set(1, tablename);
    }
}
