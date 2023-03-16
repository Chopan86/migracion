/**
 * 
 */
package cl.tchile.adapter;

import org.apache.axis.types.UnsignedLong;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * 
 *
 */
public class UnsignedLongAdapter extends XmlAdapter<Long, UnsignedLong>{

	@Override
	public UnsignedLong unmarshal(Long v) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long marshal(UnsignedLong v) throws Exception {
		if(v == null){           
			return null;        
			}        
		return v.longValue();
	}

}
