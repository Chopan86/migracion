package cl.tchile.app.helper;

import cl.movistar.queryproduct.queryproduct.QueryproductBindingStub;
import cl.tch.unifica.fe.services.consultaclienterutlineac.AWLC02WSHTTPSoapBindingStub;
import cl.tch.unifica.services.consultapsprincipaleslineas.ACCPSPWSHTTPSoapBindingStub;
import cl.tchile.vo.EndPointDataVO;
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

}
