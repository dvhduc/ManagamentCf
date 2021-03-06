/*
 * This file is generated by jOOQ.
*/
package BoBaPop.Model.routines;


import BoBaPop.Model.DbMilktea;

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
public class SpDeleteBill extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 72061494;

    /**
     * The parameter <code>db_milktea.sp_delete_bill.BillID</code>.
     */
    public static final Parameter<Integer> BILLID = createParameter("BillID", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public SpDeleteBill() {
        super("sp_delete_bill", DbMilktea.DB_MILKTEA);
        

        addInParameter(BILLID);
    }

    /**
     * Set the <code>BillID</code> parameter IN value to the routine
     */
    public void setBillid(Integer value) {
        setValue(BILLID, value);
    }
}
