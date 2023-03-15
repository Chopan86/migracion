/**
 * 
 */
package cl.tchile.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.apache.axis.types.UnsignedShort;

/**
 * UnsignedShortAdapter
 *
 */
public class UnsignedShortAdapter extends XmlAdapter<Short, UnsignedShort> {

	@Override
	public UnsignedShort unmarshal(Short v) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Short marshal(UnsignedShort v) throws Exception {
		if(v == null){            
			return null;        
		}        
		return v.shortValue();
	}
	
}
