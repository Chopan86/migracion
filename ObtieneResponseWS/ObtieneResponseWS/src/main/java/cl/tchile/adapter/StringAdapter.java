/**
 * 
 */
package cl.tchile.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * 
 *
 */
public class StringAdapter extends XmlAdapter<String, String>{

	@Override
	public String unmarshal(String v) throws Exception {
		// TODO Auto-generated method stub
		return v.trim();
	}

	@Override
	public String marshal(String v) throws Exception {
		if(v == null){           
			return null;        
			}        
		return v.trim();
	}

}
