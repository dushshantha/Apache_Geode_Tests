import org.apache.geode.cache.Region;
import org.apache.geode.cache.client.ClientCache;
import org.apache.geode.cache.client.ClientCacheFactory;
import org.apache.geode.cache.client.ClientRegionFactory;
import org.apache.geode.cache.client.ClientRegionShortcut;

public class TestGeode {

    public static void main(String args[]){
        ClientCacheFactory cf =  new ClientCacheFactory().addPoolLocator( "localhost", 10334);
        ClientCache cache = cf.setPdxReadSerialized( true).create();

        ClientRegionFactory rf = cache.createClientRegionFactory(ClientRegionShortcut.PROXY);

        Region region = rf.create( "Customer");
        region.

        region.put( "1", "Testing123");

        System.out.println(region.get("1"));
    }
}
