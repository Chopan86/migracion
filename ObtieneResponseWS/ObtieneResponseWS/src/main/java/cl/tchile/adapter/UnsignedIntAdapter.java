/**
 * 
 */
package cl.tchile.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.apache.axis.types.UnsignedInt;

/**
 * 
 *
 */
public class UnsignedIntAdapter extends XmlAdapter<Long, UnsignedInt>{

	@Override
	public UnsignedInt unmarshal(Long v) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long marshal(UnsignedInt v) throws Exception {
		if(v == null){           
			return null;        
			}        
		return v.longValue();
	}

}
