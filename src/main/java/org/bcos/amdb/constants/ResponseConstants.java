
package org.bcos.amdb.constants;


/**
 * ResponseConstants.
 *
 * @Description: ResponseConstants
 * @author graysonzhang
 * @data 2019-10-16 15:24:00
 *
 */
public class ResponseConstants {
    
    /* response code **/
    public static final int NO_TABLE = 1000;
    public static final int BLOCK_NUM_ERROR = 1001;
    
    
    /* response message **/
    public static final String NO_TABLE_MESSAGE = "this table does not exist";
    public static final String BLOCK_NUM_ERROR_MESSAGE = "block num > the max num in db";

}
