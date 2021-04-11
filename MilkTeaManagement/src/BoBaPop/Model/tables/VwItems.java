/*
 * This file is generated by jOOQ.
*/
package BoBaPop.Model.tables;


import BoBaPop.Model.DbMilktea;
import BoBaPop.Model.tables.records.VwItemsRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * VIEW
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VwItems extends TableImpl<VwItemsRecord> {

    private static final long serialVersionUID = 1967280256;

    /**
     * The reference instance of <code>db_milktea.vw_items</code>
     */
    public static final VwItems VW_ITEMS = new VwItems();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VwItemsRecord> getRecordType() {
        return VwItemsRecord.class;
    }

    /**
     * The column <code>db_milktea.vw_items.BillID</code>.
     */
    public final TableField<VwItemsRecord, Integer> BILLID = createField("BillID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>db_milktea.vw_items.DrinkID</code>.
     */
    public final TableField<VwItemsRecord, Integer> DRINKID = createField("DrinkID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>db_milktea.vw_items.DrinkTypeID</code>.
     */
    public final TableField<VwItemsRecord, Integer> DRINKTYPEID = createField("DrinkTypeID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>db_milktea.vw_items.DrinkName</code>.
     */
    public final TableField<VwItemsRecord, String> DRINKNAME = createField("DrinkName", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>db_milktea.vw_items.DrinkTypeName</code>.
     */
    public final TableField<VwItemsRecord, String> DRINKTYPENAME = createField("DrinkTypeName", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>db_milktea.vw_items.Quantity</code>.
     */
    public final TableField<VwItemsRecord, Integer> QUANTITY = createField("Quantity", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>db_milktea.vw_items.UnitPrice</code>.
     */
    public final TableField<VwItemsRecord, Double> UNITPRICE = createField("UnitPrice", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>db_milktea.vw_items.Total</code>.
     */
    public final TableField<VwItemsRecord, Double> TOTAL = createField("Total", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>db_milktea.vw_items.Image</code>.
     */
    public final TableField<VwItemsRecord, byte[]> IMAGE = createField("Image", org.jooq.impl.SQLDataType.BLOB, this, "");

    /**
     * Create a <code>db_milktea.vw_items</code> table reference
     */
    public VwItems() {
        this(DSL.name("vw_items"), null);
    }

    /**
     * Create an aliased <code>db_milktea.vw_items</code> table reference
     */
    public VwItems(String alias) {
        this(DSL.name(alias), VW_ITEMS);
    }

    /**
     * Create an aliased <code>db_milktea.vw_items</code> table reference
     */
    public VwItems(Name alias) {
        this(alias, VW_ITEMS);
    }

    private VwItems(Name alias, Table<VwItemsRecord> aliased) {
        this(alias, aliased, null);
    }

    private VwItems(Name alias, Table<VwItemsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "VIEW");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DbMilktea.DB_MILKTEA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VwItems as(String alias) {
        return new VwItems(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VwItems as(Name alias) {
        return new VwItems(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public VwItems rename(String name) {
        return new VwItems(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public VwItems rename(Name name) {
        return new VwItems(name, null);
    }
}
