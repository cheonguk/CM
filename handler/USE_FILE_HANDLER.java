package changeminer.HandlerForUSA;

import com.itplus.cm.ce.addon.common.custom.HandlerForUSA;
import com.itplus.cm.ce.internal.meta.CM_OBJ_DPD;
import com.itplus.cm.ce.internal.meta.CM_SRC;
import com.itplus.cm.ce.util.FileUtil;

public class USE_FILE_HANDLER  extends HandlerForUSA
{
    /**
     * 
     */
    private static final long serialVersionUID = -55824611275612863L;


   /**
	*
	**/
    public USE_FILE_HANDLER()
    {
    }
    
    /** 
     * generate DPD.
     * 
     * 
     */
    public boolean generateDPD(String PREFIX, CM_SRC cm_src, CM_OBJ_DPD cm_obj_dpd) {
        boolean is_sql = false;
        if( cm_obj_dpd.getDPD_TYPE_ID() == 9502002)
        {
        	cm_obj_dpd.setGID(FileUtil.getGID("<FILE>", cm_obj_dpd.getCALL_TARGET()));
        }
        
        return is_sql;
    }
}
