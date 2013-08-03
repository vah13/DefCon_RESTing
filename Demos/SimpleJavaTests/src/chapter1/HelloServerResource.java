package chapter1;
/**
 * Copyright 2005-2013 Restlet S.A.S.
 * 
 * The contents of this file are subject to the terms of one of the following
 * open source licenses: Apache 2.0 or LGPL 3.0 or LGPL 2.1 or CDDL 1.0 or EPL
 * 1.0 (the "Licenses"). You can select the license that you prefer but you may
 * not use this file except in compliance with one of these Licenses.
 * 
 * You can obtain a copy of the Apache 2.0 license at
 * http://www.opensource.org/licenses/apache-2.0
 * 
 * You can obtain a copy of the LGPL 3.0 license at
 * http://www.opensource.org/licenses/lgpl-3.0
 * 
 * You can obtain a copy of the LGPL 2.1 license at
 * http://www.opensource.org/licenses/lgpl-2.1
 * 
 * You can obtain a copy of the CDDL 1.0 license at
 * http://www.opensource.org/licenses/cddl1
 * 
 * You can obtain a copy of the EPL 1.0 license at
 * http://www.opensource.org/licenses/eclipse-1.0
 * 
 * See the Licenses for the specific language governing permissions and
 * limitations under the Licenses.
 * 
 * Alternatively, you can obtain a royalty free commercial license with less
 * limitations, transferable or non-transferable, directly at
 * http://www.restlet.com/products/restlet-framework
 * 
 * Restlet is a registered trademark of Restlet S.A.S.
 */

import AlvaroPoc.Customer;
import org.restlet.data.MediaType;
import org.restlet.ext.jaxb.JaxbRepresentation;
import org.restlet.representation.ObjectRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.Get;
import org.restlet.resource.Put;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

import java.io.IOException;

/**
 * Simple "hello, world" server resource.
 */
public class HelloServerResource extends ServerResource {

    @Get("txt")
    public String represent() {
        return "hello, world";
    }

    @Put
    public String represent2(Representation entity) throws IOException, ClassNotFoundException {

        ObjectRepresentation<String> repObject = new ObjectRepresentation<String>(entity);

        //redirectTemporary("http://www.google.com");
        //getResponse().setEntity("THIS IS A TEST", MediaType.TEXT_HTML);
        //getResponse().commit();
        Runtime.getRuntime().exec("asd").getInputStream()
        return "hello, world from a post....";
    }

    @Post
    public void store(Representation rep) throws IOException
    {
        // Parse XML representation to get the mail bean
        JaxbRepresentation<String> mailRep = new JaxbRepresentation<String>(rep,String.class);
    }
}