/*
 * This file is generated by jOOQ.
*/
package BoBaPop.Model.routines;


import BoBaPop.Model.DbMilktea;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SpGrossRevenueOfDrink extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 754617150;

    /**
     * The parameter <code>db_milktea.sp_gross_revenue_of_drink.fromDate</code>.
     */
    public static final Parameter<Timestamp> FROMDATE = createParameter("fromDate", org.jooq.impl.SQLDataType.TIMESTAMP, false, false);

    /**
     * The parameter <code>db_milktea.sp_gross_revenue_of_drink.toDate</code>.
     */
    public static final Parameter<Timestamp> TODATE = createParameter("toDate", org.jooq.impl.SQLDataType.TIMESTAMP, false, false);

    /**
     * The parameter <code>db_milktea.sp_gross_revenue_of_drink.drinkID</code>.
     */
    public static final Parameter<Integer> DRINKID = createParameter("drinkID", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public SpGrossRevenueOfDrink() {
        super("sp_gross_revenue_of_drink", DbMilktea.DB_MILKTEA);

        addInParameter(FROMDATE);
        addInParameter(TODATE);
        addInParameter(DRINKID);
    }

    /**
     * Set the <code>fromDate</code> parameter IN value to the routine
     */
    public void setFromdate(Timestamp value) {
        setValue(FROMDATE, value);
    }

    /**
     * Set the <code>toDate</code> parameter IN value to the routine
     */
    public void setTodate(Timestamp value) {
        setValue(TODATE, value);
    }

    /**
     * Set the <code>drinkID</code> parameter IN value to the routine
     */
    public void setDrinkid(Integer value) {
        setValue(DRINKID, value);
    }
}
