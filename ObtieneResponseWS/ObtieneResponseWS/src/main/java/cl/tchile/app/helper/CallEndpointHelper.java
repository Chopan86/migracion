package cl.tchile.app.helper;

import cl.movistar.queryproduct.queryproduct.QueryproductBindingStub;

import cl.tchile.vo.EndPointDataVO;
import com.ACCPSPWI.ACCPSPWS.www.ACCPSPWSHTTPSoapBindingStub;
import com.APEWS16I.APE9016.www.APE9016HTTPSoapBindingStub;
import com.AWLC02WI.AWLC02WS.www.AWLC02WSHTTPSoapBindingStub;
import com.AWMLIP8I.AWLIW8CO.www.AWLIW8COHTTPSoapBindingStub;
import com.AWPS01WI.AWPS01WS.www.AWPS01WSHTTPSoapBindingStub;
import com.AWPSL2WI.AWPSL2WS.www.AWPSL2WSHTTPSoapBindingStub;
import com.WSPMS.APELAFAC.www.APELAFACHTTPSoapBindingStub;
import org.apache.axis.AxisFault;
import org.springframework.stereotype.Component;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * callEndpointHelper
 */
@Component
public class CallEndpointHelper {

    /**
     * @param endPointDataVO clase con los parametros
     * @return stub AWLC02WSHTTPSoapBindingStub
     */
    public AWLC02WSHTTPSoapBindingStub callEndPointSoapStub(EndPointDataVO endPointDataVO)
        throws InstantiationException, IllegalAccessException, AxisFault, ClassNotFoundException,
        MalformedURLException {
        URL endpointURL = new URL(endPointDataVO.getEndPointUrl());
        String timeOut = endPointDataVO.getTimeOut();
        String servlocator = endPointDataVO.getServLocator();
        Class<?> servicelocator = Class.forName(servlocator);
        org.apache.axis.client.Service service = (org.apache.axis.client.Service) servicelocator.newInstance();
        AWLC02WSHTTPSoapBindingStub stub = new AWLC02WSHTTPSoapBindingStub(endpointURL, service);
        stub.setTimeout(Integer.parseInt(timeOut));
        return stub;
    }

    public ACCPSPWSHTTPSoapBindingStub callEndPointSoapStubLineasPrincipales(EndPointDataVO endPointDataVO)
        throws InstantiationException, IllegalAccessException, AxisFault, ClassNotFoundException,
        MalformedURLException {
        URL endpointURL = new URL(endPointDataVO.getEndPointUrl());
        String timeOut = endPointDataVO.getTimeOut();
        String servlocator = endPointDataVO.getServLocator();
        Class<?> servicelocator = Class.forName(servlocator);
        org.apache.axis.client.Service service = (org.apache.axis.client.Service) servicelocator.newInstance();
        ACCPSPWSHTTPSoapBindingStub stub = new ACCPSPWSHTTPSoapBindingStub(endpointURL, service);
        stub.setTimeout(Integer.parseInt(timeOut));
        return stub;
    }

    public AWPS01WSHTTPSoapBindingStub callEndPointSoapStubConsultaPorLinea(EndPointDataVO endPointDataVO)
        throws InstantiationException, IllegalAccessException, AxisFault, ClassNotFoundException,
        MalformedURLException {
        URL endpointURL = new URL(endPointDataVO.getEndPointUrl());
        String timeOut = endPointDataVO.getTimeOut();
        String servlocator = endPointDataVO.getServLocator();
        Class<?> servicelocator = Class.forName(servlocator);
        org.apache.axis.client.Service service = (org.apache.axis.client.Service) servicelocator.newInstance();
        AWPS01WSHTTPSoapBindingStub stub = new AWPS01WSHTTPSoapBindingStub(endpointURL, service);
        stub.setTimeout(Integer.parseInt(timeOut));
        return stub;
    }
    public APE9016HTTPSoapBindingStub callEndPointSoapStubConsultaApelAlturas(EndPointDataVO endPointDataVO)
        throws InstantiationException, IllegalAccessException, AxisFault, ClassNotFoundException,
        MalformedURLException {
        URL endpointURL = new URL(endPointDataVO.getEndPointUrl());
        String timeOut = endPointDataVO.getTimeOut();
        String servlocator = endPointDataVO.getServLocator();
        Class<?> servicelocator = Class.forName(servlocator);
        org.apache.axis.client.Service service = (org.apache.axis.client.Service) servicelocator.newInstance();
        APE9016HTTPSoapBindingStub stub = new APE9016HTTPSoapBindingStub(endpointURL, service);
        stub.setTimeout(Integer.parseInt(timeOut));
        return stub;
    }

    public AWPSL2WSHTTPSoapBindingStub callEndPointSoapStubLienasPsFrontEnd(EndPointDataVO endPointDataVO)
        throws InstantiationException, IllegalAccessException, AxisFault, ClassNotFoundException,
        MalformedURLException {
        URL endpointURL = new URL(endPointDataVO.getEndPointUrl());
        String timeOut = endPointDataVO.getTimeOut();
        String servlocator = endPointDataVO.getServLocator();
        Class<?> servicelocator = Class.forName(servlocator);
        org.apache.axis.client.Service service = (org.apache.axis.client.Service) servicelocator.newInstance();
        AWPSL2WSHTTPSoapBindingStub stub = new AWPSL2WSHTTPSoapBindingStub(endpointURL, service);
        stub.setTimeout(Integer.parseInt(timeOut));
        return stub;
    }

    public QueryproductBindingStub callEndPointSoapStubQueryProducts(EndPointDataVO endPointDataVO)
        throws InstantiationException, IllegalAccessException, AxisFault, ClassNotFoundException,
        MalformedURLException {
        URL endpointURL = new URL(endPointDataVO.getEndPointUrl());
        String timeOut = endPointDataVO.getTimeOut();
        String servlocator = endPointDataVO.getServLocator();
        Class<?> servicelocator = Class.forName(servlocator);
        org.apache.axis.client.Service service = (org.apache.axis.client.Service) servicelocator.newInstance();
        QueryproductBindingStub stub = new QueryproductBindingStub(endpointURL, service);
        stub.setTimeout(Integer.parseInt(timeOut));
        return stub;
    }
    public APELAFACHTTPSoapBindingStub callEndPointSoapStubAfac(EndPointDataVO endPointDataVO)
        throws InstantiationException, IllegalAccessException, AxisFault, ClassNotFoundException,
        MalformedURLException {
        URL endpointURL = new URL(endPointDataVO.getEndPointUrl());
        String timeOut = endPointDataVO.getTimeOut();
        String servlocator = endPointDataVO.getServLocator();
        Class<?> servicelocator = Class.forName(servlocator);
        org.apache.axis.client.Service service = (org.apache.axis.client.Service) servicelocator.newInstance();
        APELAFACHTTPSoapBindingStub stub = new APELAFACHTTPSoapBindingStub(endpointURL, service);
        stub.setTimeout(Integer.parseInt(timeOut));
        return stub;
    }

    public AWLIW8COHTTPSoapBindingStub callEndPointSoapStubConsultaListaPsLineaV8(EndPointDataVO endPointDataVO)
        throws InstantiationException, IllegalAccessException, AxisFault, ClassNotFoundException,
        MalformedURLException {
        URL endpointURL = new URL(endPointDataVO.getEndPointUrl());
        String timeOut = endPointDataVO.getTimeOut();
        String servlocator = endPointDataVO.getServLocator();
        Class<?> servicelocator = Class.forName(servlocator);
        org.apache.axis.client.Service service = (org.apache.axis.client.Service) servicelocator.newInstance();
        AWLIW8COHTTPSoapBindingStub stub = new AWLIW8COHTTPSoapBindingStub(endpointURL, service);
        stub.setTimeout(Integer.parseInt(timeOut));
        return stub;
    }

}
