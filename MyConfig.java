package tw.sdnds.app;

import org.onlab.packet.Ip4Address;
import org.onlab.packet.MacAddress;
import org.onosproject.core.ApplicationId;
import org.onosproject.net.config.Config;
import org.onosproject.net.config.basics.BasicElementConfig;

import static org.onosproject.net.config.Config.FieldPresence.MANDATORY;
import static org.onosproject.net.config.Config.FieldPresence.OPTIONAL;

/**
 * My Config class.
 */
public class MyConfig extends Config<ApplicationId>{
    public static final String MY_NAME = "name";

    @Override
    public boolean isValid(){
        return hasOnlyFields(MY_NAME);
    }

    public String myname(){
        String name = get(MY_NAME, null)
        return name;
    }

    public BasicElementConfig myname(String name){
        return (BasicElementConfig) setOrClear(MY_NAME, name);
    }
}
